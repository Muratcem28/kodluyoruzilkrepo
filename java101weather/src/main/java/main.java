import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik degerini giriniz : ");
        heat = input.nextInt();

        if(heat<5){
            System.out.println("Evde yapboz yapabilirsin.");
        }
        else if (heat<=15){
            System.out.println("Findik toplamaya gidebilirsin. ");
        }
        else if (heat<=25) {
            System.out.println("Mangal yakmaya gidebilirsin");
        }
        else {
            System.out.println("Yaylaya cikabilirsin");
        }
    }
}
