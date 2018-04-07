public class Venta {

	private Cliente cliente;

	public void cobrar(Double unMonto, Tarjeta unaTarjeta) {
		unaTarjeta.cobrar(this.cliente, unMonto);
	}
	
	

}
