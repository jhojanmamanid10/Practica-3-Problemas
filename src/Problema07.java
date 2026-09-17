import java.util.Scanner;

public class Problema07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuario = sc.nextLine();

        int diferentes = 0;

        for (char letra = 'a'; letra <= 'z'; letra++) {
            if (usuario.indexOf(letra) != -1) {
                diferentes++;
            }
        }

        if (diferentes % 2 == 0) {
            System.out.println("Resultado: CHAT WITH HER!");
        } else {
            System.out.println("Resultado: IGNORE HIM!");
        }

        sc.close();
    }
}