package edu.femx.fichero.registro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


/**Crear registro acceder y guardar los nombres y contraseñas en un fichero .
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
	
	
	public static void escribirContraseña (String contraseña2) throws IOException
	{	String contraseña1 =null;
		File ficheroPassword = new File("C:\\Users\\alvar_000\\git\\JavaProyects\\PASSWORD");
		
		FileWriter escribirArchivo = new FileWriter(ficheroPassword);

		Scanner scanner =null;
		scanner = new Scanner(System.in);
		
		System.out.println("Introduce tu contraseña: ");
		contraseña1=scanner.nextLine();
		
		System.out.println("Vuelve a introducir tu contraseña: ");
		contraseña2=scanner.nextLine();
		if (contraseña1.equals(contraseña2))
		{
			BufferedWriter escribirContraseña= new BufferedWriter(escribirArchivo);
			escribirContraseña.write(contraseña2);
		}
			escribirArchivo.close();
		}
		
		
		
	}

	

