package Controlador;

import Conexion.ConexionBD;
import Modelo.Viajes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViajeController {

	private String Origen;
	private String Destino;
	private String Fecha;

	ConexionBD conexion = new ConexionBD();
	ResultSet rs;
	String sql;

	public ViajeController() {
	}

	public ViajeController(String Origen, String Destino, String Fecha) {
		this.Origen = Origen;
		this.Destino = Destino;
		this.Fecha = Fecha;
	}

	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String Origen) {
		this.Origen = Origen;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String Destino) {
		this.Destino = Destino;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String Fecha) {
		this.Fecha = Fecha;
	}

	// Busca todos los viajes que estan en un origen, destino y fecha determinada
	public ArrayList<Viajes> consultaViaje(String origen, String destino, String fecha) {
		ArrayList<Viajes> encontrados = new ArrayList<Viajes>();
		try {
			sql = "SELECT * FROM viajes WHERE Origen='" + origen + "' AND Destino='" + destino + "' AND Fecha='" + fecha
					+ "'";
			rs = conexion.getConexion().createStatement().executeQuery(sql);
			while (rs.next()) {
				encontrados.add(new Viajes(rs.getString("idviaje"), rs.getString("origen"), rs.getString("destino"),
						rs.getString("Fecha"), rs.getString("Hora"), rs.getInt("Precio")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return encontrados;
	}

	public Viajes getDatosViaje(String idViaje) {
		Viajes viaje = new Viajes();
		try {
			sql = "SELECT * FROM Viajes WHERE idViaje='" + idViaje + "'";
			rs = conexion.getConexion().createStatement().executeQuery(sql);
			if (rs.next()) {
				viaje.setIdViaje(rs.getString("idViaje"));
				viaje.setOrigen(rs.getString("Origen"));
				viaje.setDestino(rs.getString("Destino"));
				viaje.setFecha(rs.getString("Fecha"));
				viaje.setHora(rs.getString("Hora"));
				viaje.setPrecio(rs.getInt("Precio"));
			}
			return viaje;
		} catch (SQLException ex) {
			Logger.getLogger(ViajeController.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

}

