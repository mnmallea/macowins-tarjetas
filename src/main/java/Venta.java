import externo.*;

public class Venta {

	private Cliente cliente;

	public void cobrar(double unMonto, Tarjeta unaTarjeta) {
		VisaHomeLibrary.cobrar(cliente.getDni(), cliente.getNombre(), cliente.getApellido(), unMonto, unaTarjeta.getNumero(), unaTarjeta.getPin());
	}

}
