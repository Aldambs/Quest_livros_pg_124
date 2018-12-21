/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg_124;

import java.util.Scanner;

/**
 *
 * @author Alda Matos
 */
public class Quest_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       int Numeros = 0;
       int qtdNumeros = 0;
 
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe os números");
            Numeros = ler.nextInt();
 
            if ((Numeros  >= 30)&&(Numeros <=90)) {
                qtdNumeros = qtdNumeros + 1;
            }
 
        }
 
        System.out.println("A quantidade de números entre 30 e 90 é de:" + qtdNumeros);
    }
 
}
