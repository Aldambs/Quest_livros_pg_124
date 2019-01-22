package pg_124;

import java.util.Scanner;

public class Quest_31 {
    /*
    Faça um programa que receba o tipo da ação, ou seja, uma letra a ser 
    comercializada na bolsa de valores, o preço de compra e o preço de venda de 
    cada ação e que calcule e mostre:
    • o lucro de cada ação comercializada;
    • a quantidade de ações com lucro superior a R$ 1.000,00;
    • a quantidade de ações com lucro inferior a R$ 200,00;
    • o lucro total da empresa.
    Finalize com o tipo de ação ‘F’ . 
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double compra, venda, lucro, lucroT = 0;
        int qtdLcSup = 0, qtdLcInf = 0;
        char acao;
        
        do{
            System.out.println("Informe o tipo da ação: ");
            acao = ler.next().charAt(0);
            System.out.println("Informe o valor da compra: ");
            compra = ler.nextDouble();
            System.out.println("Informe o valor da venda: ");
            venda = ler.nextDouble();
            lucro = compra - venda;
            System.out.println("O lucro da venda foi: " +lucro);
            if(lucro > 1.000){
                qtdLcSup++;
            }
            if(lucro < 200){
                qtdLcInf++;
            }
            lucroT = lucroT + lucro;
        }while (acao != 'F');
        System.out.println("A qtd de ações superior é: "+qtdLcSup);
        System.out.println("A qtd de ações inferior é: "+qtdLcInf);
        System.out.println("O lucro total da empresa é: "+lucroT);
    }
    
}
