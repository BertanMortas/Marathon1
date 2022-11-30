package marathonsoru3;

public class Yilan extends Surungen{

	public Yilan(String ad, int kilosu, int uzunlugu, boolean tehlikelimi) {
		super(ad, kilosu, uzunlugu, tehlikelimi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surun() {
		System.out.println(this.ad+ " sürünüyor");
		
	}

	@Override
	public void sesCikar() {
		System.out.println(this.ad+ "tıslıyor");
		
	}

}
