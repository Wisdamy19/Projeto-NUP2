package Dao;

import JBDC.Conexao;
import Model.ClientePF;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientePFDao {
    private Conexao conexao;
    private PreparedStatement ps;



    public ClientePFDao() {
        conexao = new Conexao();
    }

    public ResultSet listar(){
        try {
            return conexao.getConn().createStatement().executeQuery("SELECT * FROM cliente_PF");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void inserir(ClientePF clientePF){
        try {
            String SQL = "INSERT INTO cliente_PF(nome, telefone, endereco, CPF)" +
                    "VALUES (?, ?, ?, ?)";
            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, clientePF.getNome());
            ps.setString(2, clientePF.getTelefone());
            ps.setString(3, clientePF.getEndereco());
            ps.setString(4, clientePF.getCPF());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void excluir(ClientePF clientePF){
        try {
            String SQL = "DELETE FROM cliente_pf WHERE id = ?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setInt(1, clientePF.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void editar(ClientePF clientePF){
        try {
            String SQL = "UPDATE cliente_pf SET nome=?, telefone=?, endereco=?, CPF=? WHERE id=?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, clientePF.getNome());
            ps.setString(2, clientePF.getTelefone());
            ps.setString(3, clientePF.getEndereco());
            ps.setString(4, clientePF.getCPF());
            ps.setInt(5, clientePF.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}
