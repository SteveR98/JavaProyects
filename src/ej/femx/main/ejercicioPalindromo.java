package ej.femx.main;
import java.util.Scanner;
/**
 * Crear una funcion que reciba un string y que devuelva un boolean, 
 * indicando si el string recibido es palindromo (True) o no (False).
 * @author alvar_000
 *
 */
public class ejercicioPalindromo{

	public static boolean esPalindromo(String cadena) {

		boolean palabraPalin = false;
		int inicial =0;
		int fin= (cadena.length()-1);
		
		while ((inicial<fin)&& (!palabraPalin))
{
			if (cadena.charAt (inicial) == cadena.charAt(fin))
			{
			inicial ++;
		
			fin --;
			}
		
		else palabraPalin =true;
		}			
		if (!palabraPalin)
		{
			System.out.println("La palabra es palindromo");
		}
		else {
			System.out.println("La palabra no es palindromo");

		}
		
		
		return palabraPalin; 
	
	}
	
	
	
	public static void main(String[] args) {
		
		String cadena =null ;
		
		Scanner scanner =null;
		scanner =new Scanner(System.in);
		
		System.out.println("Inroduzca una palabra para saber si es o no Palindroma: ");
		
		cadena =scanner.nextLine();
		
		esPalindromo(cadena);
		
		}
		
	}
	
	
	
	

