package main2;

public class Uccello extends Animale {

	//attributo
	private boolean puoVolare;
	
	//costruttore
	public Uccello(String nome, int numero_zampe, boolean puoVolare) {
		super(nome, numero_zampe);
		// TODO Auto-generated constructor stub
		setPuoVolare(puoVolare);
		
		
		
	}
	
	//get e set
	public boolean isPuoVolare() {
		return puoVolare;
	}
	public void setPuoVolare(boolean puoVolare) {
		this.puoVolare = puoVolare;
	}

	//metodi
		@Override
		
		public void verso() {
			System.out.println("Il verso dell'animale è: cip ");
		}
}
