import java.util.Scanner;

public class Grupo8_exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Quer continuar o laço? (s/n): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));
        
        System.out.println("Fim");
        scanner.close();
    }
}
