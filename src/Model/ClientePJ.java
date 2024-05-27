package Model;

public class ClientePJ extends Cliente{
    private String CNPJ;
    private String razaoSocial;

    public ClientePJ(long id, String nome, String telefone, Endereco endereco, String CNPJ, String razaoSocial) {
        super(id, nome, telefone, endereco);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
