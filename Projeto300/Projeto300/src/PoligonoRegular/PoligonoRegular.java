package PoligonoRegular;

public abstract class  PoligonoRegular {
    public int numLados;
    public float tamLado;

    public PoligonoRegular(int numLados, float tamLado) {
        this.numLados = numLados;
        this.tamLado = tamLado;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public float getTamLado() {
        return tamLado;
    }

    public void setTamLado(float tamLado) {
        this.tamLado = tamLado;
    }

    public float calcularPerimetro(int numLados){
        int perimetro = 0;
        if(numLados == 3){
            perimetro = 3 * numLados;
        }
        else if (numLados == 4) {
            perimetro = 4 * numLados;
        }
        return perimetro;

    }
    public abstract float calcularArea();


}
