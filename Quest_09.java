package pg_124;

import java.util.Scanner;

public class Quest_09 {
    /*
    Faça um programa que receba um número e que calcule e mostre a tabuada desses
    números.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Informe o número desejado: ");
        num = ler.nextInt();
        System.out.println("Tabuada do: " +num);
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + num + " = " +i*num);
        }
    }
    
}
