import java.util.Scanner;
public class UsluBulucu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi , uslu , top , i ;

        System.out.print("Üssünü bulmak istediğiniz sayiyi giriniz : ");
        sayi = input.nextInt();
        top = sayi ;

        System.out.print("Üssü Kaç Olacak : ");
        uslu = input.nextInt();


        for (i = 1 ; i < uslu; i++)
        {
            top *= sayi ;
        }

        System.out.println(top);











    }
}
