import java.util.Scanner;

public class Problema08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int objetivo = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (numeros[i] + numeros[j] == objetivo) {
                    System.out.println("Resultado: [" + i + ", " + j + "]");
                }
            }
        }

        sc.close();
    }
}