import java.util.Scanner ;
public class Kombinasyon
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int say1 , say2 , fak1 = 1 ,fak2 = 1 , fak3 = 1 , komb  ;

        System.out.print("İlk Sayıyı Giriniz : ");
        say1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        say2 = input.nextInt();

        for(int i = 1 ; i <= say1 ;i++)
        {
            fak1 *= i ;
        }

        for (int i = 1 ; i <= say2 ;i++)
        {
            fak2 *= i ;
        }

        for (int i = 1 ; i <= say1-say2 ;i++)
        {
            fak3 *= i ;
        }

        komb = fak1 / (fak2 *fak3);

        System.out.print("Girdiğiniz Sayıların Kombinasyonu : " + komb);
    }
}
