import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
         */
        int base = 0, exponent = 0, total =1 ;

        System.out.print("Ussu alinacak sayiyi giriniz : ");
        Scanner input = new Scanner(System.in);
        base = input.nextInt();
        System.out.print("Us olacak sayiyi giriniz : ");
        exponent = input.nextInt();

        for(int i=1; i<=exponent; i++){
            total = total * base ;
        }
        System.out.println(""+total);
    }
}
