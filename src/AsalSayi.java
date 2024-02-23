public class AsalSayi {
    public static void main(String[] args) {
        int sayac = 100;

        for (int i = 2; i <= sayac; i++) {
            boolean asal = true;
            for (int k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}
