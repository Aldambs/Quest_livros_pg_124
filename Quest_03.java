package pg_124;

public class Quest_03 {
    /*
    Faça um programa que calcule e mostre o produto dos números primos entre 92 
    e 1.478.
    */
    public static void main(String[] args) {
          int n, i, k, prod = 1, cont = 0;
          
          for(n = 92; n <= 1478; n++){             
              for(i = 2; i <= n; i++){
                  if(n % i == 0){
                      cont++;
                  }
              }
              if(cont == 2){
                  k =+ 1;
                  System.out.println(i);
              }
              prod = prod * n;
          }
    }  
}
