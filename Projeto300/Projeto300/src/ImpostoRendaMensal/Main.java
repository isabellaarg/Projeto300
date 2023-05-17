package ImpostoRendaMensal;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberFormat numberFormat;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a opção para calcular o imposto de renda: \n1. Pessoa Fisica \n2. Pessoa Juridica");
        int opcao = sc.nextInt();
        String nome, cpf, cnpj;
        double rendaBruta;
        Contribuinte contribuinte = new Contribuinte();


        switch (opcao){
            case 1:
                System.out.println("Ingresse o nome: ");
                nome = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingresse o cpf: ");
                cpf = sc.next();
                System.out.println("Ingresse a renda bruta: ");
                rendaBruta = sc.nextDouble();

                PessoaFisica pf = new PessoaFisica(nome, rendaBruta, cpf);
                contribuinte.setNome(nome);
                contribuinte.setRendaBruta(rendaBruta);
                pf.setCpf(cpf);

                pf.calculoImpostoRenda();
                System.out.println(pf.imprimirCalculoPf());
                break;

            case 2:
                System.out.println("Ingresse o nome: ");
                nome = sc.nextLine();
                System.out.println("Ingresse o cpf: ");
                cnpj = sc.next();
                System.out.println("Ingresse a renda bruta: ");
                rendaBruta = sc.nextDouble();

                PessoaJuridica pj = new PessoaJuridica(nome, rendaBruta, cnpj);
                pj.setNome(nome);
                pj.setCnpj(cnpj);
                pj.setRendaBruta(rendaBruta);

                pj.calculoImpostoRenda(rendaBruta);
                System.out.println(pj.imprimirCalculoPj());;

                break;

            default:
                break;
        }
    }
}
