import java.util.Scanner;

public class main {
    /*
    Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */
    public static void main(String[] args) {

        int value = 0, powerFour = 0, powerFive = 0;
        System.out.print("Bir sayi giriniz : ");

        Scanner input = new Scanner(System.in);
        value = input.nextInt();
        if(value < 4){
            System.out.print("4 veya 5 in katlari bulunmamaktadir.");
        }
        else {
            for (int i = 4; i <= value; i *= 4) {
                System.out.println("4 un katlari : " + i);
            }
            for (int i = 5; i <= value; i *= 5) {
                System.out.println("5 in katlari : " + i);
            }
        }


    }
}
