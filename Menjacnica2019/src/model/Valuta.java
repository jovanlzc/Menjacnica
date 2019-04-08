package model;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;

	public Valuta() {
	}
	
	public Valuta(String naziv,String skraceniNaziv) {
		this.naziv=naziv;
		this.skraceniNaziv=skraceniNaziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	
	
	
}
