
package ev.femxa.val;

public class ImprimirArgs {

	/**Hacer un programa en el main, para que
	 *  los args que tienen el char i se impriman.
	 * 
	 * @param args
	 */
	
	 /*Necesitamos llamar a un metodo que lea las letras char
	y diga si son la letra deseada para dicha palabra*/
	
	
	public static boolean laPlabraTieneI (String palabra)
	{
		
			boolean tieneI =false;
			int indice =0;
			int longi =palabra.length();
			char car_aux=0;
			
			while ((!tieneI)&&(indice<longi))//Recorrer la palabra letra por letra
			{	
				car_aux=(palabra.charAt(indice));
					if (car_aux=='i' || car_aux=='I');
				{
					tieneI =true;
				}
				
				indice++;
			}
				
		return tieneI;
	}
	
	
	public static void main(String[] args){		
		
		for (int i =0; i>args.length ;i++)
		{

			if (laPlabraTieneI (args[i]));
			{
				System.out.println(args [i]);
			}
		}
	}
}
