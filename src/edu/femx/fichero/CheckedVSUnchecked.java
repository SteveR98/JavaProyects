package edu.femx.fichero;

import java.io.FileNotFoundException;

public class CheckedVSUnchecked {

	
	public static void main(String[] args)
	{
		String cadena =null;
	int arrayEnt []= new int [4];
	
	try 
	{
		int longi = arrayEnt.length;
		arrayEnt[arrayEnt.length]=3;
		
		
		/*int longCad =cadena.length();
		
		System.out.println(longCad); //Unchecked Exception NO TIENE TRY CATCH NULL POINTER EXCEPTION*/
			
	} 
	
	catch (ArrayIndexOutOfBoundsException e) //FICHERO DE LOGS Se detalla el fallo. Exception es la clase .
	{
		
		System.out.println("Excepcion array ");
		e.printStackTrace(); //Mensaje que muestra la excepcion
	}
	
	catch (NullPointerException e)
	{
		
		System.out.println("Excepcion NULL ");
		e.printStackTrace(); 
	}
	catch (FileNotFoundException e)
	{
		
		System.out.println("Excepcion FileNot ");
		e.printStackTrace(); 
	}
	catch (Exception e){
		System.out.println("Excepcion producida ");
		e.printStackTrace(); 
	}
	
	}
	
	
}
