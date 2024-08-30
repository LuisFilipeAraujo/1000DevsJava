/*EXERCICIO 3 - Faça um algoritmo para calcular quantas 
ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
O usuário devera informar a quantidade de cavalos adquiridos. */

import java.util.Scanner;

public class Ferradura {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é um algoritmo para calcular quantas \r\n" + //
                        "ferraduras são necessárias para equipar todos os cavalos comprados para um haras");
        Scanner scanner = new Scanner(System.in);
        
        int numCavalos;
        int ferradurasNecessarias;
        double valorFerradura;
        double valorTotal;

        System.out.println("Informe a quantidade de cavalos: ");
        numCavalos = scanner.nextInt();

    
        System.out.println("Informe o valor por ferradura: ");
        valorFerradura = scanner.nextDouble();


        ferradurasNecessarias = numCavalos*4;
        valorTotal = ferradurasNecessarias * valorFerradura;

        System.out.println("A quantidade de ferraduras necessarias: " + ferradurasNecessarias);
        System.out.print("O valor total será: " + valorTotal);

        scanner.close();
    }
}
