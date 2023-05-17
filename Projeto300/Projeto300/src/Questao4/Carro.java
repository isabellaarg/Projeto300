package Questao4;

public class Carro extends Veiculo {
    private int qtdePortas;

    Carro(String cor, String placa, String modelo, int ano) {
        super(cor, placa, modelo, ano);
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
    public String imprimeDados() {
        return "Carro <" + getModelo() +"> \nCor <" + getCor() + ">" + "\nPlaca <" + getPlaca() + ">" ;
    }
}
