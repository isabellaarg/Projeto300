package PoligonoRegular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de lados do poligono regular: ");
        int numLados = sc.nextInt();

        System.out.println("Digite o tamanho de lados do poligono regular: ");
        float tamLados = sc.nextFloat();

        if(numLados == 3){
            Triangulo triangulo = new Triangulo(numLados, tamLados);
            System.out.println("Perimetro: " + triangulo.calcularPerimetro(numLados) + " m2");
            System.out.println("Area: " +triangulo.calcularArea() + " m2");
        }
        else if (numLados == 4){
            Quadrado quadrado = new Quadrado(numLados, tamLados);
            System.out.println("Perimetro: " +quadrado.calcularPerimetro(numLados) + " m2");
            System.out.println("Area: " + quadrado.calcularArea() + " m2");
        }
    }
}
