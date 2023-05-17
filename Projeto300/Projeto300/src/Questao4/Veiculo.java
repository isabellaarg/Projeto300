package Questao4;

public class Veiculo {
    private String cor;
    private String placa;
    private String modelo;
    private int ano;

    Veiculo (String cor, String placa, String modelo, int ano){
        setCor(cor);
        setPlaca(placa);
        setModelo(modelo);
        setAno(ano);
    }

    public Veiculo() {
    }

    private void setCor(String cor){
        this.cor = cor;
    }

    private void setPlaca(String placa){
        this.placa = placa;
    }

    private void setModelo(String modelo){
        this.modelo = modelo;
    }

    private void setAno(int ano){
        this.ano = ano;
    }

    public String getCor(){
        return cor;
    }

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public int verificaPlaca(String placa){
        int vogal = 0;
        for(int i=0;i<placa.length();i++){
            if(placa.charAt(i) == 'a' || placa.charAt(i) == 'A' || placa.charAt(i) == 'e' || placa.charAt(i) == 'E' || placa.charAt(i) == 'i' || placa.charAt(i) == 'I' || placa.charAt(i) == 'o' || placa.charAt(i) == 'O' || placa.charAt(i) == 'u' || placa.charAt(i) == 'U'){
                vogal++;
            }
        }
        return vogal;

    }
}
