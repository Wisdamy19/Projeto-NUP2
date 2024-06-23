package Model;

public class Veiculo {
    private int id;
    private String nome;
    private String motorista;
    private String placa;
    private double capacidade;
    private String rota;
    private String status;

    public Veiculo() {
    }

    public Veiculo(int id, String nome, String motorista, String placa, double capacidade, String rota, String status) {
        this.id = id;
        this.nome = nome;
        this.motorista = motorista;
        this.placa = placa;
        this.capacidade = capacidade;
        this.rota = rota;
        this.status = status;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
