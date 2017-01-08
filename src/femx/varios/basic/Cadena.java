package femx.varios.basic;

public class Cadena {

	public static void main(String[] argumentos) // Son varios Strings []// Args
													// array/matriz/vector/tabla
	{
		/*
		 * System.out.println("Palabra 1 = " +argumentos [0]);
		 * System.out.println("Palabra 2 = " +argumentos [1]);
		 * System.out.println("Palabra 3 = " +argumentos [2]);
		 */

		int posicionInicial = 0;
		int posicionFinal = argumentos.length;// contiene la longitud los
												// numeros de elementos que
												// tiene el array
		String palabraActual = null;
		for (int i = posicionInicial; i < posicionFinal; i++) {
			palabraActual = argumentos[i];
			System.out.println("La palabra " + i + " es " + palabraActual);
		}

	}
}
