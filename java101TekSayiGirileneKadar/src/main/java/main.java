import java.util.Scanner;

public class main {
    /*
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */
    public static void main(String[] args) {
        int value = 0, total = 0;
        do{
            System.out.print("Sayi Giriniz : ");
            Scanner input = new Scanner(System.in);
            value = input.nextInt();
            if(value % 2 == 0){
                total += value;
            }

        }while (value % 2  == 0);
        System.out.println("Cift ve dordun katlari olan sayilarin toplami : " + total);
    }
}
