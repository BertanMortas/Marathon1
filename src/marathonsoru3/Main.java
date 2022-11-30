package marathonsoru3;

public class Main {

	public static void main(String[] args) {
		
		Aslan aslan = new Aslan("simba", 100, 120, true);
		Yilan yilan = new Yilan("terminatör",20,225,true);
		
		
		HayvanatBahcesi hb = new HayvanatBahcesi(aslan);
		
//		aslan.yuru();
//		hb.hayvan.sesCikar();
		//hb.aslan.yuru();
		hb.bahceyeMemeliHayvanEkle(aslan);
		hb.bahceyeSurungenEkle(yilan);
		String a= "leo";
		
		hb.bahceyeMemeliHayvanEkle(new Aslan(a,123,12,true));
		hb.hayvaniHaretEttir(a);
		
		
		
		

	}

}
