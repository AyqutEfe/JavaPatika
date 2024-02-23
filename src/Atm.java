import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password;

        int hak = 3;
        int bakiye = 3500;
        int secim, ekmiktar, azmiktar;
        while (hak > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("Dilan Taşdemir") && password.equals("Aykutaşk")) {
                System.out.println("DilanBanka Hoşgeldiniz!");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçinizn");
                    System.out.println("""
                            1-Para Yatırma
                            2-Para Çekme
                            3-Bakiye Sorgulama
                            4-Çıkış Yap""");
                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                            ekmiktar = input.nextInt();
                            bakiye += ekmiktar;
                            System.out.println("Güncel Bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                            azmiktar = input.nextInt();
                            if (azmiktar > bakiye) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                bakiye -= azmiktar;
                                System.out.println("Güncel Bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                        case 4:
                            System.out.println(":) Tekrar Görüşmek Üzere :)");
                            break;
                        default:
                            System.out.println("Geçersiz işlem!");
                            break;
                    }
                } while (secim != 4);
                break;
            } else {
                hak--;
                System.out.println("Kullanıcı Adınız Veya Parolanız Yanlış");
                if (hak == 0) {
                    System.out.println("Banka Hesabınız Bloke olmuştur. Lütfen Banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}
