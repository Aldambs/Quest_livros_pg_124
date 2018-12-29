package pg_124;

import java.util.Scanner;

public class Quest_20 {

    /**
      Faça um programa que receba dez números inteiros e mostre a quantidade de
      números primos dentre os números que foram digitados.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, somaPrimo = 0, div;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe os números desejados: ");
            num = ler.nextInt();
            div = 0;
            for (int j = 1; j <= num; j++) {
                if(num % j == 0){
                    div = div + 1;       
                }
            }
            if((div < 2) || (div == 2)){
                somaPrimo = somaPrimo + 1;
            }
        }
        System.out.println("A qtd de primos digitados é: " +somaPrimo);
    }
}
