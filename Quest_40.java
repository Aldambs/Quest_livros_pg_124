package pg_124;

import java.util.Scanner;

public class Quest_40 {
    /*
    Uma agência bancária possui vários clientes que podem fazer investimentos com 
    rendimentos mensais, conforme a tabela a seguir:
            Tipo                    Descrição               Rendimento mensal
             1                       Poupança                     1,5%
             2                       Poupança plus                2%
             3                       Fundos de renda fixa         4%
    Faça um programa que leia o código do cliente, o tipo da conta e o valor 
    investido e que calcule e mostre o rendimento mensal de acordo com o tipo do 
    investimento. Ao final do programa mostre o total investido e o total de juros pagos.
    A leitura terminará quando o código do cliente digitado for menor ou igual a 0.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tipo, cod;
        double valor, rendimento, totalInvestido = 0, totalJuro = 0, juros = 0;
        do{
            System.out.println("Informe o código do cliente: ");
            cod = ler.nextInt();
            if (cod <= 0) {
                break;
            }
            System.out.println("Informe o tipo da conta\n"
                    + "1.Poupança\n"
                    + "2.Poupança plus\n"
                    + "3.Fundos de renda fixa");
            tipo = ler.nextInt();
            System.out.println("Informe o valor do investimento: ");
            valor = ler.nextDouble();
            totalInvestido = totalInvestido + valor;
            if (tipo == 1) {
                juros = 1.5;
            }
            if (tipo == 2) {
                juros = 2;
            }
            if (tipo == 3) {
                juros = 4;
            }
            rendimento = valor * juros;
            totalJuro = totalJuro + rendimento;
        }while(cod > 0);
        System.out.printf("TOTAL INVESTIDO: %.2f\n" ,totalInvestido);
        System.out.printf("TOTAL DE JUROS PAGO: %.2f" ,totalJuro);
    }
    
}
