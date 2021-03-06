package ch.app.model.decorator.concrete;

import ch.app.model.Doener;
import ch.app.model.decorator.DoenerDecorator;

public class Salat extends DoenerDecorator {

	private Doener doener;

	public Salat(Doener doener) {
		this.doener = doener;
	}

	@Override
	public double preis() {
		return 0.80 + doener.preis();
	}

	public String getBeschreibung() {
		return doener.getBeschreibung() + ", Salat";
	}
}
