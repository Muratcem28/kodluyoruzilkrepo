import java.util.Scanner;

public class main {
    /*
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;

    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
    tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
      */

    public static void main(String[] args) {

        double para_degeri;
        double KDV_turari;
        double KDV_orani;

        Scanner deger = new Scanner(System.in);
        System.out.print("Lutfen para miktarini giriniz : ");

        para_degeri = deger.nextDouble();

        Double sonuc =  (para_degeri<1001) ? (para_degeri+(para_degeri*(0.18))) : (para_degeri+(para_degeri*(0.08)));
        System.out.println(sonuc);
        KDV_turari = sonuc - para_degeri;
        KDV_orani = 100*((sonuc-para_degeri)/para_degeri);

        System.out.println("KDV'siz fiyat : " + para_degeri + "\n KDV'li fiyat : "
                + sonuc + "\n KDV tutari : " + KDV_turari + "\n KDV orani : " + KDV_orani);






    }
}
