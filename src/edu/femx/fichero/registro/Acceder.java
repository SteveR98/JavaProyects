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
		boolean salir =false;
		
		File ficheroNombre = new File("C:\\Users\\alvar_000\\git\\JavaProyects\\USERS");

		FileReader leerArchivo = new FileReader(ficheroNombre);

		BufferedReader buffLeerNombre = null;

		Scanner scanner = null;
		scanner = new Scanner(System.in);

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
			salir = true;
		}
		buffLeerNombre.close();
		leerArchivo.close();
	}

	public static void leerContrase�a(String contrase�a) throws IOException {
		boolean salir =false;
		
		File ficheroPassword = new File("C:\\Users\\alvar_000\\git\\JavaProyects\\PASSWORD");
		BufferedReader buffLeerContrase�a = null;

		FileReader leerArchivo = new FileReader(ficheroPassword);

		Scanner scanner = null;
		scanner = new Scanner(System.in);

		System.out.println("Introduce tu contrase�a: ");
		contrase�a = scanner.nextLine();
		
	
		buffLeerContrase�a = new BufferedReader(leerArchivo);
		String lineaContra = buffLeerContrase�a.readLine();
		
		if (lineaContra.equals(contrase�a)) {
			System.out.println("���CORRECTO BIENVENIDO!!!");
		} else {
			System.out.println("La contrase�a es incorrecta ");
			salir =true;
		}

		buffLeerContrase�a.close();
		leerArchivo.close();

	}

}
