import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican =5.0f;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen aldiginiz urunlerin kilolarini yaziniz\nArmut kac kilo ? : ");

        float armutDeger = input.nextFloat() * armut;
        System.out.print("Elma kac kilo ? : ");
        float elmaDeger =input.nextFloat() * elma;
        System.out.print("Domates kac kilo ? : ");
        float domatesDeger = input.nextFloat() * domates;
        System.out.print("Muz kac kilo ? : ");
        float muzDeger = input.nextFloat() * muz;
        System.out.print("Patlican kac kilo ? : ");
        float patlicanDeger = input.nextFloat() * patlican;

        float toplam = armutDeger + elmaDeger + domatesDeger + muzDeger + patlicanDeger;
        System.out.println("Toplam tutar : " + toplam);
    }
}

