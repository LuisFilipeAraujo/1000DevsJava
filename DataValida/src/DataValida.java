/*Exercício 13: Faça um Programa que solicite um dia, um mês e 
um ano e determine se estes números formam uma data válida. 
Não utilize nenhuma biblioteca adicional do Java para isto. 
Faça apenas utilizando estruturas de decisão. Pesquise como 
identificar se um ano é um número bissexto.

Exemplo 01:
Digite o dia: 29
Digite o mês: 02
Digite o ano: 2016
A data 29/02/2016 é válida 

Exemplo 02:
Digite o dia: 29
Digite o mês: 02
Digite o ano: 2017
A data 29/02/2017 é inválida 

Exemplo 03:
Digite o dia: 31
Digite o mês: 04
Digite o ano: 2017
A data 31/04/2017 é inválida

Exemplo 04:
Digite o dia: 30
Digite o mês: 04
Digite o ano: 2017
A data 30/04/2017 é válida

Janeiro – 31 dias
Fevereiro – 28 dias normais ou 29 nos anos bissextos
Março – 31 dias
Abril – 30 dias
Maio – 31 dias
Junho – 30 dias
Julho – 31 dias
Agosto – 31 dias
Setembro – 30 dias
Outubro – 31 dias
Novembro – 30 dias
Dezembro – 31 dias
 */
import java.util.Scanner;

public class DataValida {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int dia, mes, ano;
        boolean isBissexto;

        System.out.print("Digite o dia (use numerais): ");
        dia = scan.nextInt();
        System.out.print("Digite o mês (use numerais): ");
        mes = scan.nextInt();
        System.out.print("Digite o ano (use numerais): ");
        ano = scan.nextInt();

        isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        //IF para BISSEXTO
        if (isBissexto==true){
            System.out.println("O ano é bissexto");
            
        }
        else{
            System.out.println("O ano não é bissexto");
        }
        
        //IF PARA MESES DE 30 OU 31 DIAS
        if(mes == 4 || mes == 6 || mes == 9 || mes ==11){
            
        }
        else{

        }
        
        System.out.println("A data " + dia +"/"+ mes + "/" + ano +" é válida");
        System.out.println("A data " + dia +"/"+ mes + "/" + ano +" é inválida");

        scan.close();
    }
}
