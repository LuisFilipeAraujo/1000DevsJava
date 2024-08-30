/*Exercício 01: Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo.
 Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro quadrado.*/ 

import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o lado frente do terreno: ");
        double ladoFrente = ler.nextDouble();
        
        System.out.print("Informe o lado lateral do terreno: ");
        double ladoLateral = ler.nextDouble();
        
        double area = ladoFrente * ladoLateral;
        double valorVenda = area * 300;
        
        System.out.println("Área do terreno: " + area + " m²");
        System.out.println("Valor de venda do terreno: R$ " + valorVenda);
        
        ler.close();
       
    }
}
