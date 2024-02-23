import java.util.Scanner;
public class EbsEks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Kaç tane sayı gireceksiniz : ");
        int sayac = input.nextInt();

        if (sayac <= 0) {
            System.out.println("Lütfen geçerli bir sayı girin.");
            return;
        }

        System.out.print("Lütfen 1. sayıyı giriniz : ");
        int sayi = input.nextInt();

        int eb = sayi;
        int ek = sayi;


        for (int i = 2 ;i <= sayac ;i++)
        {
            System.out.print("Lütfen " + i + ". sayıyı giriniz : ");
            sayi = input.nextInt();

            if (sayi <= ek)
            {
                ek = sayi ;
            }

            if (sayi >= eb)
            {
                eb = sayi ;
            }


        }
            System.out.println("En Küçük Sayı : " + ek);
            System.out.println("En Büyük Sayı : " + eb);




    }
}
