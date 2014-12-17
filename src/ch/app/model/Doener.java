package ch.app.model;

import ch.app.model.factory.SpeiseFactory;

public abstract class Doener implements Speise {

	private String beschreibung = " Doener";

	public String getBeschreibung() {
		return beschreibung;
	};

	public abstract double preis();

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public static void main(String[] args) {
		Speise speise = SpeiseFactory.erstelleSpeise("doener fladen");

		System.out.println("Ihr: " + speise.getBeschreibung() + " Preis: "
				+ speise.preis() + "Fr.");

		Speise speise1 = SpeiseFactory.erstelleSpeise("doener taschen");

		System.out.println("Hier bitte Ihr: " + speise1.getBeschreibung() + " Das macht "
				+ speise1.preis() + "Fr. Vielen Dank!");
	}
	
	
}
