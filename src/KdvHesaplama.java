import java.util.Scanner ;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret değerini giriniz: ");
        double ucret = input.nextInt();
        double kdv = ucret >= 1000 ? 8 : 18;
        double vergiliUcret = ucret + (ucret*kdv / 100);
        System.out.print("Alacağınız ürünün KDV ile oluşan yeni fiyatı: " + vergiliUcret);

    }
}
