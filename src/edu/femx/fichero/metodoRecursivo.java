package edu.femx.fichero;

import java.io.File;

public class metodoRecursivo {
	
	public static void listarDirectorio (String nombre)
		{
		File directorio = new File(nombre);
		String[] lista_ficheros = null;

		System.out.println(directorio.getName());
		
		if(directorio.isDirectory())
		{
			lista_ficheros = directorio.list();
			for(int i = 0; i < lista_ficheros.length; i++)
				listarDirectorio(nombre+"\\"+lista_ficheros[i]);
		}
	}
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
