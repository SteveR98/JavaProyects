

import java.util.Scanner;

public class BooleanNota {
	/**
	 * Hacer un programa que pida 
	 * @param nota la calificacion del alumno
	 * @return true si la nota es menor que 5
	 * o false si mayor
	 */
public static boolean notaSuspensa (int nota)
	
{
		boolean suspenso = false;
		
		if (nota <5)
		{
			suspenso = true ;
		} else
		
		{
			suspenso =false;
		}
		
		return suspenso;
		
	}

/*public static boolean aprobado (int nota)
{
	boolean b_aprobado =false;
	
	if (nota<=5)
	{
		b_aprobado = true;
	}
			
			
			return b_aprobado;
}
2*/
		public static int pedirNota()
		{
			
			int numero_leido = 0; 
			Scanner sc = null;	
			sc = new Scanner(System.in); //Constructor lea del teclado estandar
			numero_leido = sc.nextInt(); //La ultima instruccion de nextInt es return un int
			
			return numero_leido; //Devuelve un numero int
		}
			public static void main(String[] args) 
			{
			int nota_introducida =0;
			do
			{
			System.out.println("Dame nota");
				nota_introducida =pedirNota ();
					if ( notaSuspensa (nota_introducida) )
						{
						System.out.println("Palmaste");
						}
			}while (notaSuspensa(nota_introducida)==true);
			System.out.println("Apto");
			
			
			}
}
