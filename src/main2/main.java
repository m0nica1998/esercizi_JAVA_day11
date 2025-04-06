package main2;

import java.util.Scanner;

public class main {
 //Definire una classe Animale che implementi dei metodi che saranno 
//implementati in una classe più specifica.
//Tale classe avrà più costruttori, un metodo che permetta di descrivere
//le istanze della classe , un metodo proprio ed un altro metodo che 
//restituisca, in modo generico, il verso dell’animale.
//Definire altre due classi figlie che abbiano i loro attributi specifici,
//i loro metodi costruttori ed implementino il metodo che restituisce il 
//verso in modo differente dalla classe padre.
//Testare il tutto nella classe main 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il nome dell'animale");
		String nome_animale = scan.next();
		System.out.println("Inserisci il numero di zampe dell'animale");
		int numero_zampe_animale = scan.nextInt();
		
		Animale animale1 = new Animale(nome_animale, numero_zampe_animale);
		Animale animale2 = new Animale(nome_animale);
		
		animale1.specie("gatto");
		animale2.verso();
		
		Cane cane1 = new Cane(nome_animale, numero_zampe_animale, true);
		cane1.verso();
		
		
		Uccello uccello1 = new Uccello(nome_animale, numero_zampe_animale, false);
		uccello1.verso();
		scan.close();
		
		
		
		
	}
}
