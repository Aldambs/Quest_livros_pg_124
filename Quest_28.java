package pg_124;

import java.util.Scanner;

public class Quest_28 {
    /*
    4) A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando 
    dados sobre o salário e número de filhos. A prefeitura deseja saber:
    a) média do salário da população;
    b) média do número de filhos;
    c) maior salário;
    d) percentual de pessoas com salário até R$ 150,00.
    O final da leitura de dados se dará com a entrada de um salário negativo.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario, somaSalario = 0, maiorSalario = 0;
 	int numFilhos, contHab = 0, somaNumFilhos = 0, contSalMenor150 = 0;
  	
        do{
            
            System.out.println("Digite o salário: ");
            salario = ler.nextDouble();
            System.out.println("Digite o número de filhos: ");
            numFilhos = ler.nextInt();
            contHab =+ 1;
            somaSalario = somaSalario + salario;
            somaNumFilhos = somaNumFilhos + numFilhos;
            
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario <= 150) {
                contSalMenor150 = contSalMenor150 + 1;
                System.out.println("Digite o salário: ");
                salario = ler.nextDouble();
            }
        }
        while (salario > 0) ;
        System.out.println("Média do salário da população:" + (somaSalario / contHab));
        System.out.println("Média do número de filhos:" + (somaNumFilhos / contHab));
        System.out.println("Maior salário:" + maiorSalario);
        System.out.println("Percentual de pessoas com salário até R$ 150,00: " + (contSalMenor150 / contHab * 100) + "%");
    }
}
