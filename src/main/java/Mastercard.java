import externo.MasterLibrary;
import externo.TarjetaDto;

public class Mastercard extends Tarjeta{
	public void cobrar(Cliente cliente, Double unMonto) {
		TarjetaDto tarjetaDto = new TarjetaDto();
		tarjetaDto.setNumero(this.getNumero());
		tarjetaDto.setPin(this.getPin());
		MasterLibrary.cargarVentaWs(cliente.getNombre().concat(cliente.getApellido()), tarjetaDto);
	}
}
