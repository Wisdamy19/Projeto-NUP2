package JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLTest {
    public static void main(String[] args) {
        // Configurações do banco de dados
        String url = "jdbc:mysql://localhost:3306/my_db"; // Substitua pelo seu URL do MySQL
        String username = "root"; // Substitua pelo seu usuário do MySQL
        String password = "0809"; // Substitua pela sua senha do MySQL

        // Tente se conectar ao banco de dados
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Conexão estabelecida com sucesso!");

            // Criar uma declaração para executar consultas
            Statement statement = connection.createStatement();

            // Executar uma consulta simples
            ResultSet resultSet = statement.executeQuery("SELECT 1");

            // Verificar os resultados
            while (resultSet.next()) {
                int result = resultSet.getInt(1);
                System.out.println("Resultado da consulta: " + result);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace();
        }
    }
}

