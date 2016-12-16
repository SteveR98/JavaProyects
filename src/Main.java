
import java.util.Scanner;
/**
 * @author alvar_000
 * @version 1.0
 * @created 12-dic.-2016 17:53:41
 */
public class Main {
 public static int pediredad ()
 {	System.out.println("Empieza mi programa");

	 int edad = 0; 
 System.out.println("Dame tu edad");
 	Scanner scanner11 = new Scanner(System.in);
 			edad =scanner11.nextInt();
 	return edad; 
 			}
  public static void main (String [] args){
	  int edad =pediredad ();
	  
	  if (edad>=18)
		  System.out.println("Eres mayor de edad");
	  else
		  System.out.println("Eres menor de edad");
  }
}
 			
		
  		/*
		//1 PEDIR DATOS PERSONA
		
		Persona persona  = PedirDatos.pedirDatosPersona()
				
		//2 CALCULAR IMC
		float imc persona = CalcularIMC.calcula(persona);
	
				
		//3 MOSTRAR PERSONA IMC
		
		
		
		persona = new Persona();

		
		
	}//fin del metodo main*/

