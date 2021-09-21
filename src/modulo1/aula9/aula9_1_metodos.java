//Dia 2021-09-21
// Modulo 2 - aula 9 - procedimentos, funcoes e metodos
// Procedimentos : não retornam nada| Funcoes: retornam algo | Metodos: sao procedimentos ou funcoes dentro de uma classe
// SRP - Single Responsibility Principle - Principio da responsabilidade unica | o metodo deve resolver um unico problema
package modulo1.aula9;

import java.util.Scanner;

public class aula9_1_metodos {
    //a variavel estatica se torna visivel para toda a classe
    static Scanner sc = new Scanner(System.in);

    //metodo principal, ponto de partida do programa
    public static void main(String[] args) {
        cabecalho();
        imprime_menu();
        escolha_menu();
    }

    //os metodos estaticos obrigam que os proximos metodos utilizam tambem sejam estaticos
    //void indica que o metodo nao tem retorno
    static void cabecalho(){
        System.out.println("============= CALCULADORA =============");
    }

    static void imprime_menu(){
        System.out.println("Menu");
        System.out.println("\t1- Soma");
        System.out.println("\t2- Subtracao");
        System.out.println("\t3- Divisao");
        System.out.println("\t4- Multiplicacao");
        System.out.println("\t0- Sair");
    }

    static void escolha_menu(){
        int op = ler_numero("Digite uma opção do menu:");
        int n1=0,n2=0,r=0;

        if (op>0){
            n1 = ler_numero("Digite o primeiro numero:");
            n2 = ler_numero("Digite o segundo numero:");
        }

        switch (op){
            case 1:
                r = soma(n1,n2);
                break;
            case 2:
                r = subtracao(n1,n2);
                break;
            case 3:
                r = divisao(n1,n2);
                break;
            case 4:
                r = multiplicacao(n1,n2);
                break;
            case 0:
                return;
        }

        if (op >0){
            System.out.printf(" O resultado da operacao é: %d",r);
        }
    }

    static int ler_numero(String mensagem){
        System.out.println(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    //OPERAÇÕES
    static int soma(int n1,int n2){
        int resultado = n1+n2;
        return resultado;
    }

    static int subtracao(int n1,int n2){
        int resultado = n1-n2;
        return resultado;
    }

    static int multiplicacao(int n1,int n2){
        int resultado = n1*n2;
        return resultado;
    }

    static int divisao(int n1,int n2){
        int resultado = n1/n2;
        return resultado;
    }
}
