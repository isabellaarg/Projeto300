package Questao4;

public class Moto extends Veiculo {
    private int qtdeCilindradas;

    Moto(String cor, String placa, String modelo, int ano) {
        super(cor, placa, modelo, ano);
    }

    public int getQtdeCilindradas() {
        return qtdeCilindradas;
    }

    public void setQtdeCilindradas(int qtdeCilindradas) {
        this.qtdeCilindradas = qtdeCilindradas;
    }
    public String imprimeDados() {
        return "Carro <" + getModelo() +"> \nCor <" + getCor() + ">" + "\nPlaca <" + getPlaca() + "> \nQuantidade de Cilindradas <" + getQtdeCilindradas() + ">" ;
    }
}
