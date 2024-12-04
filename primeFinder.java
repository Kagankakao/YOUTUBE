import java.util.ArrayList;
import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        ArrayList<Integer> prime_numbers = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;

            for (int k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                prime_numbers.add(i);
            }
        }

        System.out.println(prime_numbers);
    }
}