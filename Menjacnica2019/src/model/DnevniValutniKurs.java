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
		if(valuta==null)
			throw new RuntimeException("Morate proslediti valutu!");
		this.valuta = valuta;
	}
	public Kurs getKurs() {
		return kurs;
	}
	public void setKurs(Kurs kurs) {
		if(kurs==null)
			throw new RuntimeException("Morate proslediti kurs!");
		this.kurs = kurs;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		if(datum==null)
			throw new RuntimeException("Morate proslediti datum!");
		this.datum = datum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((valuta == null) ? 0 : valuta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DnevniValutniKurs other = (DnevniValutniKurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (valuta == null) {
			if (other.valuta != null)
				return false;
		} else if (!valuta.equals(other.valuta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DnevniValutniKurs [valuta=" + valuta + ", kurs=" + kurs + ", datum=" + datum + "]";
	}
	
	
}
