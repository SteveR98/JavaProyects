package edu.femx.fichero.registro;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

public static final int NUMEROCODIFICAR=4;


public static void main(String[] args) throws IOException {
	
	boolean salir = false;
	int numeroMenu = 0;
	
	Scanner scanner =null;
	scanner = new Scanner(System.in);
	
	String nombre =null;
	String contraseña2 =null;
	
	do{	System.out.println("Introduce el valor del numero correspondiente: ");
		
		System.out.println("1-Registrarse");
		System.out.println("2-Acceder");
		System.out.println("3-Salir");
		
		numeroMenu = scanner.nextInt();
		
		if (numeroMenu ==1)
		{
			Registro.escribirNombre(nombre);
			
			Registro.escribirContraseña(contraseña2);
		}
		else if (numeroMenu == 2)
		{
			 Acceder.leerNombre(nombre);
			
			 Acceder.leerContraseña(contraseña2);
		}

		else if(numeroMenu >=3)
		{
			 salir =true ;
			 System.out.println("Has Salido de la app");
		}
		
	}while(!salir);
	
	
}

}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*public static String codificado (String ficheroCodificar){

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

public void menuInicio ()
{	
		
	
	boolean salir = false;
	int numeroMenu = 0;
	Scanner scanner =null;
	scanner = new Scanner(System.in);
	
	
	System.out.println("Seleccione una opcion mediante el numero correspondiente: ");
		
	do{	
		
		System.out.println("1-Registrarse");
		System.out.println("2-Acceder");

		numeroMenu = scanner.nextInt();
		
		while (numeroMenu <=3)
		{
			salir = true;
		}
		if (numeroMenu ==1)
		{
			
		}
		 else if(numeroMenu==2)
		{
			
		}
		
		while(!salir);
		{
			menuInicio();
		}
		
	}
}
}
*/