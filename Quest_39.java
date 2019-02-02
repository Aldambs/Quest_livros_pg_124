package pg_124;

import java.util.Scanner;

public class Quest_39 {
    /*
    Faça um programa que receba um conjunto de valores inteiros e positivos e que 
    calcule e mostre o maior e o menor valor do conjunto. Considere que:
    • para encerrar a entrada de dados, deve ser digitado o valor zero;
    • para valores negativos, deve ser enviada um mensagem;
    • os valores negativos ou iguais a zero não entrarão nos cálculos.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, maior = 0, menor = 0;
        System.out.println("Digite o número: ");
        num = ler.nextInt();
        while (num != 0) {
            System.out.println("Digite o número: ");
            num = ler.nextInt();

            if (num < 0) {
                System.out.println("Valor negativo, digita novamente: ");   
            }else{
                if (num > maior) {
                    maior = num;
                }
                if (num < maior) {
                    menor = num;
                }
            }
        }
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
    } 
}
