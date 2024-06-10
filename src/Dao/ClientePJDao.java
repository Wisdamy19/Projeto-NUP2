package Dao;

import JBDC.Conexao;

import Model.ClientePJ;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientePJDao {
    private Conexao conexao;
    private PreparedStatement ps;



    public ClientePJDao() {
        conexao = new Conexao();
    }

    public ResultSet listar(){
        try {
            return conexao.getConn().createStatement().executeQuery("SELECT * FROM cliente_PJ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void inserir(ClientePJ clientePJ){
        try {
            String SQL = "INSERT INTO cliente_PJ(nome, telefone, endereco, CNPJ)" +
                    "VALUES (?, ?, ?, ?)";
            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, clientePJ.getNome());
            ps.setString(2, clientePJ.getTelefone());
            ps.setString(3, clientePJ.getEndereco());
            ps.setString(4, clientePJ.getCNPJ());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void excluir(ClientePJ clientePJ){
        try {
            String SQL = "DELETE FROM cliente_pj WHERE id = ?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setInt(1, clientePJ.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void editar(ClientePJ clientePJ){
        try {
            String SQL = "UPDATE cliente_pj SET nome=?, telefone=?, endereco=?, CNPJ=? WHERE id=?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, clientePJ.getNome());
            ps.setString(2, clientePJ.getTelefone());
            ps.setString(3, clientePJ.getEndereco());
            ps.setString(4, clientePJ.getCNPJ());
            ps.setInt(5, clientePJ.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}
