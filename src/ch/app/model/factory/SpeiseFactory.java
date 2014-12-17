package ch.app.model.factory;

import ch.app.model.Speise;
import ch.app.model.concrete.Fladen;
import ch.app.model.concrete.PizzaSalami;
import ch.app.model.concrete.Taschen;

public class SpeiseFactory {
	
	public static Speise erstelleSpeise(String bestellung) {
		Speise speise = null;
		
		if (bestellung.equals("doener fladen")) {
			speise = new Fladen();
		} else if (bestellung.equals("doener taschen")) {
			speise = new Taschen();
		} else if (bestellung.equals("pizza salami")) {
			speise = new PizzaSalami();
		}
		
		return speise;
	}
}
