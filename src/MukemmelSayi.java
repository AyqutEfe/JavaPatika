import java.util.Scanner ;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0 ;

        System.out.print("Bir Sayi Giriniz : ");
        int n = input.nextInt();


        for (int i = 1 ; i < n ; i++)
        {
            if (n % i == 0)
            {
                total += i ;
            }
        }

        if (total == n)
        {
            System.out.print(n + " Bir Mükemmel Sayıdır !!");
        }
        else
        {
            System.out.println(n + " Bir Mükemmel Sayı Değildir !!");
        }

    }
}
