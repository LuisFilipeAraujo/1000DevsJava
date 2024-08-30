/* 2- Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário, 
calcule e mostre a quantidade de salários mínimos que ganha esse funcionário. */
import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse algoritmo recebe o valor do salário mínimo e o valor do salário de um funcionário, \r\n" + //
                        "calcula e mostra a quantidade de salários mínimos que ganha esse funcionário");

        Scanner scan = new Scanner(System.in);
        double salarioMinimo = 700.00; // Valor do salário mínimo
        double salarioFuncionario; // Salário do Funcionario
        double quantidadeMinimo; // Quantidade de salários Mínimos
        
        
        System.out.print("Informe o valor do salário mínimo: ");
        salarioMinimo = scan.nextDouble();
        
        System.out.print("Informe o valor do salário do funcionário: ");
        salarioFuncionario = scan.nextDouble();

        quantidadeMinimo = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário ganha " + quantidadeMinimo + " salários mínimos.");

        scan.close(); // Fecha o scanner

    }
}
