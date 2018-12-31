package pg_124;

import java.util.Scanner;

public class Quest_23 {
    /*
    Cada espectador de um cinema respondeu a um questionário no qual contava a sua 
    idade e sua opinião em relação ao filme: ótimo - 3, bom -2, regular - 1. 
    Faça um programa que receba a idade e a opinião de 75 espectadores, calcule e mostre:
    - a média das idades das pessoas que responderam ótimo;
    - a quantidade de pessoas que responderam regular;
    - a percentagem de pessoas que responderam bom, entre todos os espectadores analisados.
     */
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         int idade, opiniao, 
             MedIdOtimo, SomaIdOtimo = 0, 
             ContOtimo = 0, contRegular = 0, 
             contBom = 0, PorBom;
         
         for (int i = 1; i <= 75; i++) {
             System.out.println("Forneça sua idade: ");
             idade = ler.nextInt();
             System.out.println("Forneça sua opinião: (1.Regular 2.Bom 3.Ótimo)");
             opiniao = ler.nextInt();
             
             if(opiniao == 1){
                  contRegular = contRegular + 1;
             }
             if (opiniao == 2) {
                 contBom = contBom + 1;
             }
             if (opiniao == 3) {
                 SomaIdOtimo = SomaIdOtimo + idade;
                 ContOtimo = ContOtimo + 1;
             }            
        }
        MedIdOtimo = SomaIdOtimo/ContOtimo;
        PorBom = (contBom/75)*100;
        System.out.println("A média das idades das pessoas que responderam ótimo é: " +MedIdOtimo);
        System.out.println("A quantidade de pessoas que responderam regular é: " +contRegular);
        System.out.println("As pessoas que responderam bom representam: " +PorBom);
    }
    
}
