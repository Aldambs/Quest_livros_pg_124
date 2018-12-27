package pg_124;

import java.text.NumberFormat;
import java.util.Scanner;

public class Quest_14 {
    /*Faça um programa que receba a idade, o peso, a altura, a cor dos olhos 
    (A — azul; P — preto; V — verde; e C — castanho) e a cor dos cabelos 
    (P — preto; C — castanho; L — louro; e R — ruivo) de seis pessoas, e que
    c alcule e mostre:
    ■■ a quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg;
    ■■ a média das idades das pessoas com altura inferior a 1,50 m;
    ■■ a porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas; e
    ■■ a quantidade de pessoas ruivas e que não possuem olhos azuis.
    */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String cor_olhos, cor_cabelos;
        int idade, qtd = 0, qtdID = 0, qtdOlhoAzul = 0, qtdCorCabeloR = 0;
        double altura, peso, med_id, soma = 0, por = 0;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        System.out.println("Informe a quantidade de pessoas a serem analisadas: ");
        int qtdPessoas = ler.nextInt();
        
        for (int i = 1; i <= qtdPessoas; i++) {
            System.out.println( i+ "º PESSOA ");
            System.out.println("Informe a cor do cabelo: \n"
                    + "L(louro) "
                    + "P(preto) "
                    + "C(castanho) "
                    + "R(ruivo):");
            cor_cabelos = ler.next();
            System.out.println("Informe a cor do olhos: "
                    + "A(azul) "
                    + "P(preto) "
                    + "C(castanho) "
                    + "V(verde):");
            cor_olhos = ler.next();
            System.out.println("Informe a altura: ");
            altura = ler.nextDouble();
            System.out.println("Informe o peso: ");
            peso = ler.nextDouble();
            System.out.println("Informe a idade: ");
            idade = ler.nextInt();
            
            if (idade > 50 && peso < 60) {
                qtdID++;
            }
            if (altura < 1.50) {
                qtd++;
            }
            if (cor_olhos.equalsIgnoreCase("a") ) {
                 qtdOlhoAzul++;
            }
            if (cor_cabelos.equalsIgnoreCase("R") && !"a".equals(cor_olhos)) {
                qtdCorCabeloR++;
            }
        }
        System.out.println("\n");
        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + qtdID);
        System.out.println("Media das idades das pessoas com altura inferior a 1,50: " + qtd);
        System.out.println("A porcentagem de pessoas com olhos azuis: " + qtdOlhoAzul / qtdPessoas);
        System.out.println("A quantidade de pessoas ruivas que não possuem olhos azuis: " + qtdCorCabeloR);
    }
    
}
