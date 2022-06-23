import java.util.Scanner;

public class main {
    /*
    Java ile girilen sayının harmonik serisini bulan program yazacağız.
     */
    public static void main(String[] args) {
        int value = 0;
        double result = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik serisini bulmak istediginiz sayiyi giriniz : ");
        value = input.nextInt();

        if (value>0){
            ///////// Double i'ye dikkat edelim ! :)
            for(double i = 1; i<=value; i++){
                result += (1/i);
                System.out.println("deneme : " + result);
            }
                System.out.println("Sonuc : " + result);
        }else {
            System.out.println("Yanlis deger girdiniz. ");
        }

    }
}
