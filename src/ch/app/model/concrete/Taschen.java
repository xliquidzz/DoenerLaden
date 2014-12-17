package ch.app.model.concrete;

import ch.app.model.Doener;

public class Taschen extends Doener {

	public Taschen() {
		setBeschreibung("Taschen " + getBeschreibung());
	}

	@Override
	public double preis() {
		return 4.00;
	}
	
}
