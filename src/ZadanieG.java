import java.util.Scanner;

public class ZadanieG {
    public static void main(String[] args) {

        String[] imiona = new String[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pięć imion:");
        imiona[0] = scan.nextLine();
        imiona[1] = scan.nextLine();
        imiona[2] = scan.nextLine();
        imiona[3] = scan.nextLine();
        imiona[4] = scan.nextLine();
        scan.close();

        System.out.println("Cześć " + imiona[4]);
        System.out.println("Cześć " + imiona[3]);
        System.out.println("Cześć " + imiona[2]);
        System.out.println("Cześć " + imiona[1]);
        System.out.println("Cześć " + imiona[0]);
    }
}
