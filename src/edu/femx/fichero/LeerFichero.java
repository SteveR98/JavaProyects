package edu.femx.fichero;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LeerFichero {

	public static void main(String[] args) throws IOException 
	{
		
		File archivo =new File ("ficheros\\Fichero1");
		FileReader leerFichero = new FileReader(archivo);

		int suma =0;
		int a = 0;
		
		while (-1!=(a = leerFichero.read())) //(leerFichero.ready())
		{
			char c = (char)a;
			System.out.print(c);
			suma =suma+a;
		}
		System.out.println("\n La suma es " +suma);
		leerFichero.close ();
	
	}
	
	
	
}
