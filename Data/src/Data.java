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

public class Data {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int dia, validaDia, mes, ano;
        boolean isBissexto;

        System.out.print("Digite o dia: ");
        dia = teclado.nextInt();
        System.out.print("Digite o mês: ");
        mes = teclado.nextInt();
        System.out.print("Digite o ano: ");
        ano = teclado.nextInt();

        isBissexto =  (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        //IF para saber se é ou não bissexto
        if (isBissexto == true){
            System.out.println("Ano bissexto");
        }
        else{
            System.out.println("Ano não é bissexto");
        }


        //IF para saber se a quantidade de dias do mes é correta
        //30 dias
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
            validaDia = 30;
        }
        //31 dias
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 10 || mes == 12 ){
            validaDia = 31;
        }//fevereiro
        else if (isBissexto == true){
            validaDia = 29;
        }
        else{
            validaDia =28;
        }


        if (validaDia==dia){
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é válida");
        }
        else {
            System.out.println("A data " + dia + "/" + mes + "/" + ano + " é inválida");
        }


        teclado.close();
    }
}
