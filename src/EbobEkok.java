import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int big , small , ebob , ekok;
        System.out.print("İlk sayıyı giriniz : ");
        int n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        int n2 = input.nextInt();

        if (n1 >= n2)
        {
            big = n1;
            small = n2;
        }
        else
        {
            big = n2;
            small = n1;
        }

        int i = small;
        ebob = 1;
        while (i >= 1)
        {
            if (small % i == 0 && big % i == 0)
            {
                ebob = i;
                break;
            }
            i-- ;
        }

        System.out.println("Ebobu : "+ebob);
        ekok = 1 ;
        ekok = (n1 * n2) / ebob;
        System.out.println("Ekoku : " + ekok);



        }
}
