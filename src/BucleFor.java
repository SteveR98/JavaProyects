

import java.util.Scanner; //Clase que ya viene en java para Escribir teclado

public class BucleFor //Nombre de clase
{
		
		public static int pedirNumero() //Metodo pedir numero
		{
			
			int numero = 0; //Numero entero vale 0 valor inicial /Crear una variable hay que definir algo antes 0
			Scanner sc = null;	//Definir el nombre del escaner y darle un valor /escaner permite escribir de teclado
				
			sc = new Scanner(System.in); //Scanner es un constructor pide otro escaner para escribir
			numero = sc.nextInt(); //Vas a meter otro numero next int 
			
			return numero;
		}
		
		public static void main(String[] args) 
		{
			int numeroleido = 0;
			int numero_mayor = 0;
					
			for (int j = 1; j <= 10; j = j + 1)//Inicializacion, Condicion de terminacion, iteracion = repeticion
			{
				System.out.println("Introduzca el número " + j);// Numeracion introduzca numero 1,2,3,4,5,6,7,8,9
				numeroleido = pedirNumero();
				
				if (numeroleido > numero_mayor)//El numero 4 es mayor que el num mayor 0
				{
					numero_mayor = numeroleido;//Por lo que el numero mayor pasa a ser 4
				}
			}
			System.out.println("He terminado");
			System.out.println("El numero mayor es " + numero_mayor);//Muestra el numero mayor de todos los anteriores
			}
 
}