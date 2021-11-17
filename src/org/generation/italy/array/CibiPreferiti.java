package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		String[] cibiPreferiti = {"Pizza", "Gelato", "Carbonara", "Lasagna", "Amatriciana", "Ragù", "Kebab", "Anelli di Cipolla", "Er Panino de Pippo a Tivoli", "Katsudon"};
		
		int lunghezzaArray = cibiPreferiti.length;
		
		System.out.println("La classifica è composta da: " + lunghezzaArray + " cibi");
		
		System.out.println("Il mio cibo più preferito tra i preferiti è " + cibiPreferiti[0]);
		System.out.println("Il mio cibo meno preferito tra i preferiti è " + cibiPreferiti[cibiPreferiti.length-1]);
		System.out.println("Il mio cibo che non è meglio ne peggio è " + cibiPreferiti[(cibiPreferiti.length-1)/2]);
		
	}

}
