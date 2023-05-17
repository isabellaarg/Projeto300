package Questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        System.out.println("Escolha o veiculo para cadastrar: \n1. Carro \n2. Moto");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Ingresse o modelo do veiculo: ");
                String modelo = sc.next();
                sc.nextLine();
                System.out.println("Ingresse a placa do veiculo: ");
                String placa = sc.nextLine();
                System.out.println("Ingresse a cor do veiculo: ");
                String cor = sc.nextLine();
                System.out.println("Ingresse o ano do veiculo: ");
                int ano = sc.nextInt();
                System.out.println("Ingresse a quantidade de portas do veiculo: ");
                int qtdePortas = sc.nextInt();

                Carro carro = new Carro(cor, placa, modelo, ano);
                carro.setQtdePortas(qtdePortas);

                System.out.println(carro.imprimeDados());
                break;

            case 2:
                System.out.println("Ingresse o modelo do veiculo: ");
                modelo = sc.next();
                sc.nextLine();
                System.out.println("Ingresse a placa do veiculo: ");
                placa = sc.nextLine();
                System.out.println("Ingresse a cor do veiculo: ");
                cor = sc.nextLine();
                System.out.println("Ingresse o ano do veiculo: ");
                ano = sc.nextInt();
                System.out.println("Ingresse as cilindrada do veiculo: ");
                int qtdeCilindrada = sc.nextInt();

                Moto moto = new Moto(cor, placa, modelo, ano);
                moto.setQtdeCilindradas(qtdeCilindrada);

                System.out.println(moto.imprimeDados());
                break;
        }

    }
}
