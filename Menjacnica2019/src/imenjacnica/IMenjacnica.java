package imenjacnica;

import java.util.Date;

import model.Kurs;
import model.Valuta;

public interface IMenjacnica {
	void dodajKurs(Valuta valuta,Kurs kurs,Date datum);
	void obrisiKurs(Valuta valuta,Date datum);
	Kurs pronadjiKurs(Valuta valuta,Date datum);
}
