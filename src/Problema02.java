import java.util.Scanner;

public class Problema02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] palabras = new String[n];

        for (int i = 0; i < n; i++) {
            palabras[i] = sc.next();
        }

        System.out.println("Datos de entrada:");
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            System.out.println(palabras[i]);
        }

        System.out.println("\nResultado:");

        for (int i = 0; i < n; i++) {

            String palabra = palabras[i];

            if (palabra.length() > 10) {
                System.out.println(
                    palabra.charAt(0) +
                    "" +
                    (palabra.length() - 2) +
                    palabra.charAt(palabra.length() - 1)
                );
            } else {
                System.out.println(palabra);
            }
        }

        sc.close();
    }
}