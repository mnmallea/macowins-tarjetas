package externo;

public class VisaHomeLibrary {

	public static boolean cobrar(String dni, String nombre, String apellido, Double monto, String numeroTarjeta, String ping){
		System.out.println("Conectando al sistema de VISA...");
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("Intentando conectar.... ");
				Thread.sleep(1000 * 5);
				System.out.println("Intento fallido....");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("Esto no anda, contrate una mejor internet");	
		return false;
	}

}
