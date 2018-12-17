package pg_124;

import java.util.Scanner;

public class Quest_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        float compra, bonus;
        
        for(int i = 1; i <= 15; i++){
            System.out.println("Informe o nome do cliente:");
            nome = ler.next();
            System.out.println("Informe o valor da compra: ");
            compra = ler.nextFloat();
            
            if (compra <= 1000) {
                bonus = (float) (compra * 0.1);
            } else {
                bonus = (float) (compra * 0.15);
            }
            
            System.out.println("Bonus: " +bonus);
        }
    }
}
