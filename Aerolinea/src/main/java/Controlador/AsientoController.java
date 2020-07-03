package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Conexion.ConexionBD;
import Modelo.Asientos;

public class AsientoController {
	private int idAsiento;
	private String idViaje;
	private int estatus;

	ConexionBD conexion = new ConexionBD();
	ResultSet rs;
	String sql;

	public AsientoController() {
	}

	public AsientoController(int idAsiento, String idViaje, int estatus) {
		this.idAsiento = idAsiento;
		this.idViaje = idViaje;
		this.estatus = estatus;
	}

	public int getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}

	public String getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(String idViaje) {
		this.idViaje = idViaje;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public ArrayList<Asientos> consultarAsientos(String idViaje) {
		ArrayList<Asientos> encontrados = new ArrayList<Asientos>();
		try {
			sql = "SELECT * FROM asientos WHERE idViaje='" + idViaje + "' AND estatus='1'";
			ResultSet rs = conexion.getConexion().createStatement().executeQuery(sql);
			while (rs.next()) {
				encontrados.add(new Asientos(rs.getInt("idAsiento"),rs.getString("idViaje"),rs.getInt("idBoleto"),rs.getInt("Asiento"),rs.getInt("Estatus")));
			}
			return encontrados;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean ocuparAsiento(String idViaje, int idBoleto, int asiento) {
		try {
			sql = "UPDATE asientos SET estatus='0', idBoleto='" + idBoleto + "' WHERE idViaje='" + idViaje + "' AND Asiento='"+ asiento+"'";
			conexion.getConexion().createStatement().execute(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean desocuparAsiento(int idBoleto) {
		try {
			sql = "UPDATE asientos SET estatus='1', idBoleto=null WHERE idBoleto='" + idBoleto + "'";
			conexion.getConexion().createStatement().execute(sql);
			return true;
		} catch (SQLException e) {
			System.out.println("desocupar asiento");
			e.printStackTrace();
			return false;
		}
	}
}
