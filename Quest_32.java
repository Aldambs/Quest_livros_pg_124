package pg_124;

import java.util.Scanner;

public class Quest_32 {
    /*
    Faça um programa que receba vários números e que calcule e mostre:
    • a quantidade de números inferiores a 35;
    • a média dos números positivos;
    • a percentagem de números entre 50 e 100 entre todos os números digitados;
    • a percentagem de números entre 10 e 20 entre os números menores que 50.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num, media, porcN50e100, porcN10e20, s = 0;
        int qtdINF = 0, cont = 0, cont1 = 0, qtd = 0, cont2 = 0, qtd50 = 0;
        do{
            System.out.println("Informe o número: ");
            num = ler.nextDouble();
            qtd++;
            if(num < 35){
                qtdINF++;
            }
            if(num > 0){
              cont++;
              s = s + num; 
            }
            if((num >= 50) && (num <= 100)){
               cont1++; 
            }
            
            if (num < 50) {
                qtd50++;
                if ((num >= 10) && (num <= 20)) {
                    cont2++;
                }
            }
        }while(num != 0);
        
        media = s / cont;
        porcN50e100 = (cont1 * 100)/qtd;
        porcN10e20 = (cont2 * 100)/qtd50;
        System.out.println("Qtd números inferior a 35: " +qtdINF);
        System.out.println("Média é: " +media);
        System.out.println("A porcentade entre 50 e 100: " +porcN50e100);
        System.out.println("A porcentade entre 10 e 20: " +porcN10e20);
    }
    
}
