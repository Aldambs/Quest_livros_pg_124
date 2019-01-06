package pg_124;

import java.util.Scanner;

public class Quest_27 {
    /*
    Foi feita uma pesquisa de audiência de canal de TV em várias casas de uma certa
    cidade, num determinado dia. Para cada casa visitada foi criado um conjunto de 
    dados contendo: número do canal (4, 5, 7,10 e 13) e o número de pessoas que 
    estavam assistindo naquela casa. Se a televisão estivesse desligada, nada era 
    anotado, ou seja essa casa não entrava na pesquisa.
    Fazer um algoritmo que:
    • Leia um número indeterminado de dados, sendo que o canal final seria = 0 
    (para finalizar a pesquisa);
    • Calcule e imprima a percentagem de audiência para cada emissora 
    ( o respectivo canal)
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int canal, canal4 = 0, canal5 = 0, canal7 = 0,
              canal10 = 0, canal13 = 0, cont = 0;
      double porc4, porc5, porc7, porc10, porc13;
      
      do{
          System.out.println("Digite o número do canal: ");
          canal = ler.nextInt();
          
          if (canal == 4) {
              canal4 = canal4 + 1;
              cont = cont + 1;
          }else{
              if (canal == 5) {
                  canal5 = canal5 + 1;
                  cont = cont + 1;
              }else{
                  if (canal == 7) {
                      canal7 = canal7 + 1;
                      cont = cont + 1;
                  }else{
                      if (canal == 10) {
                          canal10 = canal10 + 1;
                          cont = cont + 1;
                      }else{
                          if (canal == 13) {
                              canal13 = canal13 + 1;
                              cont = cont + 1;
                          }
                      }
                  }
              }
          }
          if(canal != 4 && canal != 5 && canal != 7 && canal != 10 && canal != 13 && canal != 0){
              System.out.println("Canal inválido!");
          }
          
        }while(canal != 0);
      
        porc4 = (canal4 * 100) / cont;
        System.out.println("O Percentual de audiencia do canal 4 é: " +porc4);
        porc5 = (canal5 * 100) / cont;
        System.out.println("O Percentual de audiencia do canal 5 é: " +porc5);
        porc7 = (canal7 * 100) / cont;
        System.out.println("O Percentual de audiencia do canal 7 é: " +porc7);
        porc10 = (canal10 * 100) / cont;
        System.out.println("O Percentual de audiencia do canal 10 é: " +porc10);
        porc13 = (canal13 * 100) / cont;
        System.out.println("O Percentual de audiencia do canal 13 é: " +porc13);
    }
    
}
