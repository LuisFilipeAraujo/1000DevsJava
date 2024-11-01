import java.util.Scanner;

public class Grupo8_exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcaoMenu;
        int totalHabitantes = 0;
        double somaSalarios = 0;
        int somaFilhos = 0;
        double maiorSalario = 0;
        int habitantesComSalarioAte1000 = 0;

        do {
            System.out.print("Digite o salário do habitante: ");
            double salario = scanner.nextDouble();
            System.out.print("Digite o número de filhos do habitante: ");
            int numeroFilhos = scanner.nextInt();

            somaSalarios += salario;
            somaFilhos += numeroFilhos;
            totalHabitantes++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 1000.0) {
                habitantesComSalarioAte1000++;
            }

            System.out.print("Deseja inserir dados de um novo habitante? (s/n): ");
            opcaoMenu = scanner.next();

        } while (opcaoMenu.equalsIgnoreCase("s"));

        double mediaSalarios = somaSalarios / totalHabitantes;
        double mediaFilhos = (double) somaFilhos / totalHabitantes;
        double percentualSalarioAte1000 = ((double) habitantesComSalarioAte1000 / totalHabitantes) * 100.0;

        System.out.println("Média do salário da população: R$ " + mediaSalarios);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário: R$ " + maiorSalario);
        System.out.println("Percentual de pessoas com salário até R$ 1000,00: " + percentualSalarioAte1000 + "%");

        scanner.close();
    }
}
