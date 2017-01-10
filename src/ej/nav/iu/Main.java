package ej.nav.iu;

import java.util.Scanner;

//Hacer una clase main que use las dos clases de ejernavi
//Insertamos 2 personas
//Buscamos a una y si es igual la mostramos.

public class Main {
	
	/**
	 * Metodo main principal sirve para que al introducir dos nombres y la edad en una lista
	 * luego dandole otro nombre diga si esta o no esta en la lista creada
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) 
	{	//TODO Crear un escaner para que la persona pueda meter su nombre y edad 
		
		ListaPersonas listaPer =new ListaPersonas();
		
		/*Scanner scanner =null;
		scanner =new Scanner (System.in);

		Persona persona1 =new Persona();
		persona1=
				
		Persona persona2 =new Persona();
		persona2= scanner.*/
		
		
		Persona persona1 =new Persona("PEPE", 16);
		listaPer.insertarPersona(persona1);
		
		Persona persona2 =new Persona("MIKE", 25);
		listaPer.insertarPersona(persona2);
		
		int resultado_buscar = listaPer.buscarPersonaPos("MIKE") ;
			
				
		if (resultado_buscar == -5)
		{
			System.out.println("La persona buscada no esta disponible");
		}
		else
		{
			System.out.println("La pesona buscada si se ha encontrado en la posicion : " + resultado_buscar);
			Persona personaMostrada = listaPer.obtenerPersona(resultado_buscar);
			personaMostrada.mostrarPersona();
		}
	
		
		
		
	}
		
	
}
	
	

