import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int dikkenar1, dikkenar2, karelerToplami;
        double hipotenus, cevre, u, alan;
        System.out.print("Birinci dik kenari giriniz : ");
        Scanner deger1 = new Scanner(System.in);
        dikkenar1 = deger1.nextInt();

        System.out.print("Ikinci dik kenari giriniz : ");
        Scanner deger2 = new Scanner(System.in);
        dikkenar2 = deger2.nextInt();
        karelerToplami = dikkenar1*dikkenar1 + dikkenar2*dikkenar2;
        hipotenus = Math.sqrt(karelerToplami);

        cevre = dikkenar1+dikkenar2+hipotenus;
        u = cevre/2;
        alan = Math.sqrt(u * (u-dikkenar1)* (u-dikkenar2)*(u-hipotenus));
        System.out.print("Hipotenus değeri : " + hipotenus + " Cevre hesabı : " + cevre + (" Alan hesabi : " + alan));
    }
}
