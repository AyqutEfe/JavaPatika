import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a , b , c ;

        System.out.print("Lütfen Birinci Kenarı Giriniz : ");
        a = input.nextInt();

        System.out.print("Lütfen İkinci Kenarı Giriniz : ");
        b = input.nextInt();

        System.out.print("Lütfen Üçüncü Kenarı Giriniz :  ");
        c = input.nextInt();

        double Cevre = (a+b+c)/2;
        double Alan = Math.sqrt(Cevre*(Cevre-a)*(Cevre-b)*(Cevre-c));

        System.out.print("Üçgenin Alanı : " + Alan);







    }
}
