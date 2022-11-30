package marathonsoru3;

public class Aslan extends MemeliHayvan {

	public Aslan(String ad, int kilosu, int uzunlugu, boolean tehlikelimi) {
		super(ad, kilosu, uzunlugu, tehlikelimi);
		this.tehlikelimi=true;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yuru() {
		System.out.println(this.ad+" yürüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.ad+" kükrüyor");
		
	}

	@Override
	public String toString() {
		return "Aslan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikelimi=" + tehlikelimi
				+ "]";
	}

}
