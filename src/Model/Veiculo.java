package Model;

public class Veiculo {
    private int id;
    private String motorista;
    private String placa;
    private double capacidade;
    private String rota;

    public Veiculo() {
    }

    public Veiculo(int id, String motorista, String placa, double capacidade, String rota) {
        this.id = id;
        this.motorista = motorista;
        this.placa = placa;
        this.capacidade = capacidade;
        this.rota = rota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
