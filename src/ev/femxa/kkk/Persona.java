package ev.femxa.kkk;

public class Persona {

	/**
	 * Ponemos los atributos de persona Edad, Nombre
	 */
	
	private int edad;
	private String Nombre;
	
	public Persona()
	{
		//Constructor por defecto
	}
	
	/*
	 * Constructor usando parametros
	 */
	
	public Persona (String nombre, int edad)
	{
		this.edad=edad;
		this.Nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
