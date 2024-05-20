import java.util.Scanner;

public class RecursiveAsal {

    static boolean asalKontrol(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        }
        if (bolen == sayi) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalKontrol(sayi, (bolen + 1));

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi Giriniz : ");
        int sayi = input.nextInt();

        boolean asalMi = asalKontrol(sayi, 2);

        if (asalMi) {
            System.out.println("Asaldır");
        } else {
            System.out.println("Asal Değildir");
        }
    }
}
