package edu.femx.fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jdk.jfr.events.FileWriteEvent;

/**
 * Leer un fichero enviar a un array leer el array enviar el array a un nuevo
 * fichero que hay que crear
 */

public class FromArray2Fich {

	public static void main(String[] args) throws IOException {
		
		File fin = new File("ficheros//Pepe");
		String[] array = fromFichero2Array (fin);
		System.out.println("Impriminedo array con for each ...\n");
		
		for (String cad : array)//for each
		{
			System.out.println(cad);
		}
		
		if (fromArray2Fichero (array))
		{
			System.out.println("Escribir OK");
		} else
		{
			System.out.println("Escribir KO");
		}
	}

	public static String[] fromFichero2Array(File file) {
		String[] lista_cadena = null;
		FileReader fr = null;
		BufferedReader br = null;
		
			try 
				{
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					lista_cadena = new String[5];
					int pos = 0;
					
					String linea =br.readLine();
					while (linea!=null)
					{
						lista_cadena[pos] = linea;
						pos = pos + 1;
						linea = br.readLine();
					}
					
				} 
			catch (FileNotFoundException e) 
				{
				
					System.out.println("Error al crear el FileReader");
					e.printStackTrace();
				}
			catch (IOException io)
				{
					System.out.println("Error al hacer readLine");
					io.printStackTrace();
				}
			finally 
				{
					try 
						{
							br.close();
							fr.close();
						} 
					catch (Exception e) 
					{
						System.out.println("Error liberando recursos");
						e.printStackTrace();
					}
					
				
				}
		
		
		
		return lista_cadena; 
	}
	private static int contarLineas (File f) throws IOException
	{
		int nlineas = 0;
		FileReader fr = null;
		BufferedReader br = null;
		String cadaux = null;
		
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while (br.readLine()!=null)
			{
				nlineas = nlineas + 1;
			}
			
			br.close();
			fr.close();
		
		return nlineas;
	}

	public static boolean fromArray2Fichero(String[] lista_cadena) throws IOException {
		boolean ok = true;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
			try 
			{
				fw = new FileWriter("salida");
				bw = new BufferedWriter(fw);
				int i = 0;
				int longi = lista_cadena.length-1;
				
				for (String cadena : lista_cadena)
				{
					bw.write(cadena);
					if (i!=longi)
						{
						bw.newLine();
						}
					i = i+1;
				}
				
				
			} catch (IOException e) {
				System.out.println("Error creando Fw");
				e.printStackTrace();
				ok = false;
			}
			finally 
			{
				try {
					bw.close();
					fw.close();
				} catch (Exception e) {
					System.out.println("Error cerrando fichero salida");
					e.printStackTrace();
					ok = false;
				}
				
			}
			
		
		return ok;
		
	}

}
