package main;

public class rettangolo {
/* Crea una classe rettangolo che abbia come attributi base e altezza ,
 *  e tre metodi costruttore,calcoloArea e calcolo perimetro. e nel file main
 *   chiedi all'utente di  fornirti i valori di una base e una altezza per 
 *   inizializzare un rettangolo e usa i suoi metodi per restituire a schermo l'area e il perimetro
 */
	
	//attributi
	private int base;
	private int altezza;
	
	//get e set
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		if(base > 0) {
			this.base = base;
		} else {
			System.out.println("La base non è maggiore di zero");
		}
		
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		if(altezza > 0) {
			this.altezza = altezza;
		} else {
			System.out.println("L'altezza non è maggiore di zero");
		}
		
	}
	
	//costruttore
	public rettangolo(int base, int altezza) {
		setBase(base);
		setAltezza(altezza);
		
	}

	
	//metodi
	public int calcoloArea() {
		int base = getBase();
		int altezza = getAltezza();
		
		return base * altezza;
	}
	
	public int calcoloPerimetro() {
		int base = getBase();
		int altezza = getAltezza();
		
		return (base * 2) + (altezza * 2);
	}
}
