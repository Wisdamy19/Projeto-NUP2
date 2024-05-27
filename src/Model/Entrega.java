package Model;

public class Entrega {
    private long id;
    private String encomenda;
    private Endereco endereco;

    public Entrega(long id, String encomenda, Endereco endereco) {
        this.id = id;
        this.encomenda = encomenda;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEncomenda() {
        return encomenda;
    }

    public void setProduto(String encomenda) {
        this.encomenda = encomenda;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
