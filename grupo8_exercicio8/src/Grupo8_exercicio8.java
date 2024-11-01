import java.util.Scanner;

public class Grupo8_exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        int numero = scanner.nextInt();

        int maior = numero;
        int menor = numero;

        for (int i = 2; i < 7; i++) {
            System.out.print("Digite o : " + i + "º número: ");
            numero = scanner.nextInt();
            
            if (numero > maior) {
                maior=numero;
                
            } else if (numero < menor) {
                menor = numero;
            }

            System.out.println("Maior Número da rodada: " + maior);
            System.out.println("Menor Número da rodada: " + menor);
        }

        System.out.println("Maior Número de todos: " + maior);
        System.out.println("Menor Número de todos: " + menor);

        scanner.close();
    }
}
