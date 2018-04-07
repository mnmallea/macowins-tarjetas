//creamos nuestra clase tarjeta porque TarjetaDto puede ser modificado
//y entonces capaz que un dia alguien lo cambia y ya no me sirve
//lo externo es un codigo que vive lejos y seguramente esta compilado
//y yo no lo puedo tocar


//code ownership: propietario del codigo puede hacer lo que le pinte
//el codigo de mastercard es de mastercard: es muy importante no acoplarse
//a algo de lo que yo no tengo el code ownership

//ley de demeter: no hables con el amigo del amigo, habla con el que conoces

//hacerlo por composicion (Tarjeta tiene un tipo) es mas complejo,
//en este caso no me sirve de mucho porque no cambia el tipo
//entonces es mas simple que Tarjeta pueda ser Visa o Mastercard (herencia)


//la abstraccion de la tarjeta es una buena abstraccion en este caso

//tarjeta mastercard esta acoplado a la master library
//pero es preferible hacer esto a que se acople el resto de mi sistema

public abstract class Tarjeta {
	private String numero;
	private String pin;
	private EmpresaTarjeta empresa;
	
	public EmpresaTarjeta getEmpresa() {
		return empresa;
	}
	
	public String getNumero() {
		return numero;
	}
	public String getPin() {
		return pin;
	}
	public abstract void cobrar(Cliente cliente, Double unMonto);
	
}
