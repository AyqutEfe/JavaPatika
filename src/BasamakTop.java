import java.util.Scanner;

public class BasamakTop {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int sayi , birlerBasamagi , basamakToplami = 0 ;

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        while (sayi != 0)
        {
            birlerBasamagi = sayi % 10 ;
            basamakToplami += birlerBasamagi ;
            sayi /= 10 ;
        }

        System.out.println(basamakToplami);

    }
}
