package edu.femx.json;

public class Comparando {

	public static void main(String[] args) {
		
		String tlf1="912037895";
		String tlf2="806222354";
		String tlf3="806222354";

		
		int result=tlf1.compareTo(tlf2);
		int result1=tlf2.compareTo(tlf1);
		int result2=tlf2.compareTo(tlf3);

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

	}
	
	
}
