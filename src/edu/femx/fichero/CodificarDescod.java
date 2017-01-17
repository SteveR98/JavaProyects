package edu.femx.fichero;

import java.util.Scanner;

/**
 * Haced el cuerpo de los métodos
 * y un pequeño main para probarse
 * de forma que luego podamos
 * usar esta clase para codificar
 * decodificar ficheros
 * 
 * Un método codifica el mensaje
 * y llamando al método decodifica,
 * recuperaría el mensaje origina
 * 
 * @author Administrador
 *
 */
public class CodificarDescod {
	
	public static final int NUMEROCODIFICAR=4;
	
	public static void main(String[] args)
	{	
		Scanner scanner =null;
		scanner =new Scanner (System.in);
		System.out.println("Introduce un texto para codificar: ");
		String textoAcodi = scanner.nextLine();
		
	//	String mensajeAcodi = "Hoy es lunes y punto";
		
		textoAcodi = codificado( textoAcodi);
		System.out.println(" El mensaje codificado es : "+ textoAcodi);
		
		textoAcodi = decodificado( textoAcodi );
		System.out.println("El mensaje decodificado es : " +textoAcodi);
	
		
		System.out.println("Introduce el texto a decodificar: ");
		String textoADecodi = scanner.nextLine();
		
		textoADecodi=decodificado(textoADecodi);
		System.out.println(textoADecodi);
		
	}
	
	public static String codificado (String ficheroCodificar){

		String mensajeCodificar="";
		int code=0;
		char letra=0;
		
		for(int i =0 ;i<ficheroCodificar.length();i++)
		{
			code = (int)ficheroCodificar.charAt(i);
			letra = (char) (code+NUMEROCODIFICAR);
			mensajeCodificar =mensajeCodificar+letra;
			
			
		}
		
		
		return mensajeCodificar;
	}
	
	
	
	
	public static String decodificado (String fichedroCodificar)
	{	
		String mensajeDescifrar="";
		char charAux=0;
		int intAux =0;
		
		for(int j =0 ;j<fichedroCodificar.length();j++)
		{
			intAux = (int)fichedroCodificar.charAt(j);
			charAux = (char) (intAux-NUMEROCODIFICAR);
			mensajeDescifrar = mensajeDescifrar+charAux;
			
			
			
		}
		
		
		
		return mensajeDescifrar;
	}
	
	
	
	
}
