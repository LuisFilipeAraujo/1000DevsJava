import java.util.Scanner;

public class Grupo8_exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "s";;

        while(resposta.equalsIgnoreCase("s")) {
            System.out.println("Quer continuar o laço? (s/n): ");
            resposta = scanner.next();
        }
        
        System.out.println("Fim");
        scanner.close();
    }
}