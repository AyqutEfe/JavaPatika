import java.util.Scanner;

public class RecursiveUs {

    static int us(int taban, int tavan) {
        if (tavan == 0) {
            return 1;
        }
        return taban * us(taban, (tavan - 1));
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz : ");
        int taban = input.nextInt();
        System.out.print("Tavan Değeri Giriniz : ");
        int tavan = input.nextInt();
        System.out.println(us(taban, tavan));

    }
}
