import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double number1, number2;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen ilk sayiyi giriniz :");
        number1 = input.nextDouble();

        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        number2 = input.nextDouble();

        System.out.print("Yapacaginiz islemi giriniz : \n Toplam icin 1 : " +
                "\n Cikarma icin 2: \n Carpma icin 3 :\n Bolme icin 4 :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (number1 + number2));
                break;

            case 2:
                System.out.println("Cikarma : " + (number1 - number2));
            break;

            case 3:
                System.out.println("Carpim : " + (number1 * number2));
                break;

            case 4:
                if (number2 == 0){
                    System.out.println("0 ile sayilari bolemezsiniz. ");
                }
                else{
                System.out.println("Bolme : " + (number1/ number2));
                }

                break;
            default:
                System.out.println("Yanlis giris yaptiniz. Tekrar Deneyiniz.");
                break;

        }

    }
}
//hesap makinesini switch-case kullanarak yapınız.