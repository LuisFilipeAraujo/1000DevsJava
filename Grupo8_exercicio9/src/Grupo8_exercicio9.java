import java.util.Scanner;

public class Grupo8_exercicio9 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int intervalo0a25 = 0;
        int intervalo26a50 = 0;
        int intervalo51a75 = 0;
        int intervalo76a100 = 0;

        while (true){
            System.out.println("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if(numero < 0 || numero > 100){
                System.out.println("Digite apenas valores entre 0 e 100");
                continue;
            }
           

            if (numero >= 0 && numero <= 25){
                intervalo0a25++;
            }
            else if (numero >= 26 && numero <= 50){
                intervalo26a50++;
            }
            else if (numero >= 51 && numero <= 75){
                intervalo51a75++;
            }
            else if (numero >= 76 && numero <= 100){
                intervalo76a100++;
            }

            System.out.println("Quantidade de numeros no intervalo de 0 a 25: " + intervalo0a25);
            System.out.println("Quantidade de numeros no intervalo de 26 a 50: " + intervalo26a50);
            System.out.println("Quantidade de numeros no intervalo de 51 a 75: "+ intervalo51a75);
            System.out.println("Quantidade de numeros no intervalo de 76 a 100: " + intervalo76a100);
            
        }
       
    }
}
