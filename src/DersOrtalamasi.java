import java.util.Scanner ;
public class DersOrtalamasi {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        float mat,fizik,kimya,turkce,tarih,muzik,ortalama,sonuc;

        System.out.print("Lütfen Matematik Notunuzu giriniz : ");
        mat = imput.nextFloat();

        System.out.print("Lütfen Fizik Notunuzu giriniz : ");
        fizik = imput.nextFloat();

        System.out.print("Lütfen Kimya Notunuzu giriniz : ");
        kimya = imput.nextFloat();

        System.out.print("Lütfen Türkçe Notunuzu giriniz : ");
        turkce = imput.nextFloat();

        System.out.print("Lütfen Tarih Notunuzu giriniz : ");
        tarih = imput.nextFloat();

        System.out.print("Lütfen Müzik Notunuzu giriniz : ");
        muzik = imput.nextFloat();

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6 ;
        sonuc = ortalama ;
        System.out.print("Ortalamanız : ");
        System.out.print(ortalama+"\n");
        boolean gectiMi = sonuc >=60;
        String str = gectiMi ? "Geçtiniz" : "Kaldınız";

        System.out.println(str);


    }
}
