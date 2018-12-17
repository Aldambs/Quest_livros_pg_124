package pg_124;

import java.util.Scanner;

public class Quest_36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        byte id;
        double alt, soma = 0, med = 0;
        int cont = 0;

        do {
            System.out.print("Informe sua idade: ");
            id = ler.nextByte();
            if (id > 0) {
                System.out.print("Informe sua altura: ");
                alt = ler.nextDouble();
                if (id > 50) {
                    soma = soma + alt;
                    cont++;
                }
            }
        } while (id > 0);

        if (cont > 0) {
            med = soma / cont;
        } else {
            System.out.println("Não houveramidades maiores que 50!");
        }
        System.out.println("A média das alturas foi = " + med);
    }
}
