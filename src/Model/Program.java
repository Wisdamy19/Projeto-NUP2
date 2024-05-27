package Model;

public class Program {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Maceió", "AL", "Rua dos Bobos", "1234", "57063000");
        ClientePF clientePF = new ClientePF(12442, "Antônio", "82-9248284", endereco, "11051092400");
        System.out.println(clientePF.getEndereco());
    }
}
