package REST;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.example.aerolinea.ConsultarViajeResponse;
import org.example.aerolinea.ConsultarViajeResponse.Viaje;
import org.example.aerolinea.SeleccionarViajeResponse.Asiento;
import org.example.aerolinea.SeleccionarAsientoResponse.Boleto;
import org.example.aerolinea.SeleccionarViajeResponse;
import Controlador.AsientoController;
import Controlador.BoletoController;
import Controlador.ViajeController;
import Modelo.Asientos;
import Modelo.Boletos;
import Modelo.Viajes;

@RestController
public class Rest {
	
	@GetMapping("/rest/viajes/{origen}/{destino}/{fecha}")
	public ArrayList<Viaje> consultarViaje(@PathVariable String origen, @PathVariable String destino,
			@PathVariable String fecha) {
		ViajeController vc = new ViajeController();
		ArrayList<Viajes> li = vc.consultaViaje(origen, destino, fecha);
		ArrayList<Viaje> lr = new ArrayList<Viaje>();
		if (li.size() != 0) {
			for (Viajes v : li) {
				Viaje temp = new Viaje();
				temp.setIdViaje(v.getIdViaje());
				temp.setHora(v.getHora());
				temp.setPrecio(v.getPrecio());
				lr.add(temp);
			}
		}
		return lr;
	}

	@GetMapping("/rest/asientos/{idviaje}")
	public ArrayList<Asiento> SeleccionarViaje(@PathVariable String idviaje) {
		AsientoController ac = new AsientoController();
		ArrayList<Asientos> li = ac.consultarAsientos(idviaje);
		ArrayList<Asiento> lr = new ArrayList<Asiento>();
		if (li.size() != 0) {
			for (Asientos a : li) {
				SeleccionarViajeResponse.Asiento temp = new SeleccionarViajeResponse.Asiento();
				temp.setIdAsiento(a.getAsiento());
				lr.add(temp);
			}
		}
		return lr;
	}

	@GetMapping("/rest/compra/{idviaje}/{asiento}/{pasajero}/{cliente}")
	public Boleto SeleccionarAsiento(@PathVariable String idviaje, @PathVariable int asiento,
			@PathVariable String pasajero, @PathVariable String cliente) {
		BoletoController bc = new BoletoController();
		Boletos boleto = bc.crearBoleto(idviaje, asiento, pasajero, cliente);
		Boleto bol = new Boleto();
		if (boleto != null) {
			bol.setIdBoleto(boleto.getIdBoleto());
			bol.setOrigen(boleto.getOrigen());
			bol.setDestino(boleto.getDestino());
			bol.setFecha(boleto.getFecha());
			bol.setHora(boleto.getHora());
			bol.setPrecio(boleto.getPrecio());
			bol.setPasajero(boleto.getPasajero());
			bol.setAsiento(boleto.getAsiento());	
		}else {
			bol = null;
		}
		return bol;
	}

	@GetMapping("/rest/boleto/{idboleto}/{cliente}")
	public Boleto VerBoleto(@PathVariable int idboleto, @PathVariable String cliente) {
		BoletoController bc = new BoletoController();
		Boletos boleto = bc.verBoleto(cliente);
		Boleto bol = new Boleto();
		if (boleto != null) {
			bol.setIdBoleto(boleto.getIdBoleto());
			bol.setOrigen(boleto.getOrigen());
			bol.setDestino(boleto.getDestino());
			bol.setFecha(boleto.getFecha());
			bol.setHora(boleto.getHora());
			bol.setPrecio(boleto.getPrecio());
			bol.setPasajero(boleto.getPasajero());
			bol.setAsiento(boleto.getAsiento());
		}else {
			bol=null;
		}
		return bol;
	}

	@GetMapping("/rest/cancelar/{idboleto}/{cliente}")
	public boolean cancelarrBoleto(@PathVariable int idboleto,@PathVariable String cliente) {
		boolean respuesta = true;
		BoletoController bc = new BoletoController();
		if (bc.cancelarBoleto(idboleto, cliente)) {
			respuesta=true;
		} else {
			respuesta=false;
		}
		return respuesta;
	}
}
