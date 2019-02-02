package pg_124;

import java.util.Scanner;

public class Quest_38 {
    /*
    Faça um programa que apresente o menu de opções a seguir, que permita ao usuário 
    escolher a opção desejada, receba os dados necessários para executar a operação e 
    mostre o resultado. Verificar a possibilidade de opção inválida enao se preocupar 
    com as restrições, com salário inválido.
    Menu de opções:
    1-Novo salário
    2-Férias
    3-Décimo terceiro
    4-Sair
    Digite a opção desejada
    
    Na opção 1: receber o salário de um funcionário, calcular e mostrar o novo 
    salário usando as regras a seguir.
    Salários             Percentagem de aumento
    Até R$ 350,00               15%
    De R$ 350,00 a R$ 600,00    10%
    Acima de R$ 600,00          5%
    
    Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor 
    de suas férias. Sabe-se que as férias equivalem ao seu salário acrescido de 1/3.
   
    Na opção 3: receber o salário de um funcionário e o número de meses de trabalho 
    na empresa, no máximo 12, calcular e mostrar o valor do décimo terceiro. 
    Sabe-se que o décimo terceiro equivale ao seu salário multiplicado pelo numero
    de meses de trabalho dividido por 12.
    Na opção 4 : sair do programa.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario, novoSal, valorFerias, valorDecimo;
        int op, meses;
        do{
            System.out.println("============= MENU =============\n"
                    + "1.Novo Salário\n"
                    + "2.Férias\n"
                    + "3.Décimo Terceiro\n"
                    + "4.Sair\n"
                    + "================================");
            op = ler.nextInt();
            switch(op){
            case 1:
                System.out.println("Informe o salário do funcionário: ");
                salario = ler.nextDouble();
                if(salario <= 350){
                    novoSal = salario + (salario/100) * 15;
                    System.out.println("Novo salário: " +novoSal);
                }
                if(salario > 350 && salario <= 600){
                    novoSal = salario + (salario/100) * 10;
                    System.out.println("Novo salário: " +novoSal);
                }
                if(salario > 600){
                    novoSal = salario + (salario/100) * 5;
                    System.out.println("Novo salário: " +novoSal);
                }
                break;

            case 2:
                System.out.println("Informe o salário do funcionário: ");
                salario = ler.nextDouble();
                valorFerias = salario + (salario/3);
                System.out.printf("Valor das férias: %.2f\n" ,valorFerias);
                break;

            case 3:
                System.out.println("Informe o salário do funcionário: ");
                salario = ler.nextDouble();
                System.out.println("Informe os meses que foi trabalhado: ");
                meses = ler.nextInt();
                if(meses <= 12){
                    valorDecimo = (salario * meses) / 12;
                    System.out.printf("Valor do décimo: %.2f\n" ,valorDecimo);
                }               
                break;

            case 4:
                System.out.println("Sair!");
                break;

            default:
                System.out.println("Opção inválida.");
            }
        }while(op != 4);
    }
    
}
