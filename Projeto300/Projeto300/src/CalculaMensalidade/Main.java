package CalculaMensalidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mensalidade mensalidade = new Mensalidade();

        System.out.println("Ingresse o valor da mensalidade do aluno: ");
        double valorMensalidade = sc.nextDouble();
        mensalidade.setMensalidade(valorMensalidade);


        System.out.println("Ingresse a numero de irmãos do aluno: ");
        int nroDeIrmaos = sc.nextInt();
        mensalidade.setNrosDeIrmaos(nroDeIrmaos);

        System.out.println("O valor da mensalidade a ser pago pelo Aluno R$ " + mensalidade.calculaMensalidade());




    }
}
