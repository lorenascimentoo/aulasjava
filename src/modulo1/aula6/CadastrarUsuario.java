package modulo1.aula6;

import java.util.Scanner;

public class CadastrarUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t==== CADASTRO DE USUARIOS ===");
        System.out.print("\tInforme a quantidade de usuarios que deseja cadastrar: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <=qtd; i++){
            System.out.println("\tCADASTRO DO USUÁRIO Nª: "+i);
            System.out.print("\tInforme o nome do usuário: ");
            String nome = sc.nextLine();
            System.out.print("\tInforme o sobrenome do usuário: ");
            String sobrenome = sc.nextLine();

            System.out.println("\tAGUARDE...");

            System.out.println("\t-- USUARIO CADASTRADO COM SUCESSO!");
            System.out.printf("\t=== USUARIO: %s |=== SOBRENOME: %s \n", nome,sobrenome);

        }
    }
}
