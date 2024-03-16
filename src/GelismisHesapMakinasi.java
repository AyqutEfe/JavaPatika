import java.util.Scanner;
public class GelismisHesapMakinasi {

    static void toplama(int a, int b) {
        int sonuc = a + b;
        System.out.println("==========================\n" + "Sonuc : " + sonuc + "\n==========================");
    }

    static void cikarma(int a, int b) {
        int sonuc = a - b;
        System.out.println("==========================\n" + "Sonuc : " + sonuc + "\n==========================");
    }

    static void carpma(int a, int b) {
        int sonuc = a * b;
        System.out.println("==========================\n" + "Sonuc : " + sonuc + "\n==========================");
    }

    static void bolme(double a, double b) {
        if (b == 0){
            System.out.println("==========================\nİkinci sayı 0 olamaz !!!!\n==========================");
            return;
        }
        double sonuc = a / b;
        System.out.println("==========================\n" + "Sonuc : " + sonuc + "\n==========================");
    }

    static void uslu(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        System.out.println("==========================\n" + "Sonuc : " + sonuc + "\n==========================");
    }

    static void faktor(int a) {
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            sonuc *= i;
        }
        System.out.println("==========================\n" + "Sonuc : " + sonuc + "\n==========================");
    }


    static void mod(int a, int b) {
        int sonuc = a % b;
        System.out.println("==========================\n" + "Sonuc : " + sonuc + "\n==========================");
    }

    static void dortgen(int a, int b) {
        int alan = a * b, cevre = a + b;
        System.out.println("==========================\n" + "Alan : " + alan + "\nÇevre : " + cevre + "\n==========================");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select;

        String menu = """
                      1- Toplama İşlemi
                      2- Çıkarma İşlemi
                      3- Çarpma İşlemi
                      4- Bölme işlemi
                      5- Üslü Sayı Hesaplama
                      6- Faktoriyel Hesaplama
                      7- Mod Alma
                      8- Dikdörtgen Alan ve Çevre Hesabı
                      0- Çıkış Yap
                      ==========================
                      """;

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            if (select > 8){
                System.out.println("!!! HATA !!! GEÇERSİZ SAYI !!!");
                break;
            }

            System.out.print("İlk sayıyı giriniz : ");
            int a = input.nextInt();

            System.out.print("İkinci sayıyı giriniz : ");
            int b = input.nextInt();

            switch (select) {

                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    uslu(a, b);
                    break;
                case 6:
                    faktor(a);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    dortgen(a, b);



            }

        }

    }
}