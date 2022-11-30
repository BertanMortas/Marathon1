package marathonsoru3;

public abstract class Surungen extends Hayvan{

	public Surungen(String ad, int kilosu, int uzunlugu, boolean tehlikelimi) {
		super(ad, kilosu, uzunlugu, tehlikelimi);
		
	}

	public abstract void surun();
	
}
