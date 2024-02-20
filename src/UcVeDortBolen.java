import java.util.Scanner;
public class UcVeDortBolen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max , ort = 0 , tane = 0 , i ;

        System.out.print("Bir sayi giriniz : ");
        max = input.nextInt();

        for (i = 1; i < max; i++)
        {
            if (i%3 == 0 && i%4 == 0){
                ort += i;
                tane += 1;
            }
        }

        ort /=tane ;

        System.out.println("Girdiğiniz sayiya kadar olan sayılardan 3 ve 4 ün katı olanların ortalaması : "+ort);
    }
}
