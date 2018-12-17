
package pg_124;

import java.util.Scanner;

public class Quest_02 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         int n, i = 1;
         double s = 0;
        
        System.out.println("Informe o valor:");
        n = ler.nextInt();
   
        for(i = 1; i <= n; i++){
           if((i % 2 == 0)){
               s = i + (1 * n);
           }
        } 
        System.out.println("O valor de h é: " +s);
    }
    
}
