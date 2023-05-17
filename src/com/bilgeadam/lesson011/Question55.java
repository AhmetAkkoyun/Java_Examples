package com.bilgeadam.lesson011;


/*
 * bir dizide 13 var ise 13 ve bir sonraki eleman toplama eklenmeden toplam sonucu bulan kor 
 */

public class Question55 {

	public static void main(String[] args) {
		
		int[]sayilar= {1,13,13,5,1};
		
		int toplam=0;
	    for (int i=0; i<sayilar.length; i++) {		    		    	
	      if (sayilar[i]==13 || (i>1&&sayilar[i-1]==13) ) {
	    	  continue;
	      } else {
	    	  toplam+=sayilar[i];
	      }
	    }
	    System.out.println(toplam);
	    
	}
			
}
