import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            for (int j = 0; j<4-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int p=0; p<4; p++){
            for (int l = 0; l<1+p; l++){
                System.out.print(" ");
            }
            for(int s = 6; s>(2*p-1) ; s--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
10 adet yıldız.
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */