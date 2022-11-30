package marathonsoru3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {
	
	public  Hayvan hayvan;
	public MemeliHayvan memelihayvan;
	public Surungen surungen;
//	public Aslan aslan;
	List<Hayvan>memelihayvanlistesi = new ArrayList<>();
	List<Hayvan>surungenlistesi = new ArrayList<>();
	
	
	public HayvanatBahcesi(Hayvan hayvan) {
		super();
		this.hayvan = hayvan;
	}
	
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan memelihayvan)
	{
		memelihayvanlistesi.add(memelihayvan);
	}
	public void bahceyeSurungenEkle(Surungen surungen)
	{
		surungenlistesi.add(surungen);
	}
	public  void HayvanSesCikarsin(Hayvan hayvan) 
	{
		hayvan.sesCikar();
	}
	public  void HayvaninCinsiniBul(String hayvanAdi)
	{
		
	}
	public  void hayvaninBilgileriniYazdir(String hayvanAdi)
	{
		
	}
	public  void hayvaniHaretEttir(String hayvanAdi)
	{
		// interface dene
		for (Hayvan hayvan : memelihayvanlistesi) {
			
			if(hayvan.ad.equals(hayvanAdi))
			{
				memelihayvan.yuru();
			}
		
			else
			{
				System.out.println("yanlış değer girildi");
			}
			
		}
		
		for (Hayvan hayvan : surungenlistesi) {
			if(hayvan.ad.equals(hayvanAdi))
			{
				memelihayvan.yuru();
			}
		
			else
			{
				System.out.println("yanlış değer girildi");
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
