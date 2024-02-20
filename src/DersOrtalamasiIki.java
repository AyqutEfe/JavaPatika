import java.util.Scanner;
public class DersOrtalamasiIki
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int matematik , fizik , turkce , kimya , muzik ;

        System.out.print("Matematik : ");
        matematik = input.nextInt();
        if (matematik < 0 || matematik > 100 )
        {
            System.out.print("Lütfen 0 ile 100 aralığında bir değer giriniz .");
            return;
        }
        System.out.print("Fizik : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100)
        {
            System.out.print("Lütfen 0 ile 100 aralığında bir değer giriniz .");
            return;
        }

        System.out.print("Türkçe : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100)
        {
            System.out.print("Lütfen 0 ile 100 aralığında bir değer giriniz .");
            return;
        }

        System.out.print("Kimya : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100)
        {
            System.out.print("Lütfen 0 ile 100 aralığında bir değer giriniz .");
            return;
        }

        System.out.print("Müzik : ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100)
        {
            System.out.print("Lütfen 0 ile 100 aralığında bir değer giriniz .");
            return;
        }

        double ortalama = (matematik+fizik+turkce+kimya+muzik) /5;

        if (ortalama < 55)
        {

            System.out.print("Ortalamanız : "+ortalama+"Sınıfta Kaldınız .");
        }
        else
        {
            System.out.print("Ortalamanız : "+ortalama+"Sınıfı Geçtiniz .");
        }





    }
}
