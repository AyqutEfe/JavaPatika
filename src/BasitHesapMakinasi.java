import java.util.Scanner;
public class BasitHesapMakinasi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int say1, say2 , islem;

        double sonuc;

        System.out.print("İlk sayiyi giriniz : ");
        say1 = input.nextInt();

        System.out.print("İkinci sayiyi giriniz : ");
        say2 = input.nextInt();

        System.out.print("\n\nUygulamak istediğiniz işlemi seçiniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        islem = input.nextInt();

        switch (islem)
        {
            case 1 : sonuc = say1+say2 ;
                System.out.print("İşleminizin sonucu : " + sonuc);
                    break ;
            case 2 : sonuc = say1-say2 ;
                System.out.print("İşleminizin sonucu : " + sonuc);
                    break ;
            case 3 : sonuc = say1*say2;
                System.out.print("İşleminizin sonucu : " + sonuc);
                    break;
            case 4:
                if (say2 != 0) {
                    sonuc = (double) say1 / say2;
                    System.out.print("İşleminizin sonucu : " + sonuc);
                } else {
                    System.out.print("Bir sayı sıfıra bölünemez!");
                }
                break;


        }




    }
}