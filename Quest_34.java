package pg_124;

import java.util.Scanner;

public class Quest_34 {
    /*
    Em uma eleição presidencial existem quatro candidatos. Os votos são informados 
    por meio de código. Os códigos utilizados são: 
                1,2,3           Votos dos respectivos candidatos
                  5             Voto nulo
                  6             Voto em branco
    Faça um programa que calcule e mostre:
    a) o total de votos para cada candidato;
    b) o total de votos nulos;
    c) o total de votos brancos;
    d) a percentagem de votos nulos sobre o total de votos;
    e) a percentagem de votos brancos sobre o total de votos.
    Para finalizar o conjunto de votos, tem-se o valor zero.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        int num, cont = 0, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        float a1, b1, c1, d1, e1, f1; 
        
        do {
            System.out.println("Escolha um número:\n"
                    + "1.Candidato A\n"
                    + "2.Candidato B\n"
                    + "3.Candidato C\n"
                    + "4.Candidato D\n"
                    + "5.Nulo\n"
                    + "6.Branco\n"
                    + "0.Sair");
            num = ler.nextInt();
            cont++;

            if (num == 1) {
                a = a + num;
            } else if (num == 2) {
                b = b + num;
            } else if (num == 3) {
                c = c + num;
            } else if (num == 4) {
                d = d + num;
            } else if (num == 5) {
                e = e + num;
            } else if (num == 6) {
                f = f + num;
            } else if (num == 0) {
                System.out.println("Sair");
            } 
        } while (num != 0);
       
        a1 = a*100/cont;
        b1 = b*100/cont;                               
        c1 = c*100/cont;
        d1 = d*100/cont;
        e1 = e*100/cont;
        f1 = f*100/cont;
        
        System.out.printf("O candidato A recebeu: %d votos, %.2f%% do total \n" ,a ,a1);
        System.out.printf("O candidato B recebeu: %d votos, %.2f%% do total \n" ,b ,b1);
        System.out.printf("O candidato C recebeu: %d votos, %.2f%% do total \n" ,c ,c1);
        System.out.printf("O candidato D recebeu: %d votos, %.2f%% do total \n" ,d ,d1);
        System.out.printf("Votos nulo: %d votos, %.2f%% do total \n" ,e ,e1);
        System.out.printf("Votos em branco: %d votos, %.2f%% do total \n" ,f ,f1);
        System.out.printf("E o total de votos são: \n" ,cont);
    }
    
}
