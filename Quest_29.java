package pg_124;

import java.util.Scanner;

public class Quest_29 {
    /*
    Foi feita uma pesquisa entre os habitantes de uma região. Foram um programa que
    leia a idade, sexo(M/F) e salário. Faça um programa que calcule e mostre:
    a) a média dos salários do grupo;
    b) a maior e a menor idade dos grupos;
    c) a quantidade de mulheres com salário até R$ 200,00;
    d) a idade e o sexo da pessoa que possui o menor salário.
    Finalize a entrada de dados ao ser digitada uma idade negativa.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, maior = 0, menor = 0, qtdF = 0, cont = 0, menorSalID = 0;
        double salario, mediaSal = 0, menorSal = 0, somaSal = 0;
        char sexo, menorSalSX = 0;
        
        do {

            System.out.println("Qual a idade do entrevistado: ");
            idade = ler.nextInt();
            System.out.println("Sexo <M/F>: ");
            sexo = ler.next().charAt(0);
            System.out.println("Salario: R$ ");
            salario = ler.nextDouble();

            if (salario > 0) {
                somaSal = somaSal + salario;
                cont++;
            }
            if (idade > maior) {
                maior = idade;
            }
            if (idade < menor) {
                menor = idade;
            }
            if (salario <= 200 && sexo == 'f') {
                qtdF = qtdF + 1;
            }
            if (salario < menorSal) {
                menorSal = salario;
                menorSalID = idade;
                menorSalSX = sexo;
            }
        } while (idade > 0);
        System.out.println("Media dos salarios do grupo: R$ " + mediaSal);
        System.out.println("Menor idade: " + menor + " anos");
        System.out.println("Maior idade: " + maior + " anos");
        System.out.println("A quantidade de mulheres com salário até R$ 200,00 foi de: " + qtdF);
        System.out.println("A idade da pessoa e o sexo que possui o menor salário " 
                +menorSal+ ", " +menorSalID+ " , " +menorSalSX);
    }    
}
