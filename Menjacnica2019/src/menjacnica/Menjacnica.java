package menjacnica;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import imenjacnica.IMenjacnica;
import model.DnevniValutniKurs;
import model.Kurs;
import model.Valuta;

public class Menjacnica implements IMenjacnica{
	List<DnevniValutniKurs> dnevniValutniKursevi;
	
	public Menjacnica() {
		dnevniValutniKursevi= new LinkedList<>();
	}
	@Override
	public void dodajKurs(Valuta valuta, Kurs kurs, Date datum) {
		// TODO Auto-generated method stub
		if(valuta!=null && kurs!=null && datum!=null) {
			DnevniValutniKurs dvk = new DnevniValutniKurs(valuta, kurs, datum);
			dnevniValutniKursevi.add(dvk);
			return;
		}
		throw new RuntimeException("Morate uneti valutu,kurs i datum!");
		
		
	}

	@Override
	public void obrisiKurs(Valuta valuta, Date datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs pronadjiKurs(Valuta valuta, Date datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
