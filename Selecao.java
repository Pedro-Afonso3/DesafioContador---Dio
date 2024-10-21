package Mains;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Selecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         /*double valorPretendido;

        System.out.println("Candidato digite o valor que pretende ter de salário: ");
        valorPretendido = scan.nextDouble();

        analisarProposta(valorPretendido);*/

        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Olivia", "Carla", "João", "Paulo", "Breno", "Camila", "Caio", "Ana", "Guilherme"};
        String[] selecionados = new String[5];

        int cont = 0;
        double salarioBase = 2000;

        for (String candidato : candidatos) {
            if (cont <= 4) {
                if (valorPretendido() <= salarioBase) {
                    selecionados[cont] = candidato;
                    cont++;
                }
            }
        }

        System.out.println("Os candidatos selecionados foram :");
        for (String sele : selecionados) {
            System.out.println(sele);
        }

        System.out.println("___________________________________________________________________________________");

        int tentativas = 1;
        int quants = 0;

        for(int i = 0;i <= selecionados.length;i++){
            while(tentativas <= 3) {
                if (trueFalse() == 1) { // 1 = Conseguiu ligar | 2 = Não conseguiu ligar
                    System.out.println("Conseguimos entrar em contato com o candidato " + selecionados[i] + " após "+tentativas+" tentativa(s)");
                    break;
                }else{
                    quants++;
                }

                if(quants == 3){
                    System.out.println("Não conseguimos entrar em contato com o candidato "+selecionados[i]);
                }
                tentativas++;
                if (tentativas == 3){
                    quants= 0;
                }
            }
            tentativas = 1;
        }

    }

    /*static void candsSelecionados() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Olivia", "Carla", "João", "Paulo", "Breno", "Camila", "Caio", "Ana", "Guilherme"};
        String[] selecionados = new String[5];

        int cont = 0;
        double salarioBase = 2000;

        for (String candidato : candidatos) {
            if (cont <= 4) {
                if (valorPretendido() <= salarioBase) {
                    selecionados[cont] = candidato;
                    cont++;
                }
            }
        }

        System.out.println("Os candidatos selecionados foram :");
        for (String sele : selecionados) {
            System.out.println(sele);
        }
    }*/

    static void analisarProposta ( double valor){
        double valorBase = 2000;

        if (valor < valorBase) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (valor == valorBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static int trueFalse(){
        return ThreadLocalRandom.current().nextInt(0,2);
    }

}
