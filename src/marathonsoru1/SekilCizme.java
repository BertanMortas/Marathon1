package marathonsoru1;

public class SekilCizme {
	
	
	public static void sekilciz()
	{
		
		for (int i = 0; i < 4; i++)
		{
			
			System.out.println("* * * * * * *");
		}
			
			for (int j = 6; j > 0; j--) 
			{
				
				if(j==6)
				{
					System.out.println("* * * * * *");
				}	
				else if(j==5)
				{
					System.out.println("* * * * *");
				}	
				else if(j==4)
				{
					System.out.println("* * * *");
				}	
				else if(j==3)
				{
					System.out.println("* * *");
				}	
				else if(j==2)
				{
					System.out.println("* *");
				}	
				else if(j==1)
				{
					System.out.println("*");
				}	
				
				
			}
			
		
	
		
	}
	

	// soruda yeni bir main classı açın yazmadığı için buradan devam ettim 
	// eğer main classı açsaydık SekilCizme skl = new SekilCizme(); olarak nesne yaratıp devam ederdik

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sekilciz();

	}

}
