public class ZadanieE {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        while(i <= 100) {
            if(i%2==0){
                System.out.println(i);
                sum = sum + i;
                i++;
            } else {
                i++;
            }
        }
        System.out.println("Suma to: " + sum);

    }
}
