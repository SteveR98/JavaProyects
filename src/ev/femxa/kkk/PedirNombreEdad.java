package ev.femxa.kkk;

import java.util.Scanner;
/**
 * Crear dos metodos para escribir la edad y el nombre
 * @author alvar_000
 *
 */
public class PedirNombreEdad {

	public static String pedirNombre()
	{
		String nombre =null;
		Scanner nombresc =null;
		
		nombresc = new Scanner(System.in);
		nombre =  nombresc.toString();
		return nombre;
	}
	
	public static int pedirEdad()
	{
		int edad =0;
		Scanner edadsc =null;
		
		edadsc = new Scanner(System.in);
		edad =  edadsc.nextInt();
		return edad;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		int edad=this.edad;
		String nombre=this.Nombre;
		
	
	}
	
	
	
	
	
}
