package CalculaMensalidade;

public class Mensalidade {
    private double mensalidade;
    private int nrosDeIrmaos;

    public Mensalidade(double mensalidade, int nrosDeIrmaos) {
        this.mensalidade = mensalidade;
        this.nrosDeIrmaos = nrosDeIrmaos;
    }

    public Mensalidade() {
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getNrosDeIrmaos() {
        return nrosDeIrmaos;
    }

    public void setNrosDeIrmaos(int nrosDeIrmaos) {
        this.nrosDeIrmaos = nrosDeIrmaos;
    }

    public double calculaMensalidade(){
        if(nrosDeIrmaos == 1){
            mensalidade -= mensalidade * 0.05;
        }

        else if(nrosDeIrmaos == 2){
            mensalidade -= mensalidade * 0.10;
        }
        else{
            mensalidade -= mensalidade * 0.15;
        }
        return mensalidade;
    }
}
