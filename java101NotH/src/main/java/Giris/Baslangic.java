package Giris;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class Baslangic {

    public static void main(String[] args) {
        int matematik, fizik, turkce, tarih, muzik;
        int ders_sayisi = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzunu giriniz : ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuzunu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Turkce notunuzunu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzunu giriniz : ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuzunu giriniz : ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + turkce + tarih + muzik);

        double ortalama = (toplam / ders_sayisi);

        System.out.println("Ortalamaniz = " + ortalama);

        String sonuc = (ortalama <= 60) ? "Sinifta Kaldiniz :( " : "Sinifi Geçtiniz :) ";

        System.out.println(sonuc);
    }
}
