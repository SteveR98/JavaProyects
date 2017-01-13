package edu.femx.fichero;

import java.util.Scanner;
/**
 * Para calcular la letra del DNI, hay un algoritmo, que consiste en obtener 
 * el resto de la división entera entre el número dni y 23.
 * Esto, nos da un número, cuya posición en la lista de caracteres dada, representa la letra del DNI.
 * AYUDA: Usad el código que se adjunta como base de la solución
 * @author alvar_000
 *
 */
public class LetraDNI {

public static String caracteresDNI = "TRWAGMYFPDXBNJZSQVHLCKE";


public static int pedirNumeros ()

{	int numeros =0;

	Scanner leer = null;
	leer =new Scanner(System.in);  
	
	System.out.println("Introduce los numeros de tu DNI :");
	 numeros = leer.nextInt();
	
	return numeros;
	
}
	public static void main(String[] args)
		{
		int dni = pedirNumeros();
		
		int resultado = (dni%23);
	
		char letra = caracteresDNI.charAt(resultado);
				System.out.println("Su letra del DNI es :" +letra);	
			

		
		}
		
}
	
	
	
		
	/*	public static void main(String[] args) { 
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; 
	
		System.out.println("Introduce DNI sin letra: "); 
		
		Scanner leer = new Scanner(System.in); 
		
		int dni = Integer.parseInt(leer.next());
		 
		
		int index = dni - (Math.abs(dni/23)*23);
		
		System.out.println("Su letra de DNI es: "+ letras.charAt(index)); 
		}*/
		

		
		
		
		
	
	
	
	
	

