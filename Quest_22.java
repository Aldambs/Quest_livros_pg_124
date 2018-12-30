package pg_124;

import java.util.Scanner;

public class Quest_22 {
    /*
    Faça um programa que receba a idade e o peso de 15 pessoas. 
    Calcule e imprima as médias dos pesos das pessoas da mesma faixa etária. 
    As faixas etárias são: 
    1 a 10 anos, 
    11 a 20 anos, 
    21 a 30 anos 
    maiores de 31 anos.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int id, tot1 = 0, tot2 = 0, tot3 = 0, tot4 = 0;
       double peso, p1 = 0, p2 = 0, p3 = 0, p4 = 0;
       double med1 = 0, med2 = 0, med3 = 0, med4 = 0;
       
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Digite a idade das pessoas:");
            id = ler.nextInt();
            System.out.println("Digite o peso das pessoas:");
            peso = ler.nextDouble();

            if ((id >= 1) && (id <= 10)) {
              tot1++;
              p1 = p1 + peso;
              med1 = p1 / tot1;
            }

            if ((id == 11) && (id <= 20)) {
               tot2++;
               p2 = p2 + peso;
               med2 = p2 / tot2;
            }
            
            if ((id == 21) && (id <= 30)) {
                tot3++;
                p3 = p3 + peso;
                med3 = p3 / tot3;
            }
            
            if (id > 31) {
                tot4++;
                p4 = p4 + peso;
                med4 = p4 / tot4;
            }                   
        }

        System.out.println("A media de peso da idade entre 1 e 10 anos é: " +med1);
        System.out.println("A media de peso da idade entre 11 e 20 anos é: " +med2);
        System.out.println("A media de peso da idade entre 21 e 30 anos é: " +med3);
        System.out.println("A media de peso de pessoas maiores de 31 anos é: " +med4);
    }
    
}
