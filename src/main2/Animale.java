package main2;

public class Animale {
	//Definire una classe Animale che implementi dei metodi che saranno 
	//implementati in una classe più specifica.
	//Tale classe avrà più costruttori, un metodo che permetta di descrivere
	//le istanze della classe , un metodo proprio ed un altro metodo che 
	//restituisca, in modo generico, il verso dell’animale.
	
	
	//attributi
	private String nome;
	private int numero_zampe;
	
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != "") {
			this.nome = nome;
		} else {
			System.out.println("Il nome deve essere maggiore di zero");
		}
		
	}
	public int getNumero_zampe() {
		return numero_zampe;
	}
	public void setNumero_zampe(int numero_zampe) {
		if(numero_zampe >= 0) {
			this.numero_zampe = numero_zampe;
		} else {
			System.out.println("Il numero di zampe deve essere maggiore o ugual a zero");
		}
		
	}
	
	public Animale(String nome) {
		setNome(nome);
		
	}
	
	public Animale(String nome, int numero_zampe) {
		setNome(nome);
		setNumero_zampe(numero_zampe);
		
	}
	
	public void specie(String specie) {
		System.out.println("La specie dell'animale è: " + specie);
	}
	
	public void verso() {
		System.out.println("Il verso dell'animale è: miao ");
	}
}




