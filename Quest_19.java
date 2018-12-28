package pg_124;

import java.util.Scanner;

public class Quest_19 {
    /**
     * Faça um programa que receba o valor de um carro e mostre uma tabela com
     * os seguintes dados: Preço final, Quantidade de parcelas, Valor da parcela. 
       Considere o seguinte: 
     • O preço final para a compra à vista tem desconto de 20%; 
     • A quantidade de parcelas pode ser: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60;
     • Os percentuais de acréscimos encontram-se na tabela a seguir: 
         Quantidade de Parcelas        Percentual de Acréscimo sobre o Preço Final 
                6                                 3% 
                12                                6% 
                18                                9% 
                24                                12% 
                30                                15% 
                36                                18% 
                42                                21%
                48                                24% 
                54                                27% 
                60                                30%
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorCar, porc, precoF = 0, valorP = 0;
        int parcela = 0;
        String opcaoPG;

        System.out.println("Informe o valor do carro: ");
        valorCar = ler.nextDouble();
        System.out.println("Informe a vista (V) ou a prazo (P): ");
        opcaoPG = ler.next();

        if (opcaoPG.equalsIgnoreCase("v")) {
            precoF = valorCar - (valorCar * 0.20);
            System.out.println("Valor a pagar: " + precoF);
        }
        if (opcaoPG.equalsIgnoreCase("p")) {
            System.out.println("Informae a qtd de parcelas: "
                    + "6, 12, 18, 24, 30, 36, 42, 48, 54, 60");
            parcela = ler.nextInt();

            if (parcela == 6) {
                precoF = valorCar + (valorCar * 0.03);
                valorP = precoF / 6;
            }
            if (parcela == 12) {
                precoF = valorCar + (valorCar * 0.06);
                valorP = precoF / 12;
            }
            if (parcela == 18) {
                precoF = valorCar + (valorCar * 0.09);
                valorP = precoF / 18;
            }

            System.out.println("| Preço Final | Qtd Parcela | Valor da Pacelar |");
            System.out.print("   " + precoF + "        ");
            System.out.print("   " + parcela + "       ");
            System.out.printf("     " + valorP + "     ");

        }

    }

}
