import java.util.Scanner ;
public class CinZodyagi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int yil ;

        System.out.print("Doğum Yılınızı Giriniz : ");
        yil = input.nextInt();

        yil %= 12;

        switch (yil){
            case 0 :

                System.out.println("Çin Zodyağı hayvanınız \"Maymun\"");
                break;

            case 1 :

                System.out.println("Çin Zodyağı hayvanınız \"Horoz\"");
                break;

            case 2 :

                System.out.println("Çin Zodyağı hayvanınız \"Köpek\"");
                break;

            case 3:

                System.out.println("Çin Zodyağı hayvanınız \"Domuz\"");
                break;

            case 4 :

                System.out.println("Çin Zodyağı hayvanınız \"Fare\"");
                break;

            case 5 :

                System.out.println("Çin Zodyağı hayvanınız \"Öküz\"");
                break;

            case 6 :

                System.out.println("Çin Zodyağı hayvanınız \"Kaplan\"");
                break;

            case 7 :

                System.out.println("Çin Zodyağı hayvanınız \"Tavşan\"");
                break;

            case 8 :

                System.out.println("Çin Zodyağı hayvanınız \"Ejderha\"");
                break;

            case 9 :

                System.out.println("Çin Zodyağı hayvanınız \"Yılan\"");
                break;

            case 10 :

                System.out.println("Çin Zodyağı hayvanınız \"At\"");
                break;

            case 11 :

                System.out.println("Çin Zodyağı hayvanınız \"Koyun\"");
                break;










        }
    }
}
