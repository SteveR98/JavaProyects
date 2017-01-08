package ev.femxa.kkk;
/**
 * Clase que sirve para introducir un numero maximo de personas
 * @author alvar_000
 *
 */
public class PrincipalPersona {

	public static final int NUM_PERSONAS=5;
	
	public static void main(String[] args) {
		
	Persona []array_persona=null; //Persona array_persona[];
	Persona persona_aux =null;
	String nombre_aux =null;
	int edad_aux =0;
	
	array_persona=new Persona [NUM_PERSONAS]; //Metemos cinco personas
	
	
		for (int i = 0; i < NUM_PERSONAS; i++)
		{
		persona_aux = array_persona [i];
		nombre_aux = persona_aux.getNombre();
		edad_aux = persona_aux.getEdad();
			
			System.out.println("Nombre = "+ nombre_aux);
			System.out.println("Edad = "+ edad_aux);

		}
		
		
		
	}	
	
}
