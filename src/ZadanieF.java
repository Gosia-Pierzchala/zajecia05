import java.util.Scanner;

public class ZadanieF {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        int userInput = scan.nextInt();

        while(userInput <= 100 || userInput >= 200 || userInput%3!=0) {
            if (userInput < 100) {
                System.out.println("Podana liczba jest za mała" + "\n" + "Podaj liczbę");
                userInput = scan.nextInt();
            }
            if (userInput > 200) {
                System.out.println("Podana liczba jest za duża" + "\n" + "Podaj liczbę");
                userInput = scan.nextInt();
            }
            if (userInput %3!= 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3" + "\n" + "Podaj liczbę");
                userInput = scan.nextInt();
            }
        }
        System.out.println("Twoja liczba jest ok");

    }
}
