import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve
    sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */
    public static void main(String[] args) {

        int mesafe, yasBilgisi, yolculukTipi;
        double kmUcreti = 0.10, toplamFiyat ;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen gideceginiz mesafenin km degerini giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Lutfen yasinizi giriniz : ");
        yasBilgisi = input.nextInt();
        System.out.print("Lutfen Tek yon yolculuk yapmak icin 1, Gidis-Donus yolculuk yapmak icin 2 yaziniz : ");
        yolculukTipi = input.nextInt();

        toplamFiyat = (kmUcreti*mesafe);

        if (yolculukTipi == 1 && mesafe>0 && yasBilgisi > 0){
            if (yasBilgisi<12){
                toplamFiyat -= toplamFiyat*(0.5);
            } else if (yasBilgisi>11 && yasBilgisi<25){
                toplamFiyat -= toplamFiyat*(0.1);
            } else if(yasBilgisi>65) {
                toplamFiyat -= toplamFiyat*(0.3);
            } else {
            }
            System.out.println("Gideceginiz mesafe : " + mesafe + "\n Yasiniz : "
                    + yasBilgisi + "\n Yolculuk tipi : " + yolculukTipi + "\n Toplam fiyat : " + toplamFiyat
                    +"\n Iyi yolculuklar dileriz ! :) ");
        }
  //      System.out.println("" + toplamFiyat);
        else if (yolculukTipi ==2 && mesafe > 0 && yasBilgisi > 0) {
            toplamFiyat -= toplamFiyat*(0.2);
            if (yasBilgisi<12){
                toplamFiyat -= toplamFiyat*(0.5);
            } else if (yasBilgisi>11 && yasBilgisi<25){
                toplamFiyat -= toplamFiyat*(0.1);
            } else if(yasBilgisi>65) {
                toplamFiyat -= toplamFiyat*(0.3);
            } else {
            }
            System.out.println("Gideceginiz mesafe : " + mesafe + "\n Yasiniz : "
                    + yasBilgisi + "\n Yolculuk tipi : " + yolculukTipi + "\n Toplam fiyat : " + toplamFiyat
                    +"\n Iyi yolculuklar dileriz ! :) ");
        } else {
            System.out.println("Yalnis deger girdiniz ! Girdiginiz bilgileri kontrol ediniz ! ");
        }
    }
}
