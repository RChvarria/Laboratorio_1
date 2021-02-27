package Mundo;

public class Persona {
	
	//Atributos_
	protected String nombre;
	protected String apellido;
	protected int edad;

	//Constructor
	public Persona(String pNombre, String pApellido, int pEdad) {
		nombre = pNombre;
		apellido = pApellido;
		edad = pEdad;
	}

	//Medotos_Get
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}

}
