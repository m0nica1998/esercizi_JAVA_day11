package main2;

public class Cane extends Animale {

	//Definire altre due classi figlie che abbiano i loro attributi specifici,
		//i loro metodi costruttori ed implementino il metodo che restituisce il 
		//verso in modo differente dalla classe padre.
		//Testare il tutto nella classe main
	
	//attributo
	private boolean guinzaglio;
	
	//costruttore
	public Cane(String nome, int numero_zampe, boolean guinzaglio) {
		super(nome, numero_zampe);
		// TODO Auto-generated constructor stub
		setGuinzaglio(guinzaglio);
		
		
	}
	 
	
	
	
	//get e set
	public boolean isGuinzaglio() {
		return guinzaglio;
	}
	public void setGuinzaglio(boolean guinzaglio) {
		this.guinzaglio = guinzaglio;
	}
	
	//metodi
	@Override
	
	public void verso() {
		System.out.println("Il verso dell'animale è: bau ");
	}
	
}
