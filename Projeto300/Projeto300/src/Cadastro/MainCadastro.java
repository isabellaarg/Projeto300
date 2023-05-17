package Cadastro;

import java.util.Scanner;

public class MainCadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.println("Ingresse o nome da pessoa: ");
        String nome = sc.nextLine();
        pessoa.setNome(nome);

        System.out.println("Ingresse o sobrenome da pessoa: ");
        String sobrenome = sc.nextLine();
        pessoa.setSobrenome(sobrenome);

        pessoa.ImprimeNomeCompleto();

    }
}
