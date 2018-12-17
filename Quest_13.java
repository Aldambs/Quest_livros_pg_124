package pg_124;

import java.util.Scanner;

public class Quest_13 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int idade, qtd = 0, qtdID = 0;
       double peso, med_id;
       
        for (int i = 0; i < 7; i++) {           
            System.out.println("Digite o peso: ");
            peso = ler.nextDouble();
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
            qtdID = qtdID + idade;
            if(peso > 90){
                qtd++;
            }
        }
         System.out.println(" A quantidade de pessoas acima de 90 quilos e: " +qtd);
         med_id = qtdID/7;
         System.out.println(" A media das das idade e: " +med_id);  
        
    }
    
}
