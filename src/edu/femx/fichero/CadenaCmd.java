package edu.femx.fichero;

public class CadenaCmd {

	public static void main(String[] args) {
	
		int palabra_longi = 0;
		String palabra_mayor = null;
		int num_argumentos = 0;

		for ( String palabra : args){

		if (palabra_longi <  palabra.length()){

		palabra_longi = palabra.length();
		palabra_mayor = palabra;
		}
		num_argumentos++;
		}
		System.out.println("El numero de palabras introducidas es : " +num_argumentos);
		System.out.println("La palabra que contiene mas caracteres es 2: "+palabra_mayor);

		}
		
		
		
		
		
}
		
