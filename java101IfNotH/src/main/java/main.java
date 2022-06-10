import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik, sayac = 1;
        double ortalama;

        System.out.println("Notlarinizi tek tek giriniz.");
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        if (0 > matematik || 100 < matematik) {
            matematik = 0;
        } else {
            //     sayac++;
        }

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if (0 > fizik || 100 < fizik) {
            fizik = 0;
        } else {
            sayac++;
        }

        System.out.print("Turkce notunuzu giriniz : ");
        turkce = input.nextInt();
        if (0 > turkce || 100 < turkce) {
            turkce = 0;
        } else {
            sayac++;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if (0 > kimya || 100 < kimya) {
            kimya = 0;

        } else {
            sayac++;
        }

        System.out.print("Muzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if (0 > muzik || 100 < muzik) {
            muzik = 0;
        } else {
            sayac++;
        }


        ortalama = ((matematik + fizik + turkce + kimya + muzik) / (sayac));
        System.out.println("Ortalamaniz : " + ortalama);

        if (ortalama > 55) {
            System.out.println("Tebrikler gectiniz ! :) ");
        } else {
            System.out.println("Uzgunuz kaldiniz ! :(");
        }


    }

//    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
}
