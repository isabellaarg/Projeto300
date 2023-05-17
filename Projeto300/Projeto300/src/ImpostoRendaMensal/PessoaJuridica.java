package ImpostoRendaMensal;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void calculoImpostoRenda (double rentaBruta){
        rentaBruta -= rentaBruta * 0.10;
    }
    public String imprimirCalculoPj() {
        return "O valor a ser pago de impostos de Pessoa Juridica R$ " + getRendaBruta();
    }
}
