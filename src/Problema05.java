import java.util.Scanner;

public class Problema05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] puntos = new int[n];

        for (int i = 0; i < n; i++) {
            puntos[i] = sc.nextInt();
        }

        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (puntos[i] >= puntos[k - 1] && puntos[i] > 0) {
                contador++;
            }
        }

        System.out.println("Resultado: " + contador);

        sc.close();
    }
}