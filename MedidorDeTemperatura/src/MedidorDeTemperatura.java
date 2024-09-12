/*-Medidor de Temperatura: Desenvolva um algoritmo que 
leia uma temperatura e exiba uma informação dizendo se a 
pessoa está com febre caso a temperatura informada for maior que 38 graus. */

import java.util.Scanner;

public class MedidorDeTemperatura {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double temperatura;

        temperatura = teclado.nextDouble();

        if (temperatura > 38){
            System.out.println("Você esta com febre!");
        }

        teclado.close();
    }
}
