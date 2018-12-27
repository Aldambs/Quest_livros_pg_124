package pg_124;

import java.util.Scanner;
/*
Faça um programa que leia cinco grupos de quatro valores (A, B, C, D) e mostre-os 
na ordem lida. Em seguida, organize-os em ordem crescente e decrescente
*/
public class Quest_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 1, b = 1, c = 1, d = 1, t;

       for(int i = 1; i <= 5; i++) {
            System.out.println("Digite primeiro valores: ");
            a = ler.nextInt();
            System.out.println("Digite segundo valores: ");
            b = ler.nextInt();
            System.out.println("Digite terceiro valores: ");
            c = ler.nextInt();
            System.out.println("Digite quarto valores: ");
            d = ler.nextInt();
            System.out.println("\nordem lida: "+a+ " " +b+ " " +c+ " " +d);
            
            if(d >= c){
                t = d;
                d = c;
                c = t;
            }
            if(c >= b){
                t = c;
                c = b;
                b = t;
            }
            if(b >= a){
                t = b;
                b = a;
                a = t;
            }
            
           System.out.println("ordem crescente: " + a + " " + b + " " + c + " " + d);
           System.out.println("ordem decrescente: " + d + " " + c + " " + b + " " + a + "\n");

        }
       
    }

}
