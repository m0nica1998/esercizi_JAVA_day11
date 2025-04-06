package main3;

public class Veicolo {
	
	//attributi
    private int cavalli;
    private int sistemaFrenante;
    private String marca;
    
    
    //get e set
	public int getCavalli() {
		return cavalli;
	}
	public void setCavalli(int cavalli) {
		if(cavalli > 0) {
			this.cavalli = cavalli;
		}
		
	}
	public int getSistemaFrenante() {
		return sistemaFrenante;
	}
	public void setSistemaFrenante(int sistemaFrenante) {
		
		if(sistemaFrenante > 0) {
			this.sistemaFrenante = sistemaFrenante;
		} else {
			System.out.println("Il valore di sistemaFrenante deve essere maggiore di zero");
		}
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca != "") {
			this.marca = marca;
		} else {
			System.out.println("la marca deve essere diversa da stringa vuota");
		}
		
	}
	
	// cortruttore
	public Veicolo(int cavalli, int sistemaFrenante, String marca) {
		setCavalli(cavalli);
		setSistemaFrenante(sistemaFrenante);
		setMarca(marca);
	}
	
	//metodi
	
	public void accelera() {
		if(cavalli >= 200) {
			System.out.println("Questo veicolo accelera molto rapidamente");
		} else if(cavalli > 100 && cavalli < 200) {
			System.out.println("Questo veicolo accelera rapidamente");
		} else {
			System.out.println("Questo veicolo ha un\'accelerazione nella media");
		}
	}
	
	public void decelera() {
		if(sistemaFrenante >= 8) {
			System.out.println("Questo veicolo frena prontamente");
		} else if(sistemaFrenante >= 6 && sistemaFrenante < 8) {
			System.out.println("Questo veicolo frena con sufficiente rapidità");
		} else {
			System.out.println("Questo veicolo ha un sistema frenante mediocre");
		}
	}
	
	public void caratteristiche() {
		System.out.println(cavalli);
		System.out.println(sistemaFrenante);
		System.out.println(marca);
	}
	
}
