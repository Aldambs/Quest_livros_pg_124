package pg_124;

import java.util.Scanner;

public class Quest_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int t = 0;
        String cod_trans;
        double valor, val_tot_vista = 0, val_tot_prazo = 0;
        
        for (int i = 1; i < 5; i++) {
            System.out.println("Informe o código: ");
            cod_trans = ler.next();
            System.out.println("Informe o valor");
            valor = ler.nextDouble();
            
            if(cod_trans.equalsIgnoreCase("V")){
                val_tot_vista = val_tot_vista + valor;
            }else{
                if (cod_trans.equalsIgnoreCase("P")) {
                    val_tot_prazo = val_tot_vista + valor;
                }else{
                    System.out.println("Código da transação inválido");
                }
            }
        }
        System.out.println("Valor total das compras à vista: " +val_tot_vista);
        System.out.println("Valor total das compras à prazo: " +val_tot_prazo);
        System.out.println("Valor total das compras efetuadas: " +val_tot_vista + val_tot_prazo);
        System.out.println("Valor da primeira prestação das compras a prazo juntas: " +val_tot_prazo / 3);
    }
    
}
