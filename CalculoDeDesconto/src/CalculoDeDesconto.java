/* Calculo de Desconto em Compra: Implemente um programa que calcule o desconto em uma compra
 com base no valor total. Se o valor total for maior que R$ 100,00 reais, aplique um desconto de 10%. 

 Solicite o valor da compra e informe o valor final com o
Radar de Velocidade: Desenvolva um algoritmo que leia a velocidade de um veículo e uma velocidade máxima. 
Exiba uma mensagem informando se o veículo excedeu 7% da velocidade máxima.*/

import java.util.Scanner;

public class CalculoDeDesconto {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double valorCompra, valorTotal;

        valorCompra = teclado.nextDouble();
        valorTotal = 0;
        

        if (valorCompra > 100.00){
            valorTotal = valorCompra * 0.90;
            System.out.println(valorTotal);
        }

        teclado.close();
    }
}
