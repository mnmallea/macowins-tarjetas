package externo;

public class MasterLibrary {
	public static int cargarVentaWs(String nombreYApellido, TarjetaDto tarjeta) {
		System.out.println("Connecting to Master system...");
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("Trying to connect.... ");
				Thread.sleep(1000 * 5);
				System.out.println("Retrying....");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("Impossible to stablish connection, try with another service");	

		return 0;
	}
}
