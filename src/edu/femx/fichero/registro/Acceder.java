package edu.femx.fichero.registro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Acceder {

	public static void leerNombre(String nombre) throws IOException {
		
		
		File ficheroNombre = new File("C:\\Users\\alvar_000\\git\\JavaProyects\\USERS");

		FileReader leerArchivo = new FileReader(ficheroNombre);

		BufferedReader buffLeerNombre = null;

		Scanner scanner = null;
		scanner = new Scanner(System.in);
		
		System.out.println("PARA LOGIN IN" );
		System.out.println("Introduce tu nombre: ");
		nombre = scanner.nextLine();

		buffLeerNombre = new BufferedReader(leerArchivo);
		String lineaNombre = buffLeerNombre.readLine();

		if (lineaNombre.equals(nombre))
		{
			System.out.println("NOMBRE CORRECTO ");
		} 
		else {
			System.out.println("No existe ese nombre ");
			System.exit(0);
		}
		buffLeerNombre.close();
		leerArchivo.close();
	}

	public static void leerContrase�a(String contrase�a) throws IOException {
		boolean salir =false;
		int contadorContra =0;
		
		File ficheroPassword = new File("C:\\Users\\alvar_000\\git\\JavaProyects\\PASSWORD");
		BufferedReader buffLeerContrase�a = null;

		FileReader leerArchivo = new FileReader(ficheroPassword);

		Scanner scanner = null;
		scanner = new Scanner(System.in);

		System.out.println("Introduce tu contrase�a INTENTOS RESTANTES 3: ");
		contrase�a = scanner.nextLine();
		
	
		buffLeerContrase�a = new BufferedReader(leerArchivo);
		String lineaContra = buffLeerContrase�a.readLine();
		
		if (lineaContra.equals(contrase�a))
		{
			System.out.println("���CORRECTO BIENVENIDO!!!");
			System.exit(0);
		}
		
		else {
			
			System.out.println("La contrase�a es incorrecta ");
			contadorContra ++;
			
			
			System.out.println("Vuelva a introducir la contrase�a INTENTOS RESTANTES 2");
			contrase�a = scanner.nextLine();
			contadorContra ++;
			
			if (lineaContra.equals(contrase�a))
			{
				System.out.println("���CORRECTO BIENVENIDO!!!");
				System.exit(0);
			}
			
			System.out.println("Vuelva a introducir la contrase�a INTENTOS RESTANTES 1");
			contrase�a = scanner.nextLine();
			contadorContra++;
			
			if (lineaContra.equals(contrase�a))
			{
				System.out.println("���CORRECTO BIENVENIDO!!!");
				System.exit(0);
			}
			
			if (contadorContra >= 3 )
			{	System.out.println("Has agotado los intentos");
				System.exit(0);
			}			
		
		}

		buffLeerContrase�a.close();
		leerArchivo.close();

	}

}
