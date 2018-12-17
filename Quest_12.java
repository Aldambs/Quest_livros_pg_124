package pg_124;

import java.util.Scanner;

public class Quest_12 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int idade, qtd50 = 0, qtd10a20 = 0;
       double altura, peso, med_alt, soma = 0, por = 0, peso40 = 0;
       
        for (int i = 0; i < 25; i++) {
            System.out.println("Digite a altura: ");
            altura = ler.nextDouble();
            System.out.println("Digite o peso: ");
            peso = ler.nextDouble();
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
            
            if(idade > 50){
                qtd50++;
            }
            if(idade >= 10 && idade <= 20){
                qtd10a20++;
                soma =+ altura;
            }
            if(peso < 40){
                peso40++;
                por = (peso40 / i) * 100;
            }
        }
         System.out.println(" A quantidade de pessoas acima de 50 anos e: " +qtd50);
         med_alt = soma/qtd10a20;
         System.out.println(" A media das alturas entre as idade e: " +med_alt);         
         System.out.println(" A porcentagem com peso inferior e: " +por);
    }
    
}
