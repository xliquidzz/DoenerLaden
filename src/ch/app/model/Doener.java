package ch.app.model;

import ch.app.model.concrete.Fladen;
import ch.app.model.decorator.concrete.Cocktail;
import ch.app.model.decorator.concrete.Pommes;

public abstract class Doener {

	private String beschreibung = " Doener";
	
	public String getBeschreibung() {
		return beschreibung;
	};
	
	public abstract double preis();

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	public static void main(String[] args) {
		Doener doener = new Pommes(new Cocktail(new Fladen()));;
		
		System.out.println("Ihr " + doener.getBeschreibung() + " Preis: " + doener.preis() 	+ "Fr." );
	}
}
