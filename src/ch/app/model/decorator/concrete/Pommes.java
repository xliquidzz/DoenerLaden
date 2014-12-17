package ch.app.model.decorator.concrete;

import ch.app.model.Doener;
import ch.app.model.decorator.DoenerDecorator;

public class Pommes extends DoenerDecorator {
	
	private Doener doener;

	public Pommes(Doener doener) {
		this.doener = doener;
	}

	@Override
	public double preis() {
		return 3.00 + doener.preis();
	}
	
	public String getBeschreibung() {
		return doener.getBeschreibung() + ", Pommes";
	}
}
