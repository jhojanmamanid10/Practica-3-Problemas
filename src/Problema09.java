import java.util.Scanner;

public class Problema09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int original = numero;
        int invertido = 0;

        if (numero < 0) {
            System.out.println("Resultado: false");
        } else {

            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero = numero / 10;
            }

            if (original == invertido) {
                System.out.println("Resultado: true");
            } else {
                System.out.println("Resultado: false");
            }
        }

        sc.close();
    }
}