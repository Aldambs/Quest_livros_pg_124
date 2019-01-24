package pg_124;

import java.util.Scanner;

public class Quest_35 {
    /*
    Faça um programa que receba como entrada um lista de números positivos ou 
    negativos, terminada com o números zero. O programa deve fornecer como saída 
    a soma dos números positivos, a soma dos números negativos e a soma das duas
    somas parciais.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num = 0, SomaPos = 0, SomaNeg = 0, somaParcial = 0;
        
        do{
            System.out.println("Informe o número: ");
            num = ler.nextDouble();
            if(num > 0){
                SomaPos = SomaPos + num; 
            }else{
                SomaNeg = SomaNeg + num;
            }
            somaParcial = SomaPos + (SomaNeg * (-1));
        }while(num != 0);
        System.out.println("Soma dos positivos: " +SomaPos);
        System.out.println("Soma dos negativos: " +SomaNeg);
        System.out.println("Soma parcial: " +somaParcial);
    }
    
}
