package pg_124;

import java.util.Scanner;

public class Quest_08 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        int id, cont15 = 0, cont16 = 0, cont31 = 0, cont46 = 0, cont61 = 0;
        double pc15, pc61;
        for (int i = 0; i < 5; i++){
            System.out.println("Digite a idade da pessoa: ");
            id = ler.nextInt();
   
            if(id <= 15){
                cont15++;              
            }else if(id >= 16 && id <= 30){
                cont16++;
            }else if(id >= 31 && id <= 45){
                cont31++;
            }else if(id >= 46 && id <= 60){
                cont46++;
            }else if(id >= 61){
                cont61++;
            }   
            
        }
        System.out.println("A quantidade de pessoas até 15 anos é: " +cont15);
        System.out.println("A quantidade de pessoas até 16 a 30 anos é: " +cont16);
        System.out.println("A quantidade de pessoas até 31 a 45 anos é: " +cont31);
        System.out.println("A quantidade de pessoas até 46 a 60 anos é: " +cont46);
        System.out.println("A quantidade de pessoas acima de 61 é: " +cont61);
        pc15 = (100*cont15)/5;
        System.out.printf("A percentagem da primeira faixa etária é : " +pc15);
        pc61 = (100*cont61)/5;
        System.out.printf("\nA percentagem da ultima faixa etária é : " +pc61);
    } 
}
