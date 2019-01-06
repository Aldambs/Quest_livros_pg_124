package pg_124;

import java.util.Scanner;

public class Quest_25 {
    /*
    O sistema de avaliação de uma determinada disciplina obedece aos seguintes critérios:
    - Durante o semestre são dadas três notas;
    - A nota final é obtida pela média aritmética das três notas;
    - É considerado aprovado o aluno que obtiver nota final superior ou igual a 6 e 
    que tiver comparecido a um mínimo de 40 aulas.
    Faça um programa que leia um conjunto de dados contendo o número da matrícula, as 
    três notas e a freqüência (número de aulas freqüentadas).
    Calcule e mostre:
    a) Para cada aluno o número da matrícula, a nota final e a mensagem (aprovado ou reprovado);
    b) A maior e a menor nota da turma;
    c) O total de alunos reprovados;
    d) a percentagem de alunos reprovados por freqüência abaixo da mínima necessária.
    A turma tem 40 alunos.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3, media = 0, maiorn = 0, menorn = 0, porc = 0, soma = 0;
        int alunorepr, freq, matricula = 0, totalRp = 0, aluno;
        String situacao = " ";
        
        do{  
            System.out.println("Digite a matrícula do aluno: ");
            matricula = ler.nextInt();
            System.out.println("Digite a frequência: ");
            freq = ler.nextInt();
            System.out.println("Digite a 1º nota: ");
            n1 = ler.nextDouble();
            System.out.println("Digite a 2º nota: ");
            n2 = ler.nextDouble();
            System.out.println("Digite a 3º nota: ");
            n3 = ler.nextDouble();
            soma = (n1 + n2 + n3);
            media =  soma / 3;
             
            if(media >= 6 && freq >= 40){
                situacao = "Aprovado!";
            }else{
                situacao = "Reprovado!";
                totalRp++;
            }
            if(soma > maiorn){
                maiorn = soma;
            }
            if(soma < maiorn){
                menorn = soma;
            }
            
     
        }while(matricula != 2);

        System.out.println("Número de matricula: " +matricula);
        System.out.printf("Nota final: %.2f" ,media);
        System.out.println("\nO aluno está: " +situacao);      
        System.out.println("Maior nota: " +maiorn);
        System.out.println("Menor nota: " +menorn);
        porc = totalRp/100;
        System.out.println("Total de alunos reprovados: " +totalRp);     
        System.out.println("Porcentagem de alunos reprovados por frequência: " +porc);
    }
}
