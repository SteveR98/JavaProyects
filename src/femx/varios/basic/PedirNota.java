package femx.varios.basic;

import java.util.Scanner;

/**
 * Haced un programa que pida una nota hasta que sea aprobado(mayor que cinco)
 * 
 * @author alvar_000
 *
 */
public class PedirNota {

	public static int pedirNota()// Metodo pedirNumero
	{

		int numero_leido = 0;
		Scanner sc = null;
		sc = new Scanner(System.in); // Constructor lea del teclado estandar
		numero_leido = sc.nextInt(); // La ultima instruccion de nextInt es
										// return un int

		return numero_leido; // Devuelve un numero int
	}

	public static void main(String[] args) {
		int nota_introducida = 0;
		do {
			System.out.println("Dame nota");
			nota_introducida = pedirNota();

			if (nota_introducida < 5) {
				System.out.println("Palmaste");
			}
		} while (nota_introducida < 5);
		System.out.println("Apto");

	}
}
