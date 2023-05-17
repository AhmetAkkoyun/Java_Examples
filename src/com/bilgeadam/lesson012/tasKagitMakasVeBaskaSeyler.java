package com.bilgeadam.lesson012;
import java.util.*;

public class tasKagitMakasVeBaskaSeyler {
    public static void main(String[] args) {
        List<String> secenekler = Arrays.asList("Taş", "Kağıt", "Makas");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Taş, kağıt, makas! Bir seçenek belirleyin: ");
            System.out.println("1. Taş");
            System.out.println("2. Kağıt");
            System.out.println("3. Makas");
            System.out.println("0. Çıkış");

            int kullaniciSecim = scanner.nextInt();

            if (kullaniciSecim == 0) {
                System.out.println("Oyun bitti. İyi günler!");
                break;
            } else if (kullaniciSecim < 1 || kullaniciSecim > 3) {
                System.out.println("Geçersiz bir seçenek girdiniz. Tekrar deneyin.");
                continue;
            }

            String kullaniciSecenek = secenekler.get(kullaniciSecim - 1);
            String bilgisayarSecenek = secenekler.get(random.nextInt(3));

            System.out.println("Siz: " + kullaniciSecenek);
            System.out.println("Bilgisayar: " + bilgisayarSecenek);

            if (kullaniciSecenek.equals(bilgisayarSecenek)) {
                System.out.println("Berabere! Tekrar deneyin.");
            } else if ((kullaniciSecenek.equals("Taş") && bilgisayarSecenek.equals("Makas")) ||
                    (kullaniciSecenek.equals("Kağıt") && bilgisayarSecenek.equals("Taş")) ||
                    (kullaniciSecenek.equals("Makas") && bilgisayarSecenek.equals("Kağıt"))) {
                System.out.println("Tebrikler! Kazandınız.");
            } else {
                System.out.println("Üzgünüm! Kaybettiniz.");
            }
        }
    }
}