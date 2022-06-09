import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        double r, pi=3.14, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen dairenin yaricapini giriniz : ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.print("Dairenin alani : " + alan + "\n Dairenin cevresi : " + cevre);
    }
}

/*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360*/
