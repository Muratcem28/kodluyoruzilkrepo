import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String userName, password;
        int controlValue;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adini giriniz : ");
        userName = input.nextLine();
        System.out.print("Lutfen sifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giris Yaptiniz !");
        } else {
            System.out.println("Kullanici adi veya parola hatali ! ");

                System.out.println("Sifrenizi sifirlamak ister misiniz?\n" +
                        "Sifrenizi sifirlamak isterseniz 1'e, istemezseniz 2'ye basiniz. ");
                controlValue = Integer.parseInt(input.nextLine());

                if (controlValue == 1) {
                    System.out.println("Yeni sifrenizi giriniz : ");
                    String passwordControl = input.nextLine();
                    if((passwordControl.equals("java101")) || passwordControl.equals(password)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz !");
                    }else {
                        System.out.print("Sifre olusturuldu !");
                    }

                } else if (controlValue == 2) {
                    System.out.println("Iyi gunler dileriz !");
                } else {
                    System.out.println("Yanlis ifade girdiniz ! ");

                }

            }



    }
}

/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
        unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/
