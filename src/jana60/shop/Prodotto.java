package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

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
	String marca, nome;
	float prezzoBase;
	int iva;
	DecimalFormat df = new DecimalFormat ("#.00€");
     Prodotto(String marca, String nome, float prezzoBase, int iva ) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.prezzoBase = prezzoBase;
		this.iva = iva;
	}
	float prezzoTotale()
	{
		return prezzoBase + ((prezzoBase/100)*iva);
	}
	public String toString()
	{
		return "Il prezzo del prodotto" +nome+marca+" è: " + df.format(prezzoTotale());
	}
	}



