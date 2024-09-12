/*Desenvolva um algoritmo que leia a velocidade de um veículo e uma 
velocidade máxima. Exiba uma mensagem informando se o veículo excedeu 7% da velocidade máxima. */
import java.util.Scanner;

public class Radar {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int velocidade, velocidadeMaxima;

        velocidade = teclado.nextInt();
        velocidadeMaxima = teclado.nextInt();
        
        

        if (velocidade >= (velocidadeMaxima*0.07)){
            System.out.println("Você excedeu em 7% da velocidade máxima");
        }
        else {
             System.out.println("Você não excedeu em 7% da velocidade máxima");
        }

        teclado.close();
    }
}
