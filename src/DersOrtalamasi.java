import java.util.Scanner ;
public class DersOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float mat,fizik,kimya,turkce,tarih,muzik,ortalama,sonuc;

        System.out.print("Lütfen Matematik Notunuzu giriniz : ");
        mat = input.nextFloat();

        System.out.print("Lütfen Fizik Notunuzu giriniz : ");
        fizik = input.nextFloat();

        System.out.print("Lütfen Kimya Notunuzu giriniz : ");
        kimya = input.nextFloat();

        System.out.print("Lütfen Türkçe Notunuzu giriniz : ");
        turkce = input.nextFloat();

        System.out.print("Lütfen Tarih Notunuzu giriniz : ");
        tarih = input.nextFloat();

        System.out.print("Lütfen Müzik Notunuzu giriniz : ");
        muzik = input.nextFloat();

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6 ;
        sonuc = ortalama ;
        System.out.print("Ortalamanız : ");
        System.out.print(ortalama+"\n");
        boolean gectiMi = sonuc >=60;
        String str = gectiMi ? "Geçtiniz" : "Kaldınız";

        System.out.println(str);


    }
}
