package Model;

public class Entrega {
    private long id;
    private Encomenda encomenda;
    private String remetente;
    private String destinatario;
    private Endereco endereco;

    public Entrega(long id, Encomenda encomenda, String remetente, String destinatario, Endereco endereco) {
        this.id = id;
        this.encomenda = encomenda;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
