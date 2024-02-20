import java.util.Scanner;
public class UcakBileti
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int km , yolculukTipi , yas ;
        double tutar ;

        System.out.println("Yolculuk tipinizi giriniz\n1 => Tek Yön\n2 => Gidiş Dönüş");
        yolculukTipi = input.nextInt();

        if (yolculukTipi >= 3 || yolculukTipi <= 0)
        {
            System.out.println("\n!!!Hata!!!\n>>Yolculuk tipini yanlış girdiniz!!");
            return;
        }

        System.out.print("Mesafeyi \"Km\" Cinsinden Giriniz : ");
        km = input.nextInt();

        if (km < 0)
        {
            System.out.print("\n!!!Hata!!!\n>>Mesafe Sadece Pozitif Olabilir");
            return;
        }

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        if (yas < 0)
        {
            System.out.print("\n!!!Hata!!!\n>>Yaşınız Sadece Pozitif Olabilir");
            return;
        }

        tutar = km * 0.10 ;

        // Yaş indirimi

        if (yas <= 12)
        {
            tutar *= 0.50 ;
        }
        else if (yas <= 24)
        {
            tutar *= 0.90 ;
        }
        else if (yas >= 65)
        {
            tutar *= 0.70 ;
        }

        // Gidiş Dönüş İndirimi

        if (yolculukTipi == 2)
        {
            tutar *= 0.80 ;
        }

        System.out.println("Toplam Tutar : "+ tutar +"TL");




    }
}
