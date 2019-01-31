package pg_124;

import java.util.Scanner;

public class Quest_37 {
    /*
    Faça um programa que apresente um menu de opções para o cálculo das seguintes
    operações a entre dois números : adição, subtração, multiplicada e divisão. O 
    programa deve possibilitar ao usuário a escolha da operação desejada, a 
    exibição do resultado e a volta ao menu de opções . O programa só termina 
    quando for escolhida a opção de saída.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1, num2;
        int op;
        
        do{
            System.out.println("Informe a opção:\n"
                    + "1.Adição\n"
                    + "2.Subtração\n"
                    + "3.Multiplicação\n"
                    + "4.Divisão\n"
                    + "0.Sair");
            op = ler.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Informe o 1º número: ");
                    num1 = ler.nextDouble();
                    System.out.println("Informe o 2º número: ");
                    num2 = ler.nextDouble();
                    double soma = num1 + num2;
                    System.out.println("A soma é: " + soma);
                    break;
                case 2:
                    System.out.println("Informe o 1º número: ");
                    num1 = ler.nextDouble();
                    System.out.println("Informe o 2º número: ");
                    num2 = ler.nextDouble();
                    double subtracao = num1 - num2;
                    System.out.println("A soma é: " + subtracao);
                    break;
                case 3:
                    System.out.println("Informe o 1º número: ");
                    num1 = ler.nextDouble();
                    System.out.println("Informe o 2º número: ");
                    num2 = ler.nextDouble();
                    double multi = num1 * num2;
                    System.out.println("A multiplicação é: " + multi);
                    break;
                case 4:
                    System.out.println("Informe o 1º número: ");
                    num1 = ler.nextDouble();
                    System.out.println("Informe o 2º número: ");
                    num2 = ler.nextDouble();
                    if(num2 == 0){
                        System.out.println("Erro! Impossivel dividir por 0!");
                    }else{
                        double div = num1 / num2;
                        System.out.println("A divisão é: " +div);
                    }
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Informe uma opção válida");
            }
        }while(op != 0);
    }
    
}
