package Model;

public class Rota {
    private int id;
    private String destino;
    private java.time.LocalDateTime dataPartida;
    private java.time.LocalDateTime dataChegada;
    private String status;
    private Veiculo veiculo;


    public Rota() {
    }

    public Rota(int id, String destino, java.time.LocalDateTime dataPartida, java.time.LocalDateTime dataChegada, String status, Veiculo veiculo) {
        this.id = id;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.status = status;
        this.veiculo = veiculo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public java.time.LocalDateTime getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(java.time.LocalDateTime dataPartida) {
        this.dataPartida = dataPartida;
    }

    public java.time.LocalDateTime getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(java.time.LocalDateTime dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
