package PoligonoRegular;

public class Triangulo extends PoligonoRegular {

    public Triangulo(int numLados, float tamLado) {
        super(numLados, tamLado);
    }

    public float calcularArea() {
        return (tamLado * tamLado)/2;
    }
}
