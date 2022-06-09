import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu metre cinsinden giriniz : ");
        boy = input.nextFloat();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = input1.nextFloat();

        indeks = (kilo/boy*boy);
        System.out.print("Vucut kitle indeksiniz : " + indeks);
    }
}
