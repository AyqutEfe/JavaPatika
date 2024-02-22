import java.util.Scanner ;
public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n ;
        double sonuc = 0 ;

        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (double i = 1 ; i <= n ;i++)
        {
            sonuc += 1 / i ;

        }

        System.out.println(sonuc);
    }
}
