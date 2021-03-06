package mx.uv.Aerolinea;

import org.example.aerolinea.CancelarReservacionRequest;
import org.example.aerolinea.CancelarReservacionResponse;
import org.example.aerolinea.ModificarDatosRequest;
import org.example.aerolinea.ModificarDatosResponse;
import org.example.aerolinea.ReservarVueloRequest;
import org.example.aerolinea.ReservarVueloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.Aerolinea.DTO.ReservarVuelo;
import mx.uv.Aerolinea.Repositorio.IReservarVuelo;

@Endpoint
public class EndPoint {
	
	@Autowired
	private IReservarVuelo iReservarVuelo;
	
	@PayloadRoot(namespace = "http://www.example.org/Aerolinea", localPart = "ReservarVueloRequest")
	
	@ResponsePayload
	public ReservarVueloResponse geReservarVuelo(@RequestPayload ReservarVueloRequest peticion) {
		ReservarVueloResponse respuesta = new ReservarVueloResponse();
		
		respuesta.setConfirmar("El nombre del pasajero es: " + peticion.getPasajero() 
		+ " El lugar de salida es: " + peticion.getSalida() 
		+ " El destino seleccionado es: " + peticion.getDestino()
		+ " La fecha de salida de su vuelo es: " + peticion.getFecha()
		+ " La hora de salida de su vuelo es a las: " + peticion.getHora()
		+ " Su asiento seleccionado es el: " + peticion.getAsiento()
		+ " El numero de su boleto es: " + peticion.getBoleto());
		
		//INSERTAR EN LA BASE DE DATOS
		ReservarVuelo reservarVuelo = new ReservarVuelo();
		reservarVuelo.setPasajero(peticion.getPasajero());
		reservarVuelo.setSalida(peticion.getSalida());
		reservarVuelo.setDestino(peticion.getDestino());
		reservarVuelo.setFecha(peticion.getFecha());
		reservarVuelo.setHora(peticion.getHora());
		reservarVuelo.setAsiento(peticion.getAsiento());
		reservarVuelo.setBoleto(peticion.getBoleto());
		
		iReservarVuelo.save(reservarVuelo);
		
		return respuesta;
	}
	
	@PayloadRoot(namespace = "http://www.example.org/Aerolinea", localPart = "CancelarReservacionRequest")
	
	@ResponsePayload
	public CancelarReservacionResponse geCancelarReservacion(@RequestPayload CancelarReservacionRequest peticion) {
		CancelarReservacionResponse respuesta = new CancelarReservacionResponse();
		respuesta.setCancelado("Su reservacion del boleto: " + peticion.getBoleto() +  " ha sido cancelada");
		
		return respuesta;
	}
	
}
