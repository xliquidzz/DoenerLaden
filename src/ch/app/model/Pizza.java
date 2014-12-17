package ch.app.model;

public abstract class Pizza implements Speise{
	private String beschreibung = "Pizza";
	
	public String getBeschreibung() {
		return beschreibung;
	};
	
	public abstract double preis();

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
}
