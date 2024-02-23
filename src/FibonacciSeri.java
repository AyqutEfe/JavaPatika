import java.util.Scanner;

public class FibonacciSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayac;
        int sayi1 = 0, sayi2 = 1, sonuc = 0;

        System.out.print("Fibonacci serisinin kaçıncı elemanını bulalım : ");
        sayac = input.nextInt();

        if (sayac == 0) {
            sonuc = sayi1;
        } else if (sayac == 1) {
            sonuc = sayi2;
        } else {
            for (int i = 2; i <= sayac; i++) {
                sonuc = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2 = sonuc;
            }
        }

        System.out.println(sayac + ". Fibonacci sayısı: " + sonuc);
    }
}
