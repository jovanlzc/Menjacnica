package model;

import java.util.Date;

public class DnevniValutniKurs {
	private Valuta valuta;
	private Kurs kurs;
	private Date datum;
	
	public DnevniValutniKurs() {
		
	}
	public DnevniValutniKurs(Valuta valuta,Kurs kurs,Date datum) {
		this.valuta=valuta;
		this.kurs=kurs;
		this.datum=datum;
	}
	public Valuta getValuta() {
		return valuta;
	}
	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}
	public Kurs getKurs() {
		return kurs;
	}
	public void setKurs(Kurs kurs) {
		this.kurs = kurs;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	
}
