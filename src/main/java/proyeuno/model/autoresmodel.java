package proyeuno.model;

import java.util.ArrayList;
import java.util.List;

import proye.uno.beans.*;


public class autoresmodel {
	
	public List<Autor> listarAutores(){
		
		ArrayList<Autor> autores = new ArrayList<Autor>();
		autores.add(new Autor (1,"cargia","colombia"));
		autores.add(new Autor (2,"jhoin","peru"));
		autores.add(new Autor (3,"dan","peru"));
		
		return autores;
		
	}

}
