package pg_124;

import java.util.Scanner;

public class Quest_16 {
    /*
   Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:
    a. A média das idades das dez pessoas; 
    b. A quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 
    metro; 
    c. porcentagem de pessoas com idade entre 10 e 30 anos entre pessoas que medem 
    mais de 1,90.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, qtdP = 0, qtdA = 0, cont = 0;
        double altura, peso, med_id, soma = 0, por = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a altura: ");
            altura = ler.nextDouble();
            System.out.println("Digite o peso: ");
            peso = ler.nextDouble();
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();

            soma = +idade;

            if (peso >= 90 && altura <= 1.50) {
                qtdP++;
            }
            if (idade >= 10 && idade <= 30 && altura > 1.90) {
                cont++;
            }

        }
        med_id = soma / 10;
        System.out.println(" A media das idade é: " + med_id);
        System.out.println(" A quantidade de pessoas acima de 90 quilos é: " + qtdP);
        por = cont /100;
        System.out.println(" A porcentagem de pessoas com idade 10 e 30 anos: " + por);

    }

}
