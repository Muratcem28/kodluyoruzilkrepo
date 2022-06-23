import java.util.Scanner;

public class main {
    /*
    Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

    Örnek : 1643 = 1 + 6 + 4 + 3 = 14
     */
    public static void main(String[] args) {

        int value, remainder, total = 0, temporary = 0;
        System.out.print("Sayi giriniz : ");
        Scanner input = new Scanner(System.in);
        value = input.nextInt();
        remainder = value;

        while(remainder>0){
            temporary = remainder%10;
            total += temporary;
            remainder /= 10;
        }
        System.out.print(value + " sayisinin basasamaklar toplami : " + total);
    }
}
