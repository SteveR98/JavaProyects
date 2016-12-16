

import java.util.Scanner;

public class ParesAparecidos {
	
	public static int pedirNumero()//Metodo pedirNumero
	{
		
		int numero_leido = 0; 
		Scanner sc = null;	
		sc = new Scanner(System.in); //Constructor lea del teclado estandar
		numero_leido = sc.nextInt(); //La ultima instruccion de nextInt es return un int
		
		return numero_leido; //Devuelve un numero int
	}
	
	public static boolean esPar(int numero)
	{
		boolean bul= false;//Falso o verdadero 0/1
		
		if (numero %2 ==0)
		{
			bul = true ;
		}else
		
		{
			bul =false;
		}
		return bul;
		
	}
	
	public static void main(String[] args)//Metodo main 
	{
			
				int pares_quiere =0;
				int pares_aparecidos =0;
				int contador =0;
				
				//PEDIR NUMERO AL USUARIO
				
				System.out.println("Cuantos Numeros pares quieres:");
				pares_quiere = pedirNumero();
				
				//FIN DE PEDIR NUMERO
				
				//IMPRIMIR LOS PARES QUE HA PEDIDO
				while (pares_aparecidos <pares_quiere)//Mientras pares aparecidos sean menor que pares quiere
				{	
				if (esPar (contador))//SI ES PAR
				{
				System.out.println(contador);
				pares_aparecidos ++;
				}
				contador ++;
	}	
				System.out.println("Han aparecido :" + pares_aparecidos);
				
	}

}
