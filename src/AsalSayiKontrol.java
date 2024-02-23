import java.util.Scanner;
public class AsalSayiKontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi , asalMi = 0 ;

        System.out.print("Kontrol etmek istediğiniz sayiyi yaziniz : ");
        sayi = input.nextInt();
        for (int i = 2 ; i < sayi ; i++)
        {
            if (sayi % i == 0)
            {
                asalMi += 1 ;
                break;
            }
        }

        if (asalMi == 0)
        {
            System.out.print(sayi + " Asal bir sayıdır");
        }else{
            System.out.print(sayi + " Asal sayi değildir");
        }




    }
}
