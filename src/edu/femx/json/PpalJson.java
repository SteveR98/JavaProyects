package edu.femx.json;

import com.google.gson.Gson;

public class PpalJson {

	public static void main(String[] args) {
	
	
	Gson gson =new Gson ();
	Persona p =new Persona("Peter", false, false, 4);

	String jsonPersona =gson.toJson(p);
	System.out.println(jsonPersona);
	
	Persona p2=gson.fromJson(jsonPersona, Persona.class);
	System.out.println("N HIJOS: "+p2.getN_hijos()+"\nNOMBRE: "+p2.getNombre()+"\nCASADO: "+p2.isCasada()+"\nPARADO: "+p2.isParado());
	
}
}
