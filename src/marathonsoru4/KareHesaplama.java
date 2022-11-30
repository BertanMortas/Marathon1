package marathonsoru4;

public class KareHesaplama {
	
	public int karealanhesapla(int kenar1)
	{
		int alan;
		
		int knr = Integer.valueOf(kenar1);
		alan = knr*knr;
		
		return alan;
	}
	public int karecevrehesapla(int kenar1)
	{
		int alan;
		
		int knr = Integer.valueOf(kenar1);
		alan = knr*4;
		
		return alan;
	}
	

}
