import java.util.Scanner;

public class ZadanieD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = scan.nextInt();
        System.out.println("Podaj Y");
        int y = scan.nextInt();

        if(x > 0 && y > 0){
            System.out.println("Punkt (" + x + "," + y + ") leży w I ćwiartce układu współrzędnych");
        } else if(x < 0 && y > 0){
            System.out.println("Punkt (" + x + "," + y + ") leży w II ćwiartce układu współrzędnych");
        } else if(x < 0 && y < 0){
            System.out.println("Punkt (" + x + "," + y + ") leży w III ćwiartce układu współrzędnych");
        } else if(x > 0 && y < 0){
            System.out.println("Punkt (" + x + "," + y + ") leży w IV ćwiartce układu współrzędnych");
        } else if(x == 0 && y == 0) {
            System.out.println("Punkt (" + x + "," + y + ") jest początkiem układu współrzędnych");
        } else if(x == 0 && y != 0){
            System.out.println("Punkt (" + x + "," + y + ") leży na osi Y");
        } else if(x != 0 && y == 0) {
            System.out.println("Punkt (" + x + "," + y + ") leży na osi X");
        }
    }
}
