package Modelo;

public class Asientos {

	private int idAsiento;
	private String idViaje;
	private int idboleto;
	private int asiento;
	private int estatus;

	public Asientos() {
	}

	public Asientos(int idAsiento, String idViaje, int idboleto, int asiento, int estatus) {
		super();
		this.idAsiento = idAsiento;
		this.idViaje = idViaje;
		this.idboleto = idboleto;
		this.asiento = asiento;
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

	public int getIdboleto() {
		return idboleto;
	}

	public void setIdboleto(int idboleto) {
		this.idboleto = idboleto;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Asiento [idAsiento=" + idAsiento + ", idViaje=" + idViaje + ", idboleto=" + idboleto + ", asiento="
				+ asiento + ", estatus=" + estatus + "]";
	}

}
