package Model;

public class ClientePJ extends Cliente{
    private String CNPJ;

    public ClientePJ() {
        super();
    }

    public ClientePJ(int id, String nome, String telefone, String endereco, String CNPJ) {
        super(id, nome, telefone, endereco);
        this.CNPJ = CNPJ;

    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
