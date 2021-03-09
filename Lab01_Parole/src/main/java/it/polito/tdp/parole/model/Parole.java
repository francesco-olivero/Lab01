package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> lista;
		
	public Parole() {
		//lista = new LinkedList<String>();
		lista = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		lista.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(lista);
		return lista;
	}
	
	public void reset() {
		lista.removeAll(lista);
	}

	public void cancel(String s) {
		for (String a: lista) {
			if (s.equals(a))
				lista.remove(a);
		}
	}
}
