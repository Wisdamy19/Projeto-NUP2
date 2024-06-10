package Program;

import Model.ClientePF;
import Model.ClientePJ;
import Model.Encomenda;
import Model.Veiculo;
import Service.*;

import java.sql.ResultSet;
import java.sql.SQLException;



public class Program {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static void main(String[] args) throws SQLException {

        //ClientePFService clientePFService = new ClientePFService();
        //ClientePJService clientePJService = new ClientePJService();
        EncomendaService encomendaService = new EncomendaService();
        //FuncionarioService funcionarioService = new FuncionarioService();
        //VeiculoService veiculoService = new VeiculoService();
        //RotaService rotaService = new RotaService();

/*
        Encomenda e1 = new Encomenda();
        //Inserir
        e1.setNome("Iphone 13 256GB");
        e1.setRemetente("Carlos");
        e1.setDestinatario("João");
        e1.setEndereco("Rua dos bobos, numero 0");



        boolean message = encomendaService.inserir(e1);
        if (message){
            System.out.println(GREEN + "Cliente inserido com sucesso");
        } else {
            System.out.println(RED + "Erro ao inserir o cliente. ");
        }

 */










/*
        //Listar

        ResultSet rs = encomendaService.listar();

        while(rs.next()){
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("Nome"));
            System.out.println(rs.getString("Remetente"));
            System.out.println(rs.getString("Destinatario"));
            System.out.println(rs.getString("Endereco"));
            System.out.println("===============================");
        }


 */





/*
        //Editar

        ClientePJ e2 = new ClientePJ();
        e2.setId(1);
        e2.setNome("Casas Bahia");
        e2.setTelefone("81 9999-9999");
        e2.setEndereco("Belo Jardim");
        e2.setCNPJ("12345678901111");

        clientePJService.editar(e2);

 */



/*
        //Excluir

        ClientePJ e3 = new ClientePJ();
        e3.setId(2);
        clientePJService.excluir(e3);


 */






    }
}
