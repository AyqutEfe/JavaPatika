import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        return reverseNumber == number;
    }


    public static void main(String[] args) {

        System.out.print("Kontrol Etmek istediğiniz sayıyı giriniz : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(isPalindrom(x));

    }
}
