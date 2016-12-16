

import java.util.Scanner;

public class PideNums {
	
	private static Scanner scanner;

	public static double pedirNumero2()
	{
		double pedirNumero = 0;
		
		Scanner scanner = new Scanner (System.in);
		 
		pedirNumero = scanner.nextDouble();
	
		return pedirNumero;
		
		
	}
	
	public static void main(String[] args)
	{
		double numeroLeido= 0;
		double mayor =0;
		
		for (int i =0;i <= 10 ;i = i+1){
		
			System.out.println("El numero leido es:" + numeroLeido);
				numeroLeido = pedirNumero2();
		}
		
		
		/*System.out.println("Introduzca primer numero")
		primero = pedirNumero2();
		
		System.out.println("Introduzca segundo numero");
		segundo =pedirNumero2();

		System.out.println("Introduzca tercero numero");
		primero = pedirNumero2();
		
		if (primero > segundo && primero > tercero) 
			System.out.println("El primero es el mayor");
				else if (segundo > primero && segundo >tercero)
					System.out.println("El segundo es el mayor");
						else if (tercero>primero && tercero >segundo)
							{System.out.println("El tercero es el mayor");
								
		
		
		System.out.println("El numero leido es:" +numeroLeido);

	
	*/
	
	
	}	
}

	
	