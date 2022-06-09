import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double km,perKm=2.2;

        System.out.print("Lutfen gideceginiz mesafeyi km cinsinden yaziniz : ");
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        double startPrice = km*perKm<10 ? 10 : km*perKm;
        double price =  startPrice > 20  ? 20 : (startPrice);

        System.out.print("Taksimetre tutariniz : " + price  );


    }
}

/*
* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
* */
