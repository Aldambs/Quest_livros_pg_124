package pg_124;

import java.util.Scanner;

public class Quest_18 {

    /**
     * faça um programa que receba dez numeros e mostre a soma dos números pares
     * e a soma dos números primos
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, k, somaP = 0, somaI = 0;
        boolean primo = false;
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o " + i + "º número:");
            num = ler.nextInt();
            if (num % 2 == 0) {
                somaP = somaP + num;
            }
            primo = true;
            k = 2;

            while ((primo = true) && (k < num)) {
                if(num % k == 0){
                    primo = false;
                }
                k = k + 1;
            }
            if(primo = true){
                somaI = somaI + num;
            }
        }
        System.out.println("Soma dos números pares: " +somaP);
        System.out.println("Soma dos números primos: " +somaI);

    }

}
