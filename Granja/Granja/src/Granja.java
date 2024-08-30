/* granja Frangotech possui um controle automatizado de cada frango da sua produção. 
No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o 
tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, 
faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos que deverá ser informado pelo usuário. */

import java.util.Scanner;

public class Granja {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        double valorChip;
        double valorTotalChip;
        double valorAnel;
        double valorTotalAnel;
        double gastoTotal; 

        System.out.print("Digite o número de frangos: ");
        int numFrangos = scan.nextInt();

        valorChip = 4;
        valorTotalChip = valorChip * numFrangos;
        valorAnel = 3.50;
        valorTotalAnel = valorAnel * (numFrangos * 2);
        gastoTotal = valorTotalChip + valorTotalAnel; // custo para marcar todos os frangos 

        System.out.println("Valor total a ser gasto: R$ " + gastoTotal);
        scan.close();
    }
}
