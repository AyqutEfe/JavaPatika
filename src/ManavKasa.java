import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00 ;

        System.out.print("Armuttan kaç kilo : ");
        armut *= input.nextDouble();

        System.out.print("Elmadan kaç kilo : ");
        elma *= input.nextDouble();

        System.out.print("Domatesden kaç kilo : ");
        domates *= input.nextDouble();

        System.out.print("Muzdan kaç kilo : ");
        muz *= input.nextDouble();

        System.out.print("Patlıcandan kaç kilo : ");
        patlican *= input.nextDouble();

        double gunah = armut + elma + domates + muz + patlican ;

        System.out.print("Günahınız : " + gunah);

    }



}
