import java.util.Scanner;

public class main {
    /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
    n’i n r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.

    C(n,r) = n! / (r! * (n-r)!)
     */
    public static void main(String[] args) {

        int n = 0, r = 0 , factN = 1, factR = 1 , gap, factG=1;

        System.out.print("Kumenin eleman sayisini giriniz(n degeri) : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.print("Elemanlar ile olusturulacak kume sayisini giriniz(r degeri) : ");
        r = input.nextInt();

        if(n<r){
            System.out.println("Girdiginiz sayilari kontrol ediniz. ");
        }
        else {
            for(int i = 1; i<=n ; i++){
                factN *=  i;
            }
            for(int i = 1; i<=r ; i++){
                factR *=  i;
            }
            gap = n-r;
            for(int i = 1; i<=gap ; i++){
                factG *=  i;
            }
            System.out.print("Kombinasyon Sonucu : " + (factN/(factR * factG)));
        }
    }
}
