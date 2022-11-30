package marathonsoru3;

public abstract class Hayvan {
	
	public String ad;
	public int kilosu;
	public int uzunlugu;
	public boolean tehlikelimi;
	
	public Hayvan(String ad, int kilosu, int uzunlugu, boolean tehlikelimi) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		this.tehlikelimi = tehlikelimi;
	}
	
	public abstract void sesCikar();
	

}
