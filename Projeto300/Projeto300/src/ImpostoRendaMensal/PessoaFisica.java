package ImpostoRendaMensal;

public class PessoaFisica extends Contribuinte{
    private String cpf;


    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    double valorImposto = 0;

    public void calculoImpostoRenda (){

        if(getRendaBruta() < 1903.98){
            valorImposto = getRendaBruta();
        }
        else if (getRendaBruta() >= 1903.99 && getRendaBruta() < 2826.65 ){
            valorImposto = getRendaBruta() * 0.075;
        }
        else if (getRendaBruta() >= 2826.66 && getRendaBruta() < 3751.05 ){
            valorImposto = getRendaBruta() * 0.15;
        }
        else if (getRendaBruta() >= 3751.06 && getRendaBruta() < 4664.68 ){
            valorImposto = getRendaBruta() * 0.225;
        }
        else {
            valorImposto = getRendaBruta() * 0.275;
        }
    }

    public String imprimirCalculoPf() {
        return "O valor a ser pago de impostos de Pessoa Fisica R$ " + valorImposto;
    }
}
