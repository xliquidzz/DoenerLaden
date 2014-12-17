package ch.app.model.decorator.concrete;

import ch.app.model.Doener;
import ch.app.model.decorator.DoenerDecorator;

public class Kabis extends DoenerDecorator{
	
	private Doener doener;
	
	public Kabis(Doener doener) {
		this.doener = doener;
	}
	
	@Override
	public double preis() {
		return 0.50 + doener.preis();
	}
	
	public String getBeschreibung() {
		return doener.getBeschreibung() + ", Kabis";
	}
}
