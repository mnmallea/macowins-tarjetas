import externo.VisaHomeLibrary;

public class Visa extends Tarjeta{
	public void cobrar(Cliente cliente, Double unMonto) {
		VisaHomeLibrary.cobrar(cliente.getDni(), cliente.getNombre(), cliente.getApellido(), unMonto, this.getNumero(), this.getPin());
	}
}
