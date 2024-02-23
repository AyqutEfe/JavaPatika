import java.util.Scanner ;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısı Gİriniz : ");
        int basamak = input.nextInt();


        for (int i = basamak; i >= 1;i--)
        {
            for (int k = 1 ; k <= i  ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
