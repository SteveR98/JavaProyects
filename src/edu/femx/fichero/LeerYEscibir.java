package edu.femx.fichero;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hacer que pida un nombre que cree un fichero 
 * @author alvar_000
 *
 */

public class LeerYEscibir {

/**
 * Metodo que sirve para eliminar un fichero que haya sido creado
 * antes en la carpeta de origen.
 * 
 * @param nombreFichero es el nombre del fichero que se le da para que lo elimine 
 */
	public static void borrarFichero (String  nombreFichero)
	{
		File ficheroABorrar =null; 
		ficheroABorrar =new File(nombreFichero);
		
		if(ficheroABorrar.isFile())
		{
			ficheroABorrar.delete();
			System.out.println("Se ha eliminado el fichero");
		}
		else
		
		{
			System.out.println("No se ha eliminado ese fichero");
		}

	}

	/**
	 * Metodo que crea un nuevo fichero en la carpeta actual 
	 * 
	 * @param fichNuevo es el nuevo fichero creado
	 */
	
	public static void crearFichero (String fichNuevo)
{	
		File fichero = null ;
	fichero =new File(fichNuevo);
	try {
		if(fichero.createNewFile()){
			System.out.println("Se ha creado el fichero");
		}else{
			System.out.println("Ya se ha creado ese fichero");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public static void main(String[] args) {
		Scanner scanner =null;
		scanner =new Scanner(System.in);
		
		String nombreFichero = null;
		
		
		System.out.println("INTRODUCE UN NOMBRE :");
		 nombreFichero = scanner.nextLine();
		
		crearFichero(nombreFichero);
		
		System.out.println("INTRODUCE UN NOMBRE PARA  ELIMINAR :");
			String borrarFich = scanner.nextLine();
	
		 borrarFichero(borrarFich);
		
		
		
		
		
		
	
		
	}
	
	

	
	
}
