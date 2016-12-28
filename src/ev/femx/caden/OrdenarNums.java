package ev.femx.caden;

public class OrdenarNums {

	public static void main(String[] args) {
		
		int a_ent_a []=new int [10]; //inicializo el array con numero aleatorios
		
		for (int i =0;i< a_ent_a.length; i++)
		{
			a_ent_a[i]=(int) (100*Math.random()+1);
			System.out.println("Num en pos"+ " " + i + " " + a_ent_a[i]);

		}	
	
	}
}
