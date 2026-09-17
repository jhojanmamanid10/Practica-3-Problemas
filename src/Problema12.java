import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Resultado: Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Resultado: Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Resultado: Weird");
        } else {
            System.out.println("Resultado: Not Weird");
        }

        sc.close();
    }
}