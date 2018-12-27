package pg_124;

public class Quest_01 {
    /*
    Faça um programa que verefique e mostre os números entre 1.000 e 2.000 (inclusive)
    que, quando divididos por 11, produzam resto igual a 5.
    */

    public static void main(String[] args) {
         for(int i = 1000; i <= 2000; i++){
             if(i % 11 == 5){
                 System.out.println(i);
             }
        }      
    }  
}
