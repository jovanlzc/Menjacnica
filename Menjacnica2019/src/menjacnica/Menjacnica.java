package menjacnica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import imenjacnica.IMenjacnica;
import model.DnevniValutniKurs;
import model.Kurs;
import model.Valuta;

public class Menjacnica implements IMenjacnica{

	private List<DnevniValutniKurs> listaDnevnihKurseva;
	
	public Menjacnica() {
		listaDnevnihKurseva = new LinkedList<>();
	}
	

	@Override
	public void dodajKurs(Valuta valuta, Kurs kurs, Date datum) {

		if(valuta==null||kurs==null||datum==null)
			throw new RuntimeException("Morate uneti valutu,kurs i datum!");
		listaDnevnihKurseva.add(new DnevniValutniKurs(valuta, kurs, datum));

		
	}

	@Override
	public void obrisiKurs(Valuta valuta, Date datum) {
		// TODO Auto-generated method stub
		if(valuta==null || datum==null)
			throw new RuntimeException("Morate uneti vrednost valute i datuma");
		for(DnevniValutniKurs dvk : listaDnevnihKurseva) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			if(sdf.format(dvk.getDatum()).equals(sdf.format(datum)) && dvk.getValuta().equals(valuta)) {
				boolean izbrisan=listaDnevnihKurseva.remove(dvk);
				if(!izbrisan) {
					throw new RuntimeException("Ne postoji kurs valute za uneti datum!");
				}
				return;
			}
		}
		throw new RuntimeException("Ne postoji valuta ili kurs za uneti datum!");
	}

	@Override
	public Kurs pronadjiKurs(Valuta valuta, Date datum) {
		// TODO Auto-generated method stub
		for(DnevniValutniKurs dvk : listaDnevnihKurseva) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			if(sdf.format(dvk.getDatum()).equals(sdf.format(datum)) && dvk.getValuta().equals(valuta)) {
				return dvk.getKurs();
			}
		}
		throw new RuntimeException("Ne postoji kurs za datu valutu i datum!");
	}

}
