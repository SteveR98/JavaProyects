package edu.femx.fichero;

import java.io.File;


public class ImprimirArchDir {

	
	/**
	 * Metodo que recorra los archivos de un directorio que solamente contengan la A
	 * @param args
	 */

	public static void main(String[] args)
	{
		
		File file =null;
		File[] ficheros=null ;
		
		
		String sDirectorio = ("C:\\Program Files (x86)");
		
		file = new File(sDirectorio); 
		ficheros = file.listFiles();
		String nombreArch =null;
		
		for (int i = 0; i < sDirectorio.length(); i++)
			{
			nombreArch = ficheros[i].getName(); //Coje el nombre del fichero y en la posicion i =0 se guarda el primer nombre
			
			/**
			 * Mientras el nombreArch contenga la letra A o a ,y el metodo no sea igual a -1
			 * se imprima el syso que serian los archivos que contienen la a
			 * 
			 */
			if (nombreArch.indexOf("a") !=-1 || nombreArch.indexOf("A")!=-1) 
				{
				System.out.println(nombreArch);
				}
			
			
			
			}

	}
	
	/*public static void main(String[] args) {
		
		/**
		 * Dado un directorio, listar todos los archivos que contengan una "a".
		 
		
		String ruta = ("C:\\Users\\Administrador.000\\IsabelGrupoTarde\\FicherosJava\\FicherosJava\\Directorio");
		File dir = new File(ruta);
		String[] ficheros = dir.list();
		
		if(ficheros != null)
		{
			for (int i = 0; i < ficheros.length; i++) {
				File file = new File(ruta +"\\" +ficheros[i]);
				
				if(file.isFile())
				{
					boolean encontrado = false;
					int j = 0;
					do
					{
						if((ficheros[i].charAt(j) == 'a') || (ficheros[i].charAt(j) == 'A') ) //charAt || = O
						{
							System.out.println(ficheros[i]);
							encontrado = true;
						}
						j++;
					}
					while((j<ficheros[i].length()) && !encontrado);
				}
			}
		}
		else
			System.out.println("No hay ficheros en este directorio.");
		
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
}