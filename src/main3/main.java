package main3;

public class main {

	//Definire una classe  Veicolo con attributi coerenti, 
	//tra cui sicuramente devono essere presenti gli attributi "cavalli" e
	//  "sistemaFrenante".
	//Tale classe ha a disposizione tre classi figlie di veicoli: Motocicli,
	//   Automobili e Apecar. (NB: Scrivere i nomi delle classi al SINGOLARE)
	//Definire queste ultime come estensione della classe comune chiamata
	//   Veicolo.
	//Ogni Veicolo dovrà implementare, oltre agli attributi e ai costruttori
	//  comuni, anche i metodi:
	//-void accelera() {...};
	//-void decelera() {...};
	//- Nel metodo accelera() implementare un codice nel corpo tale che:
	//Se il valore dell'attributo "cavalli" supera 200 allora si stamperà 
	//'Questo veicolo accelera molto rapidamente'.
	//Se il valore dell'attributo "cavalli" supera 100 allora si stamperà 
	//'Questo veicolo accelera rapidamente'.
	//Altrimenti sarà stampato 'Questo veicolo ha un\'accelerazione nella 
	//media'.
	//- Nel metodo decelera() implementare un codice nel corpo tale che:
	//Se il valore dell'attributo "sistemaFrenante" è maggiore o uguale
	//ad 8 allora si stamperà 'Questo veicolo frena prontamente'.
	//Se il valore dell'attributo "sistemaFrenante" è maggiore o uguale 
	//a 6 allora si stamperà 'Questo veicolo frena con sufficiente rapidità'.
	//Altrimenti sarà stampato 'Questo veicolo ha un sistema frenante 
	//mediocre'.
	//Entrambi i metodi saranno poi sovrascritti da implementazioni più
	//specifiche nelle classi figlie.
	//- Implementare anche un metodo che stampi le caratteristiche della
//	    classe veicolo.
	//- Implementare, inoltre, almeno un metodo nella classe padre che sarà
//	    poi invocato su di un'istanza della classe figlia.
}
