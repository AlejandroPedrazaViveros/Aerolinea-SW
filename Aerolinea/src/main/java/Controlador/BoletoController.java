package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import Conexion.ConexionBD;
import Modelo.Boletos;
import Modelo.Viajes;

public class BoletoController {
	private int idBoleto;
	private String origen;
	private String destino;
	private String fecha;
	private String hora;
	private int precio;
	private String pasajero;
	private int asiento;
	private String cliente;

	ConexionBD conexion = new ConexionBD();

	ResultSet rs;
	ResultSet rs2;

	String sql;

	public BoletoController() {
	}

	public BoletoController(int idBoleto, String origen, String destino, String fecha, String hora, int precio,
			String pasajero, int asiento, String cliente) {
		this.idBoleto = idBoleto;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.hora = hora;
		this.precio = precio;
		this.pasajero = pasajero;
		this.asiento = asiento;
		this.cliente = cliente;
	}

	public int getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getPasajero() {
		return pasajero;
	}

	public void setPasajero(String pasajero) {
		this.pasajero = pasajero;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public String getCiente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public Boletos crearBoleto(String idViaje, int asiento, String pasajero, String cliente) {
		Boletos boleto = null;
		try {
			// consulta Viajes para recuperar valores del origen, destino, fecha, hora y precio
			ViajeController vc = new ViajeController();
			Viajes viaje = vc.getDatosViaje(idViaje);
			if (viaje.getOrigen() != null && viaje.getDestino() != null) {
				// Creo nuevo boleto en la base de datos
				sql = "INSERT INTO boletos(idBoleto,Origen,Destino,Fecha,Hora,Precio,Pasajero,Asiento,Cliente) VALUES(NULL,'"
						+ viaje.getOrigen() + "','" + viaje.getDestino() + "','" + viaje.getFecha() + "','"
						+ viaje.getHora() + "','" + viaje.getPrecio() + "','" + pasajero + "','" + asiento + "','"
						+ cliente + "')";
				conexion.getConexion().createStatement().execute(sql);

				// consulta a bd Boletos para recuperar el boleto nuevo
				sql = "SELECT * FROM boletos WHERE Pasajero='" + pasajero + "' AND Asiento='" + asiento + "'";
				rs = conexion.getConexion().createStatement().executeQuery(sql);
				if (rs.next()) {
					boleto = new Boletos();
					boleto.setIdBoleto(rs.getInt(1));
					boleto.setOrigen(rs.getString(2));
					boleto.setDestino(rs.getString(3));
					boleto.setFecha(rs.getString(4));
					boleto.setHora(rs.getString(5));
					boleto.setPrecio(rs.getInt(6));
					boleto.setPasajero(rs.getString(7));
					boleto.setAsiento(rs.getInt(8));
				}
				// actualizacion de datos de los asientos
				AsientoController ac = new AsientoController();
				ac.ocuparAsiento(viaje.getIdViaje(), boleto.getIdBoleto(), boleto.getAsiento());
			}
			return boleto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean cancelarBoleto(int idBoleto, String cliente) {
		boolean bandera = false;
		try {
			sql = "SELECT * From Boletos WHERE idBoleto='" + idBoleto + "' AND Cliente='" + cliente + "'";
			rs = conexion.getConexion().createStatement().executeQuery(sql);
			if (rs.next()) {
				sql = "DELETE FROM Boletos WHERE idBoleto='" + idBoleto + "' AND Cliente='" + cliente + "'";
				conexion.getConexion().createStatement().execute(sql);
				// Desocupamos el asiento que tenia
				AsientoController a = new AsientoController();
				a.desocuparAsiento(idBoleto);
				bandera = true;
			} else {
				bandera = false;
			}
			return bandera;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
