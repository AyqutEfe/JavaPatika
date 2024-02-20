import java.util.Scanner;
public class CiftSayiToplayici
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam =0 , say ;
        do
        {
            System.out.print("Sayi Giriniz : ");
            say = input.nextInt();
            if (say%4 != 0)
            {
                break;
            }
            else
            {
                toplam += say;
            }
        }
        while (say>0);

        System.out.println("Girdiğiniz Sayıların Toplamı : " + toplam);
    }
}
