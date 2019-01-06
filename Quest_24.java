package pg_124;

import java.util.Scanner;

public class Quest_24 {
    /*
    Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram 
    ou não de um novo produto lançado no mercado. Para isso, forneceu o sexo do 
    entrevistado e sua resposta (sim ou não).Sabendo-se que foram entrevistadas dez pessoas.
    Faça um programa que calcule:
    a] Número de pessoas que responderam “Sim";
    b] Número de pessoas que responderam "Não";
    c] Número de mulheres que responderam “Sim";
    e] A porcentagem de homens que responderam Não entre todos os homens analisados.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String resp, sexo;
        int qtdF = 0, qtdM = 0, contS = 0, contN = 0, numMulherS = 0;
        double porc = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o sexo: (F ou M)");
            sexo = ler.next();
            System.out.println("Gostou do produto? Informe (Sim ou Não) ");
            resp = ler.next();

            if ("f".equalsIgnoreCase(sexo) && "sim".equalsIgnoreCase(resp)) {
                qtdF++;
                contS++;
                numMulherS++;
                if ("não".equalsIgnoreCase(resp)) {
                    contN++;
                }
            }

            if ("m".equalsIgnoreCase(sexo) && "sim".equalsIgnoreCase(resp)){
               qtdM++;
               contS++;
                if ("não".equalsIgnoreCase(resp)) {
                    contN++;
                }
            }                
        }
        porc = contN / 100;
        System.out.println("Nº de pesssoas respondeu sim: " +contS);
        System.out.println("Nº de pesssoas respondeu não: " +contN);
        System.out.println("Nº de mulheres respondeu sim: " +numMulherS);
        System.out.println("A porcentagem de homens que respondereu não: " +porc);
    }
    
}
