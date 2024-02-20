import java.util.Scanner;
public class BurcBulucu
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day , month ;


        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        day =  input.nextInt();


        if (month == 1)
        {
            if (day <= 21)
            {
                System.out.print("Oğlak Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Kova Burcusunuz");
            }
        }


        if (month == 2)
        {
            if (day <= 19)
            {
                System.out.print("Kova Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Balık Burcusunuz");
            }
        }


        if (month == 3)
        {
            if (day <= 20)
            {
                System.out.print("Balık Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Koç Burcusunuz");
            }
        }


        if (month == 4)
        {
            if (day <= 20)
            {
                System.out.print("Koç Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Boğa Burcusunuz");
            }
        }


        if (month == 5)
        {
            if (day <= 21)
            {
                System.out.print("Boğa Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("İkizler Burcusunuz");
            }
        }


        if (month == 6)
        {
            if (day <= 22)
            {
                System.out.print("İkizler Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Yengeç Burcusunuz");
            }
        }


        if (month == 7)
        {
            if (day <= 22)
            {
                System.out.print("Yengeç Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Aslan Burcusunuz");
            }
        }


        if (month == 8)
        {
            if (day <=22)
            {
                System.out.print("Aslan Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Başak Burcusunuz");
            }
        }


        if (month == 9)
        {
            if (day <=22 )
            {
                System.out.print("Başak Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Terazi Burcusunuz");
            }
        }


        if (month == 10)
        {
            if (day <=22)
            {
                System.out.print("Terazi Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Akrep Burcusunuz");
            }
        }


        if (month == 11)
        {
            if (day <=21)
            {
                System.out.print("Akrep Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Yay Burcusunuz");
            }
        }


        if (month == 12)
        {
            if (day <= 21)
            {
                System.out.print("Yay Burcusunuz");
            }
            else if (day < 32)
            {
                System.out.print("Oğlak Burcusunuz");
            }
        }

    }
}
