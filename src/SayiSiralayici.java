import java.util.Scanner;
public class SayiSiralayici
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a , b , c ;

        System.out.print("İlk sayıyı giriniz : ");
        a = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        b = input.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        c = input.nextInt();

        // a nın en küçük olma durumu

        if (a < b && a < c)
        {
            if (b < c)
            {
                System.out.println(a+"<"+b+"<"+c);
            }
            else
            {
                System.out.println(a+"<"+c+"<"+b);
            }
        }


        // b nin en küçük olma durumu

        else if (b < a && b < c)
        {
            if (a < c)
            {
                System.out.println(b+"<"+a+"<"+c);
            }
            else
            {
                System.out.println(b+"<"+c+"<"+a);
            }
        }

        // c nin en küçük olma durumu
        else
        {
         if (a < b)
         {
             System.out.println(c+"<"+a+"<"+b);
         }
         else
         {
             System.out.println(c+"<"+b+"<"+a);
         }


        }
    }
}
