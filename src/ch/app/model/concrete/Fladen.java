package ch.app.model.concrete;

import ch.app.model.Doener;

public class Fladen extends Doener {

	public Fladen() {
		setBeschreibung("Fladen" + getBeschreibung());
	}
	
	public double preis() {
		return 5.00;
	}
}
