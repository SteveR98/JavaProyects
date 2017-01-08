package ev.femxa.kkk;

import java.util.Scanner;

public class MenuPrincipal {

	public void menuPrincipal() {
		
		int numeroOpcion =0;
		String menu=null;
		boolean exit =false;
		Scanner scanner =null;
		scanner = new Scanner(System.in);
		
		System.out.println("Escriba el numero de la opcion que usted elija:");		
		
		System.out.println("1-INSERTAR PERSONA");
		
		System.out.println("2-LISTAR PERSONA");
		
		System.out.println("3-BUSCAR PERSONA POR NOMBRE");
		
		System.out.println("4-BORRAR PERSONA");
		
		System.out.println("5-EXIT");
		
		numeroOpcion=scanner.nextInt();
		if (numeroOpcion<=5){
			exit =true;
		}
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
