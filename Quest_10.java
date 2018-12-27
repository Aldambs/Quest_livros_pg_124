package pg_124;

public class Quest_10 {
    /*
    Faça um programa que mostre a tabuadas dos números de 1 a 10.
    */
    public static void main(String[] args) {
        int n = 0, rest, cont;
        System.out.println("===============================");
        System.out.println("    Tabuada de Multiplicação   ");
        System.out.println("===============================");
        
        while(n <= 10){
            System.out.println("A tabuada " +n+ " é: ");
            cont = 0;
            while(cont <= 10){
                rest = n * cont;
                System.out.println(n+ " * " +cont+ " = " +rest);
                cont = cont + 1;
            }
            n = n + 1;
        }
    }
    
}
