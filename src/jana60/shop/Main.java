package jana60.shop;

public class Main {

	public static void main(String[] args) {
		/*Stiamo lavorando per un sito di e-commerce e dobbiamo gestirne i prodotti.
		Consegna:
		Nel progetto java-oop-shop, package jana60.shop e creare la classe Prodotto che gestisce i prodotti dello shop.
		Un prodotto è caratterizzato da:
		marca
		nome
		prezzo
		iva
		Scegliere opportunamente il tipo di dato per gli attributi
		Aggiungere un costruttore che inizializza tutti gli attributi.
		Aggiungere dei metodi per:
		calcolare il prezzo comprensivo di iva
		formattare il prezzo restituendo una stringa con un determinato numero di decimali e il carattere €
		Per testare le funzionalità della classe prodotto aggiungere una classe Main con metodo main dove istanziare degli oggetti Prodotto e chiamarne i vari metodi (i valori degli attributi possono essere scelti arbitrariamente da voi programmatori)
		*/
		Prodotto[] Prodotti = new Prodotto[4];
		Prodotto smartphone = new Prodotto("Samsung", "Galaxy", 350f, 22);
		Prodotto cuffieWireless = new Prodotto("Apple", "Airpods",170f, 22);
		Prodotto tv = new Prodotto("Lg", "Smart Tv", 400f, 22);
		Prodotto tablet = new Prodotto("Lenovo", "IdeaPad", 199f, 22);
		
		Prodotti[0] = smartphone;
		Prodotti[1] = cuffieWireless;
	    Prodotti[2] = tv;
	    Prodotti[3] = tablet;
	    
	    for(int i=0; i<Prodotti.length; i++) {
	    	System.out.println(Prodotti[i].toString());
	    	
	    	}
	    }
	}


