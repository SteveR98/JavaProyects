package edu.femxa.xml;

import java.util.ArrayList;
import java.util.List;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserLibroXml extends DefaultHandler
{	private List<Libro> lista_libros;
	private Libro libro;
	private String valorActual;
	
	
	@Override
	public void startDocument() throws SAXException {
	// TODO Auto-generated method stub
		//super.startDocument();
		this.libro=new Libro();
		lista_libros =new ArrayList<>();
}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		//super.startElement(uri, localName, qName, attributes);
		
		System.out.println("StartElement= "+localName);
		if (localName.equals("libro")){
			libro=new Libro();
			String valor_isbn=attributes.getValue ("isbn");
			this.libro.setIsbn(valor_isbn);
			}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		//super.endElement(uri, localName, qName);
		
		System.out.println("EndElement"+localName);
		if (localName.equals("titulo")) {
			libro.setTitulo(valorActual);			
		}
		else if(localName.equals("autor")){
			libro.setAutor(valorActual);
		}
		else if(localName.equals("anyo")){
			libro.setAnyo(valorActual);

		}
		else if(localName.equals("editorial")){
			libro.setEditorial(valorActual);

		}
		else if(localName.equals("libro"))
		{
			lista_libros.add(libro);

		}
		
	}
	@Override
	public void endDocument() throws SAXException {
	
		 for (Libro libro :lista_libros){
			 System.out.println("INFO LIBRO");
				System.out.println("TITULO= "+libro.getTitulo());
				System.out.println("ISBN= "+libro.getIsbn());
				System.out.println("AUTOR= "+libro.getAutor());
				System.out.println("AÑO= "+libro.getAnyo());
				System.out.println("EDITORIAL= "+libro.getEditorial());
		 }

		
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//super.characters(ch, start, length);
		
		System.out.println("Char = "+ch);
		System.out.println("Start= "+start);
		System.out.println("Length= "+length);
		String str = new String(ch, start, length);
		System.out.println("String= "+str);
		
		valorActual= str;
		
	}
	
	
	
	
	
	
	
	
}
