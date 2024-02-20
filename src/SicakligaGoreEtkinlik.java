import java.util.Scanner;
public class SicakligaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik ;

        System.out.print("Sıcaklık Giriniz :  ");
        sicaklik = input.nextDouble();

        if (sicaklik <= 5)
        {
            System.out.print("Bugün hava kayak yapmaya uygun ");
        }

        else if (sicaklik >= 5 && sicaklik < 15 )
        {
            System.out.print("Bugün hava sinemaya gitmek için uygun ");
        }

        else if (sicaklik >= 15 && sicaklik < 25)
        {
            System.out.print("Bugün hava pikniğe gitmek için uygun ");
        }

        else if (sicaklik >= 25)
        {
            System.out.print("Bugün hava yüzmeye gitmek için uygun ");
        }

    }
}
