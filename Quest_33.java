package pg_124;

import java.util.Scanner;

public class Quest_33 {
    /*
    Faça um programa que apresente o menu de opções a seguir:
    Menu de opções: 
    1- Média aritmética
    2- Média ponderada
    3- Sair
    Digite a opção desejada
    Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
    Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar 
    a média ponderada.
    Na opção 3: sair do programa.
    Verifique a possibilidade de opção inválida, mostrando uma mensagem.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota1, nota2, nota3, medArit, medPode;
        int opcao, p1, p2, p3;
        
        do{
            System.out.println("Informe a opção:\n"
                    + "1.Calcular média aritmétrica\n"
                    + "2.Calcular média poderada\n"
                    + "3.Sair");
            opcao = ler.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite a 1º nota: ");
                    nota1 = ler.nextDouble();
                    System.out.println("Digite a 2º nota: ");
                    nota2 = ler.nextDouble();
                    medArit = (nota1 + nota2) / 2;
                    System.out.printf("A média aritmetrica é: %.2f" ,medArit);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Digite a 1º nota: ");
                    nota1 = ler.nextDouble();
                    System.out.println("Digite a 2º nota: ");
                    nota2 = ler.nextDouble();
                    System.out.println("Digite a 3º nota: ");
                    nota3= ler.nextDouble();
                    System.out.println("Digite o 1º peso: ");
                    p1 = ler.nextInt();
                    System.out.println("Digite o 2º peso: ");
                    p2 = ler.nextInt();
                    System.out.println("Digite o 3º peso: ");
                    p3 = ler.nextInt();
                    medPode = (nota1*p1 + nota2*p2 + nota3*p3) / (p1 + p2 + p3);
                    System.out.printf("A média poderada é: %.2f" ,medPode);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Informe uma opção válida");
                    
            }
            
        }while(opcao != 3);
        
    }
    
}
