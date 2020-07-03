package mx.uv.Aerolinea;

import Controlador.AsientoController;
import Controlador.BoletoController;
import Controlador.ViajeController;
import Modelo.Asientos;
import Modelo.Boletos;
import Modelo.Viajes;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.example.aerolinea.CancelarBoletoRequest;
import org.example.aerolinea.CancelarBoletoResponse;
import org.example.aerolinea.ConsultarViajeRequest;
import org.example.aerolinea.ConsultarViajeResponse;
import org.example.aerolinea.SeleccionarAsientoRequest;
import org.example.aerolinea.SeleccionarAsientoResponse;
import org.example.aerolinea.SeleccionarViajeRequest;
import org.example.aerolinea.SeleccionarViajeResponse;
import java.util.ArrayList;

@org.springframework.ws.server.endpoint.annotation.Endpoint
public class Endpoint {
	@PayloadRoot(namespace = "http://www.example.org/Aerolinea", localPart = "ConsultarViajeRequest")

	@ResponsePayload
	public ConsultarViajeResponse getConsultarViaje(@RequestPayload ConsultarViajeRequest peticion) {
		ConsultarViajeResponse respuesta = new ConsultarViajeResponse();

		ViajeController vc = new ViajeController();
		ArrayList<Viajes> li = vc.consultaViaje(peticion.getOrigen(), peticion.getDestino(), peticion.getFecha());
		ArrayList<ConsultarViajeResponse.Viaje> lr = new ArrayList<ConsultarViajeResponse.Viaje>();

		if (li.size() != 0) {
			for (Viajes v : li) {
				ConsultarViajeResponse.Viaje temp = new ConsultarViajeResponse.Viaje();
				temp.setIdViaje(v.getIdViaje());
				temp.setHora(v.getHora());
				temp.setPrecio(v.getPrecio());
				lr.add(temp);
			}
			respuesta.getViaje().addAll(lr);
		}
		return respuesta;
	}

	@PayloadRoot(namespace = "http://www.example.org/Aerolinea", localPart = "SeleccionarViajeRequest")
	@ResponsePayload
	public SeleccionarViajeResponse getSeleccionarViaje(@RequestPayload SeleccionarViajeRequest peticion) {
		SeleccionarViajeResponse respuesta = new SeleccionarViajeResponse();

		AsientoController ac = new AsientoController();
		ArrayList<Asientos> li = ac.consultarAsientos(peticion.getIdViaje());
		ArrayList<SeleccionarViajeResponse.Asiento> lr = new ArrayList<SeleccionarViajeResponse.Asiento>();

		if (li.size() != 0) {
			for (Asientos a : li) {
				SeleccionarViajeResponse.Asiento temp = new SeleccionarViajeResponse.Asiento();
				temp.setIdAsiento(a.getAsiento());
				lr.add(temp);
			}
			respuesta.setIdViaje(peticion.getIdViaje());
			respuesta.getAsiento().addAll(lr);
		}
		return respuesta;
	}

	@PayloadRoot(namespace = "http://www.example.org/Aerolinea", localPart = "SeleccionarAsientoRequest")
	@ResponsePayload
	public SeleccionarAsientoResponse getSeleccionarAsiento(@RequestPayload SeleccionarAsientoRequest peticion) {
		SeleccionarAsientoResponse respuesta = new SeleccionarAsientoResponse();

		BoletoController bc = new BoletoController();
		Boletos boleto = bc.crearBoleto(peticion.getIdViaje(), peticion.getAsiento(), peticion.getPasajero(),
				peticion.getCliente());
		SeleccionarAsientoResponse.Boleto bol = new SeleccionarAsientoResponse.Boleto();
		if (boleto != null) {
			bol.setIdBoleto(boleto.getIdBoleto());
			bol.setOrigen(boleto.getOrigen());
			bol.setDestino(boleto.getDestino());
			bol.setFecha(boleto.getFecha());
			bol.setHora(boleto.getHora());
			bol.setPrecio(boleto.getPrecio());
			bol.setPasajero(boleto.getPasajero());
			bol.setAsiento(boleto.getAsiento());
			respuesta.setBoleto(bol);
		} else {
			respuesta.setBoleto(null);
		}
		return respuesta;
	}

	@PayloadRoot(namespace = "http://www.example.org/Aerolinea", localPart = "CancelarBoletoRequest")
	@ResponsePayload
	public CancelarBoletoResponse getCancelarBoleto(@RequestPayload CancelarBoletoRequest peticion) {
		CancelarBoletoResponse respuesta = new CancelarBoletoResponse();

		BoletoController bc = new BoletoController();
		if (bc.cancelarBoleto(peticion.getIdBoleto(), peticion.getCliente())) {
			respuesta.setCheckout(true);
		} else {
			respuesta.setCheckout(false);
		}
		return respuesta;
	}
}
