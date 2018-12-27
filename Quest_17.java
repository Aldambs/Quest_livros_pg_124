package pg_124;

import java.util.Scanner;

public class Quest_17 {
    /*, pesos e
    Faça um programa que receba a idades e o sexo de sete pessoas e que, calcule e mostre:
    a. a idade média do grupo;
    b. a idade média das mulheres;
    c. a idade média dos homens.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, qtdG = 0, qtdM = 0, qtdF = 0, totG = 0, totF = 0, totM = 0;
        String sexo;
        double medG = 0, medM = 0, medF = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe a idade: ");
            idade = ler.nextInt();
            System.out.println("Informe o sexo: ");
            sexo = ler.next();

            qtdG = qtdG + idade;

            if (sexo.equalsIgnoreCase("f")) {
                totF++;
                qtdF = qtdF + idade; 
                 medF = qtdF / totF;
            } else {
                if (sexo.equalsIgnoreCase("m")) {
                    totM++;
                    qtdM = qtdM + idade;
                    medM = qtdM / totM;
                }
            }
        }
        
        medG = qtdG / 5;
        System.out.println("A media das idade geral: " +  medG);     
        System.out.println("A media das idade feminino: " +  medF);       
        System.out.println("A media das idade masculino: " +  medM);
    }

}
