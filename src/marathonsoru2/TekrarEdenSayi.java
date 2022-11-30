package marathonsoru2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TekrarEdenSayi {
//	Metod parametre olarak int dizisi alacak ve ilk tekrar eden sayıyı bulup ekrana yazdıracaktır. 
//	Tekrar eden sayı bulunmazsa “ Tekrar eden sayı bulunamamıştır.” yazacaktır.
	
	public static String tekrar(int[] arr){
        ArrayList<Integer> sayılar = new ArrayList<Integer>();
        int tekrar = 0;
      //  int i;
        String sonuç;
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]){  
                    sayılar.add(arr[j]);
                } 
            }  
        }  
        if(!sayılar.isEmpty()){
            for(int i = 0; i < arr.length; i++) { 
                if(arr[i] == sayılar.get(0)){
                    tekrar++;
                }
            }
        } 
        if(tekrar != 0){
            sonuç = ""+ sayılar.get(0) +" " + tekrar + " kez tekrar ediyor";
        }
        else{
            sonuç = "Tekrar eden sayı bulunamamıştır.";
        }
        return sonuç;
    }
	

	public static void main(String[] args) {
		
		int sayiDizisi[] = { 9, 5, 7, 3, 18, 2, 0};
		
		System.out.println(tekrar(sayiDizisi));


	}

}
