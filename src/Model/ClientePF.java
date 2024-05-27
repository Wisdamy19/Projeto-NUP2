package Model;

public class ClientePF extends Cliente {
    private String CPF;

    public ClientePF(long id, String nome, String telefone, Endereco endereco, String CPF) {
        super(id, nome, telefone, endereco);
        this.CPF = CPF;
    }
}
