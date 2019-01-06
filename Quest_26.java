package pg_124;

import java.util.Scanner;

public class Quest_26 {
    /*
    Faça um programa que receba várias idades e que calcule e mostre a média das 
    idades digitadas. Finalize digitando idade igual a zero.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, qtdid = 0, cont = 0;
        double media;
   
        do{
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
            qtdid = idade + qtdid;
            cont++;
        }while (idade != 0);
        
        media = qtdid / cont;
        System.out.printf("A média das idades será: %.1f" ,media);
    }

}
