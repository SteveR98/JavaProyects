package edu.femxa.xml;

import java.io.FileInputStream;


import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainXml {

	public static void main(String[] args) throws Throwable {
		
		XMLReader reader = XMLReaderFactory.createXMLReader();
		ParserLibroXml parserLibro =null;
		parserLibro=new ParserLibroXml();
		
		reader.setContentHandler(parserLibro);
		reader.parse(new InputSource(new FileInputStream("libros.xml")));
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
