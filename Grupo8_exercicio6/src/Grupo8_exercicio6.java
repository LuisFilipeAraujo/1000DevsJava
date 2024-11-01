import java.util.Scanner;

public class Grupo8_exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um int: ");
            int valor = scanner.nextInt();
            
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

        scanner.close();
    }
}

