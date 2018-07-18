public class ZadanieC {
    public static void main(String[] args) {

        System.out.println("Pierwsza wersja: ");
        double i = 0;
        while(i <= 3.1) {
            System.out.printf("%.1f,", i);
            i = i + 0.1;
        }

        System.out.println("\n" + "Druga wersja: ");
        double a = 0;
        do {
            System.out.printf("%.1f,", a);
            a = a + 0.1;
        } while (a <= 3.1);
    }
}
