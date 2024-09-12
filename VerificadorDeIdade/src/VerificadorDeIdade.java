/*Verificador de Idade para Habilitação: Escreva um 
programa que peça ao usuário sua idade e verifique 
se ele pode obter uma carteira de habilitação. As 
regras são: a idade mínima é 18 anos. Exiba uma 
mensagem indicando se o usuário pode ou não obter a 
habilitação. */

import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int idade;

        idade = teclado.nextInt();

        if (idade>=18) {
            System.out.println("Você pode obter habilitação!");
        }
        else{
            System.out.println("Você não pode obter habilitação!");
        }

        teclado.close();
    }
}
