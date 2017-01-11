package edu.femx.fichero;

import java.io.File;

public class MainFicheros {
	public boolean isHidden()
	{
		boolean oculto=true ;
		
		return false;
		
	}

	public static void main(String[] args)
{	 
		String sDirectorio = "C:\\Users\\alvar_000\\git\\JavaProyects\\ficheros";
File f = new File(sDirectorio); 
	
System.out.println("Listando ficheros ocultos de " + sDirectorio);
System.out.println("-----------------------------");

if (f.exists()){
 File[] ficheros = f.listFiles();
 for (int x=0;x<ficheros.length;x++){
   if (ficheros[x].isHidden())
     System.out.println(ficheros[x].getName());
   }
} else{
   System.out.println("No existe ese directorio");
}		
	/*File file =null;
	 file = new File ("file"); //("C:\\Users\\alvar_000\\git\\JavaProyects\\ficheros")
	 boolean existe= file.exists();

	 if (existe){
		 System.out.println("Existe file");
		 String[] lista =null;
		 lista=file.list();
	
		 for (int i =0; i< lista.length;i++)
		 {if (lista[i].isHidden())
				System.out.println(lista[i].getName());
			 System.out.println(lista[i]);
		 }
	 }
	 else {
		 System.out.println("No existe");
	 }*/
}
	
	
	
	
	
}
