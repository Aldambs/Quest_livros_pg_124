package pg_124;

import java.util.Scanner;

public class Quest_07 {
    /*
    Faça um programa que receba a idade de dez pessoas e que calcule e mostre a 
    quantidade de pessoas com idade maior ou igual a 18 anos.
    */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, cont = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite a idade da pessoa: ");
            idade = ler.nextInt();
   
            if(idade >= 18){
                cont = cont + 1;              
            }          
        }
        System.out.println("A quantidade é: " +cont);
    }
    
}
