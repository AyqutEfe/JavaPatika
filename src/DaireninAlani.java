import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        int yaricap ;
        int aci ;
        double alan ;

        System.out.print("Lütfen yarıcap giriniz : ");
        yaricap = input.nextInt();

        System.out.print("Lütfen alanı bulunacak açıyı giriniz : ");
        aci = input.nextInt();

        alan = (pi*(yaricap*yaricap)*aci)/360;

        System.out.print("Girdiğiniz açının alanı : " + alan );

    }
}
