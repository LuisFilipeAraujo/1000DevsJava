import java.util.Scanner;

public class Grupo8_exercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int pares=0;
        int impares=0;
        int somaPares = 0;
        int somaImpares = 0;
        
        String escolhaMenu; 

        do { 
            System.out.print("Digite um valor inteiro: "); 
            int valor = scanner.nextInt(); 

            if (valor % 2 == 0) { 
                somaPares += valor; 
                pares++; 

            } else { 
                somaImpares += valor; 
                impares++; 
            } 
            System.out.print("Deseja digitar outro valor? (s/n): "); 
            escolhaMenu = scanner.next(); 

            scanner.nextLine();//limpando buffer

        } while (escolhaMenu.equalsIgnoreCase("s"));

        double mediaPares = (pares > 0) ? (double) somaPares / pares : 0; 
        double mediaImpares = (impares > 0) ? (double) somaImpares / impares : 0;

        System.out.println("Média Pares: " + mediaPares); 
        System.out.println("Média Impares: " + mediaImpares); 

        scanner.close(); 
    } 
}
