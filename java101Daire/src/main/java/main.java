import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        double r, pi=3.14, alan, cevre, a ;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen dairenin yaricapini giriniz : ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alani : " + alan + "\n Dairenin cevresi : " + cevre);

        System.out.print("Lutfen merkez aci olcusunu giriniz : ");
        a = input.nextDouble();
        a = (pi * ( r * r ) * a)/360;
        System.out.print("A merkez acili dairenin alani : " + a);
    }
}

/*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
