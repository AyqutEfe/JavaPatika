import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi, sifre;

        System.out.print("Adınızı Giriniz : ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("Aykut") && sifre.equals("Efe123"))
        {
            System.out.println("Giriş Yaptınız");
        }
        else
        {
            System.out.println("Giriş Başarısız oldu");
            System.out.print("Şifrenizi yenilemek istiyorsanız 1 sayısını giriniz: ");
            int sifreDegisim = input.nextInt();

            if (sifreDegisim == 1)
            {
                input.nextLine();

                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                String yeniSifre = input.nextLine();

                if (yeniSifre.equals("Efe123"))
                {
                    System.out.println("Girmiş olduğunuz şifre eski şifreyle aynı");
                } else
                {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
            }
        }
    }
}
