import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        4000 bin yıldır kullanılan bir astroloji çeşididir
        Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
        Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde)
        sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

        Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen dogum yilinizi giriniz : ");
        int year = input.nextInt();
       // year %12 == 0
        if(year %12 == 0){
            System.out.print("Cin Zodyagi burcunuz : Maymun");
        }
        if(year %12 == 1){
            System.out.print("Cin Zodyagi burcunuz : Horoz");
        }
        if(year %12 == 2){
            System.out.print("Cin Zodyagi burcunuz : Köpek");
        }
        if(year %12 == 3){
            System.out.print("Cin Zodyagi burcunuz : Domuz");
        }
        if(year %12 == 4){
            System.out.print("Cin Zodyagi burcunuz : Fare");
        }
        if(year %12 == 5){
            System.out.print("Cin Zodyagi burcunuz : Öküz");
        }
        if(year %12 == 6){
            System.out.print("Cin Zodyagi burcunuz : Kaplan");
        }
        if(year %12 == 7){
            System.out.print("Cin Zodyagi burcunuz : Tavşan");
        }
        if(year %12 == 8){
            System.out.print("Cin Zodyagi burcunuz : Ejderha");
        }
        if(year %12 == 9){
            System.out.print("Cin Zodyagi burcunuz : Yılan");
        }
        if(year %12 == 10){
            System.out.print("Cin Zodyagi burcunuz : At");
        }
        if(year %12 == 11){
            System.out.print("Cin Zodyagi burcunuz : Koyun");
        }


    }
}
