package ev.femxa.val;

import java.util.Scanner;

public class EjercicioPedirOrdenar {

	
	public static int pedirNumero() 
	{
		int numero_introducido = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		numero_introducido = scanner.nextInt();
		return numero_introducido;
	}

	
	//TODO 
	
	
	public static void main(String[] args) {
	   
	    int i=0;
		int numeros =0;
		int contador=0;
		int[] numero = new int[10];
			
		System.out.println("Introduzca 10 numeros para ordenarlos :");
			
		for (i = 0; i < 10; i++) {
	            System.out.print("numeros" + i + "=");
				numero[i]=pedirNumero();
	           
	            for (i = 0; i < 10; i++) {
	               
	            	if (numero[i] > 0)
	            	{
	                	
	            	}
	            }
		}
	}
	
	   
	   
	
	
	
			/*   _    _____         _
			   \`,""   ,'7"r-..__/ \
			  ,'\ `, ,',','    _/   \
			 /   \  7 / /     (   \ |
			J     \/ j  L______\  / |
			L   __JF"""/""\"\_,    /
			L,-"| O|  f O |  L_  _/
			F   \_ /  \__/   `-  j|
				.-'    `"""    ,' |          _..====.._
				\__/         r"_  A        ,' _..---.._`,
				 `-.______,,-L// / \  ___,' ,'_..:::.. `,`,
						  j   / / / 7"    `-<""=:'  '':. \ \
						 /   <,' /  F  . i , \   `,    :T W I
						 |    \,'  /    >X<  |     \   :| | L
						 |     `._/    ' ! ` |      I  :| |  G
						  \           \     /       |  :H T  |
						 __>-.__   __,-\   |        |  S P   |
						/     /|   | \  \  \_       | 'A R   |
					   /   __/ |   |  L  L   \      K./ /    L
					  /   |    |   4  I  I    |    E./ /   ,'
					 J    \    I    L F  I    |    // / _,'
			_________|     |   F    |J   F    |   //_/-'
			\   __   |    /   J     |/  J     |  /="
			\\  \_\  \__,' \  F     |   F     |
			\\\_____________\/      F__/      F
			 \\|    |_____/  (______/
			  \/_____/

			  
	 
	 */
	  

















}
	
	
	

