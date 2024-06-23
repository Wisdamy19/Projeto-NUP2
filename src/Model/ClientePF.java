package Model;

public class ClientePF extends Cliente {
    private String CPF;


    public ClientePF() {
        super();
    }

    public ClientePF(int id, String nome, String telefone, String endereco, String CPF) {
        super(id, nome, telefone, endereco);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
