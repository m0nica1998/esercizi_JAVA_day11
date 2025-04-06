package main3;

public class Automobile extends Veicolo{
	
	//attributi
	private int ruote;

	//costruttore
	public Automobile(int cavalli, int sistemaFrenante, String marca, int ruote) {
		super(cavalli, sistemaFrenante, marca);
		// TODO Auto-generated constructor stub
		setRuote(ruote);
	}

	//get e set
	public int getRuote() {
		return ruote;
	}

	public void setRuote(int ruote) {
		if(ruote == 4) {
			this.ruote = ruote;
		} else {
			System.out.println("il veicolo non è un'automobile");
		}
		
	}
	
	//metodi
	
		@Override
		public void accelera() {
			if(ruote == 4) {
				if(getCavalli() >= 200) {
					System.out.println("Questo veicolo accelera molto rapidamente");
				} else if(getCavalli() > 100 && getCavalli() < 200) {
					System.out.println("Questo veicolo accelera rapidamente");
				} else {
					System.out.println("Questo veicolo ha un\'accelerazione nella media");
				}
			}
		
		}
		
		@Override
		public void decelera() {
			if(ruote == 4) {
				if(getSistemaFrenante() >= 8) {
					System.out.println("Questo veicolo frena prontamente");
				} else if(getSistemaFrenante() >= 6 && getSistemaFrenante() < 8) {
					System.out.println("Questo veicolo frena con sufficiente rapidità");
				} else {
					System.out.println("Questo veicolo ha un sistema frenante mediocre");
				}
			}
			
		}

}
