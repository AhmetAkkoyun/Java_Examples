package com.bilgeadam.lesson009_Maraton;
// AHMET AKKOYUN

public class CustomStringTR {
    
	private String x;         
    public CustomStringTR(String x) {
        this.x = x;
    }
    
    
    public int uzunluk() {
        return x.length();
    }
    
    
    public char karakter(int konum) {
        return x.charAt(konum);
    }
    
    
    public String birlestir(String ifade) {
        return x.concat(ifade);      
    }
    
    
    public String aralikDeger(int baslangic, int bitis) {
        return x.substring(baslangic, bitis);
    }
    
    
    public boolean icerirMi(String digerIfade) {
        return x.contains(digerIfade);   
    }
    

    public boolean esitMi(String ifade) {
        return x.equals(ifade);
    }
    
    
    public int ilkKonum(char c) {
        return x.indexOf(c);
    }   
    

    public int sonKonum(char c) {
        return x.lastIndexOf(c);
    }
    
    
    public String buyut() {
        return x.toUpperCase();
    }    
    
    
    public String kucult() {
        return x.toLowerCase();
    }

    
    public String degistir(char atilacak, char eklenecek) {
        return x.replace(atilacak, eklenecek);
    }

    
    public boolean ileBasliyorMu(String ifade) {
        return x.startsWith(ifade);
    }

    
    public boolean ileBitiyorMu(String ifade) {
        return x.endsWith(ifade);
    }


    public String kenarlariTemizle() {
        return x.trim();
    }
    
  
    public String[] ayir(String ifade) {
        return x.split(ifade);
    }
    
    
    public char[] diziYap() {
    	return x.toCharArray();	
    }
    
}
