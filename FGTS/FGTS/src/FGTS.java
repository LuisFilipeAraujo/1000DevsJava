/*Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. 
Após o aumento, desconte 11% de INSS e 8% de FGTS. Imprima o salário inicial, o salário com o aumento, 
o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos (INSS+FGTS). */

import java.util.Scanner;

public class FGTS {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        double salarioFuncionario; //salario Inicial
        double aumento;
        double salarioComAumento; //salario com aumento
        double salarioFinal;

        //DESCONTOS
        double descontoINSS;
        double descontoFGTS;
        double totalDescontos;

        //SALARIOS COM DESCONTO
        double salarioDescontoINSS;
        double salarioDescontoFGTS;
        

        System.out.println("Digite o salário do funcionário: ");
        salarioFuncionario = scanner.nextDouble();

        //Aumento de 15% - 0.15 pois é porcentagem
        aumento = salarioFuncionario * 0.15;
        salarioComAumento = salarioFuncionario + aumento;
        salarioFinal = salarioFuncionario + aumento;

        //Desconto do INSS de 11% - 0.11 pois é porcentagem
        descontoINSS = salarioFinal * 0.11;
        salarioDescontoINSS = salarioFuncionario - descontoINSS;
        salarioFinal = salarioFinal - descontoINSS;
        
        //Desconto do FGTS de 8% - 0.08 pois é porcentagem
        descontoFGTS = salarioFinal * 0.08;
        salarioDescontoFGTS = salarioFuncionario - descontoFGTS;
        salarioFinal = salarioFinal - descontoFGTS;

        //Descontos totais
        totalDescontos = descontoINSS + descontoFGTS;

        System.out.println("Salario inicial: R$" + salarioFuncionario);

        System.out.println("Aumento de 15%: R$ " + aumento);
        System.out.println("Salario com aumento de 15%: R$ " + salarioComAumento);

        System.out.println("Desconto INSS: R$ "+ descontoINSS);
        System.out.println("Salario depois do desconto INSS: R$ "+ salarioDescontoINSS);

        System.out.printf("Desconto FGTS: R$ %.2f\n", descontoFGTS);
        System.out.println("Salario depois do desconto FGTS: R$ " + salarioDescontoFGTS);

        System.out.println("Total de descontos: R$ " + totalDescontos);

        System.out.println("Salario final depois de aumento e descontos: R$ " + salarioFinal);

        scanner.close();
    }
}
