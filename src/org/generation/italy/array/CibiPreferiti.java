package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] cibiPreferiti = {"Pizza", "Gelato", "Carbonara", "Lasagna", "Amatriciana", "Rag�", "Kebab", "Anelli di Cipolla", "Er Panino de Pippo a Tivoli", "Katsudon"};
		
		int lunghezzaArray = cibiPreferiti.length;
		
		System.out.println("La classifica � composta da: " + lunghezzaArray + " cibi");
		
		System.out.println("Il mio cibo pi� preferito tra i preferiti � " + cibiPreferiti[0]);
		System.out.println("Il mio cibo meno preferito tra i preferiti � " + cibiPreferiti[cibiPreferiti.length-1]);
		System.out.println("Il mio cibo che non � meglio ne peggio � " + cibiPreferiti[(cibiPreferiti.length-1)/2]);
		
	}

}
