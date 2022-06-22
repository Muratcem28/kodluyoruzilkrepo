import java.util.Scanner;

/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
public class main {
    public static void main(String[] args) {

        int value, j = 0, total = 0, average = 0;

        System.out.print("Bir sayi giriniz : ");
        Scanner input = new Scanner(System.in);

        value = input.nextInt();
        int i;

        for (i = 0; i <= value; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i != 0 ) {
                j++;
                total += i;
            }
        }
        average = (total / j);
        System.out.println(" 3 ve 4'e tam bolunen sayilarin ortalamasi : " + average);

    }
}
