package Program;

import Model.*;
import Service.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;


public class Program {
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static void main(String[] args) throws SQLException {

        //ClientePFService clientePFService = new ClientePFService();
        //ClientePJService clientePJService = new ClientePJService();
        //EncomendaService encomendaService = new EncomendaService();
        //FuncionarioService funcionarioService = new FuncionarioService();
        //VeiculoService veiculoService = new VeiculoService();
        RotaService rotaService = new RotaService();




/*
        Veiculo veiculo = new Veiculo();
        veiculo.setId(2);
        Rota e1 = new Rota();
        //Inserir
        e1.setDestino("Rio de Janeiro-RJ");
        e1.setDataPartida(LocalDateTime.of(2024, 6, 12, 9, 0, 0));
        e1.setDataChegada(LocalDateTime.of(2024, 6, 12, 9, 0, 0));
        e1.setStatus("Em transporte.");
        e1.setVeiculo(veiculo);


        rotaService.inserir(e1);

 */


/*
        //listar por id
        Veiculo veiculo = new Veiculo();

        veiculo.setId(2);
        ResultSet rs = veiculoService.listarId(veiculo);
        while(rs.next()){
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("Nome"));
            System.out.println(rs.getString("Motorista"));
            System.out.println(rs.getString("Placa"));
            System.out.println(rs.getDouble("Capacidade"));
            System.out.println(rs.getString("Rota"));

            System.out.println("===============================");
        }


 */
        //listar por id
        Rota rota = new Rota();

        rota.setId(3);
        ResultSet rs = rotaService.listarId(rota);
        while(rs.next()){
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("Destino"));
            System.out.println(rs.getString("Data_partida"));
            System.out.println(rs.getString("Data_chegada"));
            System.out.println(rs.getString("Status"));
            System.out.println(rs.getString("Veiculo_id"));

            System.out.println("===============================");
        }

























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
