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

	public static void leerContraseña(String contraseña) throws IOException {
		boolean salir =false;
		int contadorContra =0;
		
		File ficheroPassword = new File("C:\\Users\\alvar_000\\git\\JavaProyects\\PASSWORD");
		BufferedReader buffLeerContraseña = null;

		FileReader leerArchivo = new FileReader(ficheroPassword);

		Scanner scanner = null;
		scanner = new Scanner(System.in);

		System.out.println("Introduce tu contraseña INTENTOS RESTANTES 3: ");
		contraseña = scanner.nextLine();
		
	
		buffLeerContraseña = new BufferedReader(leerArchivo);
		String lineaContra = buffLeerContraseña.readLine();
		
		if (lineaContra.equals(contraseña))
		{
			System.out.println("¡¡¡CORRECTO BIENVENIDO!!!");
			System.exit(0);
		}
		
		else {
			
			System.out.println("La contraseña es incorrecta ");
			contadorContra ++;
			
			
			System.out.println("Vuelva a introducir la contraseña INTENTOS RESTANTES 2");
			contraseña = scanner.nextLine();
			contadorContra ++;
			
			if (lineaContra.equals(contraseña))
			{
				System.out.println("¡¡¡CORRECTO BIENVENIDO!!!");
				System.exit(0);
			}
			
			System.out.println("Vuelva a introducir la contraseña INTENTOS RESTANTES 1");
			contraseña = scanner.nextLine();
			contadorContra++;
			
			if (lineaContra.equals(contraseña))
			{
				System.out.println("¡¡¡CORRECTO BIENVENIDO!!!");
				System.exit(0);
			}
			
			if (contadorContra >= 3 )
			{	System.out.println("Has agotado los intentos");
				System.exit(0);
			}			
		
		}

		buffLeerContraseña.close();
		leerArchivo.close();

	}

}
