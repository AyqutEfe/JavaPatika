import java.util.Scanner;
public class VucutEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy,indeks;

        System.out.print("Lütfen kilonuzu \"Kg\" cinsinden giriniz : ");
        kilo = input.nextDouble();

        System.out.print("Lütfen Boyunuzu \"M\" cinsinden giriniz : ");
        boy = input.nextDouble() ;

        indeks = kilo / (boy*boy) ;

        System.out.println("Vücut kitle indeksiniz : " + indeks);

    }
}
