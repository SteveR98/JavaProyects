package edu.femx.fichero;
/**
 * 1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 * @author alvar_000
 *
 */
public class PalindromoSiNo {
	
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
		return palabraPalin;
	}
	
	/**
	 * Metodo que mientras que i 0 sea menor o igual que -1 y boolean sea true
	 * 
	 * @param palabra es un String
	 * @return devuelve un boolean
	 */
	private static boolean siEsPalindromo (String palabra)
	{
		boolean siPalin = true;
		
		int i = 0;
		int j = palabra.length()-1;
		
		while ((i<=j)&&(siPalin))
		{
			siPalin = palabra.charAt(i) == palabra.charAt(j);
			
			/*if ( palabra.charAt(i) == palabra.charAt(j)){
				siPalin =true;
			}
			else {
				siPalin =false;
			}*/
			
			i++;
			j--;
		}
		
		
		return siPalin;
	}
	
	public static void main(String[] args) {
		if (siEsPalindromo("FEEF"))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
	}

}
