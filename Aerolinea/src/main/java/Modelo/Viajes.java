package Modelo;

import Conexion.ConexionBD;

public class Viajes {

    private ConexionBD conexion;

    private String idViaje;
    private String Origen;
    private String Destino;
    private String Fecha;
    private String Hora;
    private int Precio;

    public Viajes() {
    }

    public Viajes(String idViaje, String Origen, String Destino, String Fecha, String Hora, int Precio) {
        this.idViaje = idViaje;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Precio = Precio;
    }

    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
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

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Viaje{" + "conexion=" + conexion + ", idViaje=" + idViaje + ", Origen=" + Origen + ", Destino=" + Destino + ", Fecha=" + Fecha + ", Hora=" + Hora + ", Precio=" + Precio + '}';
    }
}
