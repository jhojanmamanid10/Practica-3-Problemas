import java.util.Scanner;

public class Problema06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fila = 0;
        int columna = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                int valor = sc.nextInt();

                if (valor == 1) {
                    fila = i;
                    columna = j;
                }
            }
        }

        int movimientos = Math.abs(fila - 2) + Math.abs(columna - 2);

        System.out.println("Resultado: " + movimientos);

        sc.close();
    }
}
