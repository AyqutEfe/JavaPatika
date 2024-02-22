import java.util.Scanner;
public class FaktorBulucu
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i , sayi ,faktor = 1 ;

        System.out.print("Faktöriyelini bulmak istediğiniz sayıyı giriniz : ");
        sayi = input.nextInt();

        for (i = 1; i <= sayi ; i++)
        {
            faktor *=  i;
        }

        System.out.print(sayi+"sayısının faktöriyeli : "+faktor);
    }
}
