/*A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, 
uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, 
e que a rodela de hambúrguer pesa 120 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, 
e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.*/

import java.util.Scanner;

public class Hamburgueria{
    public static void main(String[] args) {
        
      Scanner scan = new Scanner (System.in);
      double queijoGramas = 100;
      double presuntoGramas = 50;
      double hamburguerGramas = 120;
      double quantidadeSanduiches, pesoTotalKg;
      double convertidoParaKilos = ((queijoGramas*2) + presuntoGramas + hamburguerGramas)/ 1000;
      
      
      System.out.print("Informe a quantidade de sanduíches que deseja fazer: ");
      quantidadeSanduiches = scan.nextDouble();
      
      pesoTotalKg = convertidoParaKilos * quantidadeSanduiches;

      System.out.printf("Quantidades (em quilos) de queijo, presunto e carne necessários para compra: %.2fKg",pesoTotalKg);

      scan.close();
    }
}