import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int km ;

        System.out.print("Lütfen kaç km yol gideceğinizi yazınız : ");
        km = input.nextInt();

        double toplam = (km*2.20) + 10 ;
        toplam = (toplam < 20) ? 20 : toplam;

        System.out.print("Ödenemiz gereken tutar : " + toplam);

    }
}
