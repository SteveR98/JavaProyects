package edu.femx.fichero.registro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


/**Crear registro acceder y guardar los nombres y contrase�as en un fichero .
 * 
 * @author alvar_000
 *
 */


public class Registro {

	public static void escribirNombre (String nombre) throws IOException 
	{
		boolean ok =true;
	
		File ficheroNombre = new File("C:\\Users\\alvar_000\\git\\JavaProyects\\USERS");
		
		FileWriter leerArchivo = new FileWriter(ficheroNombre);

		BufferedWriter escribirNombre =null;

		
		Scanner scanner =null;
		scanner = new Scanner(System.in);		
		
		System.out.println("Introduce tu nombre: ");
		nombre=scanner.nextLine();
		
		if (nombre.equals(leerArchivo))
		{
			System.out.println("El nombre ya esta en uso");
			ok=false;
			
		}
		
			escribirNombre= new BufferedWriter(leerArchivo);
			escribirNombre.write(nombre);
		
		escribirNombre.close();
}
	
	
	public static void escribirContrase�a (String contrase�a2) throws IOException
	{	String contrase�a1 =null;
		File ficheroPassword = new File("C:\\Users\\alvar_000\\git\\JavaProyects\\PASSWORD");
		
		FileWriter escribirArchivo = new FileWriter(ficheroPassword);

		Scanner scanner =null;
		scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu contrase�a: ");
		contrase�a1=scanner.nextLine();
		
		System.out.println("Vuelve a introducir tu contrase�a: ");
		contrase�a2=scanner.nextLine();
		if (contrase�a1.equals(contrase�a2))
		{
			BufferedWriter escribirContrase�a= new BufferedWriter(escribirArchivo);
			escribirContrase�a.write(contrase�a2);
		}
			escribirArchivo.close();
		}
		
		
		
	}

	

