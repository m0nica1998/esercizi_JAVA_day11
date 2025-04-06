package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci un valore intero per la base");
		int base = scan.nextInt();
		System.out.println("Inserisci un valore intero per l'altezza");
		int altezza = scan.nextInt();
		
		rettangolo mioRettangolo = new rettangolo(base, altezza);
	int area =	mioRettangolo.calcoloArea();
	int perimetro =	mioRettangolo.calcoloPerimetro();
		
	System.out.println("L'area è di " + area);
	System.out.println("Il perimetro è di " + perimetro);
	
		scan.close();
	}
}
