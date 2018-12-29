package pg_124;

import java.util.Scanner;

public class Quest_21 {

    /**
     Escreva um programa para calcular N! (fatorial de N), sendo que o valor 
     inteiro de N é fornecido pelo usuário. 
     Sabe-se que: N! = 1 * 2 * 3 * ... * (N-1) * N; 0! = 1, por definição
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor, n;
        System.out.println("Informe o valor: ");
        n = ler.nextInt();
        valor = n;
        for (int i = 1; i < n; i++) {
            valor *= i;
        }
        System.out.println(" " +valor);
    }
    
}
