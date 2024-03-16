import java.util.Scanner;

public class RecursiveMetot {

    static int usAlma(int taban, int us) {
     if (us == 0){
         return 1;
     }
     else {
         return taban * usAlma(taban , us- 1);
     }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Giriniz : ");
        int taban = input.nextInt();

        System.out.print("Üs Giriniz : ");
        int us = input.nextInt();

        System.out.println("Sonucunuz : "+usAlma(taban , us));
    }
}
