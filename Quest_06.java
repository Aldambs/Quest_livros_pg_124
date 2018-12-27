package pg_124;

public class Quest_06 {
    /*
     Uma companhia de teatro deseja montar uma série de espetáculos. A direção 
     calcula que, a R$ 5,00 o ingresso, serão vendidos 120 ingressos, e que as 
    despesas serão de R$ 200,00. Diminuindo-se em R$ 0,50 o preço dos ingressos, 
    espera-se que as vendas aumentem em 26 ingressos. Faça um programa que escreva
    uma tabela de valores de lucros esperados em função do preço do ingresso, fazendo-se 
    variar esse preço $ 5,00 a R$ 1,00, de R$ 0,50 em R$ 0,50. Escreva, ainda, 
    para cada novo preço de ingresso, o lucromáximo esperado, o preço do ingresso 
    e a quantidade de ingressos vendidos para a obtenção desse lucro.
     */
    public static void main(String[] args) {
        double valorIngresso, valorDespesa, lucro;
        double valorIngressoMaiorLucro, valorMaiorLucro;
        int numeroIngresso, numeroIngressoMaiorLucro;

        // Inicializar as variáveis           
        valorIngresso = 5.00;
        valorDespesa = 200;
        numeroIngresso = 120;
        lucro = (numeroIngresso * valorIngresso) - valorDespesa;
        System.out.println("Valor - Vendidos - Despesas - Lucro");
        // Incializando as variáveis do maior lucro
        valorIngressoMaiorLucro = valorIngresso;
        valorMaiorLucro = lucro;
        numeroIngressoMaiorLucro = numeroIngresso;

        //Calcular o lucro dos ingressos reduzidos
        while (valorIngresso >= 1.0) {
            System.out.print(valorIngresso);
            System.out.print("    -  " + numeroIngresso);
            System.out.print("    -  " + valorDespesa);
            System.out.println("   -  " + lucro);
            valorIngresso = valorIngresso - 0.50;
            numeroIngresso = numeroIngresso + 26;
            lucro = (numeroIngresso * valorIngresso) - valorDespesa;

            // Identificando o valor lucro;    
            if (lucro > valorMaiorLucro) {
                valorIngressoMaiorLucro = valorIngresso;
                valorMaiorLucro = lucro;
                numeroIngressoMaiorLucro = numeroIngresso;
            }
        }

        // Imprimindo as informações do maior lucro
        System.out.println("===== MAIOR  LUCRO =====");
        System.out.print(valorIngressoMaiorLucro);
        System.out.print("  -  " + numeroIngressoMaiorLucro);
        System.out.print("  -  " + valorDespesa);
        System.out.print("  -  " + valorMaiorLucro);

    }

}
