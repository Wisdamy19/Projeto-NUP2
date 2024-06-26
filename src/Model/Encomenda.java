package Model;

public class Encomenda {
    private int id;
    private String nome;
    private String remetente;
    private String destinatario;
    private String endereco;
    private double peso;
    private Veiculo veiculo;

    public Encomenda() {
    }

    public Encomenda(int id, String nome, String remetente, String destinatario, String endereco, double peso, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.peso = peso;
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
