package Model;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private String CPF;
    private double salario;
    private String status;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String cargo, String CPF, double salario, String status) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.CPF = CPF;
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
