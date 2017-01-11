package ej.frase.unida;


/**
 * Haced un programa (Una clase Main) con dos métodos:

1) El main
2) y una función que reciba una cadena (String) con espacios en blanco; 
es decir, una frase; y devuelva esa frase, sin espacios, toda junta.

EJEMPLO: Si el texto de entrada fuera este
ESTO ES UNA FRASE

el texto de salida, sería este
ESTOESUNAFRASE

 * @author alvar_000
 *
 */


public class MainYFuncion {

/**
 * Metodo que consiste basicamente en quitar los espacios
 *  a las frases que metemos
 * 
 * @param frasePedida es el string que nos dan para quitar los espacios
 * @return frase ya sin los espacios
 */
	public static String quitarEspacios(String frasePedida)
	{
		String fraseSinEsp = "";
		char blanco =' ';
		
		for (int j = 0; j < frasePedida.length(); j++)
			{
				{
				
				//TODO
					fraseSinEsp.charAt(j);
				//	frasePedida.replace(" ", "");
					
				}
			
			}
		return fraseSinEsp;
	}
	
	
	/**
	 * Metodo Main que hay que llamar al metodo quitar espacio para
	 * poder eliminar los espacios y la muestre
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String siEspacio = null; //Variable con espacio
		
		String noEspacios = null; //Variable sin espacios
		
		noEspacios = quitarEspacios(siEspacio); //La frase de espacios se quitan los espacios y da la frase con los espacios eliminados
	
		siEspacio = "ESTA ES LA FRASE DE PRUEBA"; // Frase con espacios
		
		
		
		System.out.println(	"La frase sin los espacios es: " + noEspacios	); //Imprimimos la frase sin espacios
	}
		
		
		
		
		
		
		
	}

