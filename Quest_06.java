package pg_124;

/**
 */
public class Quest_06 {

    /**
     * @param args the command line arguments
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
