package pg_124;

import java.util.Scanner;

public class Quest_30 {
    /*
    Uma empresa deseja aumentar seus preços em 20%. Faça um programa que leia o 
    código e o preço de custo de cada produto e que calcule o novo preço. Calcule 
    também a média dos preços com e sem aumento. 
    Mostre o código e o novo preço de cada produto no final, as médias. 
    A entrada de dados deve terminar quando for lido um código de produto negativo. 
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cod = 0, cont = 0;
        double precoCST, novoPRC = 0, mediaPRCsemA = 0, mediaPRCaumento = 0,
                somaCOM = 0, somaSem = 0;

        do{
            System.out.println("Informe o código: ");
            cod = ler.nextInt();
            if(cod >= 0){
               System.out.println("Informe o preço de custo: ");
               precoCST = ler.nextDouble(); 
               cont++;
               
               novoPRC = (precoCST * 0.20) + precoCST;
               somaCOM = somaCOM + novoPRC;
               somaSem = somaSem + precoCST;
               System.out.println("Código: " +cod);
               System.out.println("Preço final: " +novoPRC); 
            }
            mediaPRCaumento = somaCOM / cont;
            mediaPRCsemA = somaSem / cont;
            
        }while(cod > 0);        
        System.out.println("Média com aumento: " +mediaPRCaumento);
        System.out.println("Média sem aumento: " +mediaPRCsemA);
    }
    
}
