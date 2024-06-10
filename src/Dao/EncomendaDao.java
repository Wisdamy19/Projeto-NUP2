package Dao;

import JBDC.Conexao;
import Model.Encomenda;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EncomendaDao {
    private Conexao conexao;
    private PreparedStatement ps;



    public EncomendaDao() {
        conexao = new Conexao();
    }

    public ResultSet listar(){
        try {
            return conexao.getConn().createStatement().executeQuery("SELECT * FROM encomenda");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void inserir(Encomenda encomenda){
        try {
            String SQL = "INSERT INTO encomenda(nome, remetente, destinatario, endereco)" +
                    "VALUES (?, ?, ?, ?)";
            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, encomenda.getNome());
            ps.setString(2, encomenda.getRemetente());
            ps.setString(3, encomenda.getDestinatario());
            ps.setString(4, encomenda.getEndereco());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void excluir(Encomenda encomenda){
        try {
            String SQL = "DELETE FROM encomenda WHERE id = ?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setInt(1, encomenda.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void editar(Encomenda encomenda){
        try {
            String SQL = "UPDATE encomenda SET nome=?, remetente=?, destinatario=?, endereco=? WHERE id=?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, encomenda.getNome());
            ps.setString(2, encomenda.getRemetente());
            ps.setString(3, encomenda.getDestinatario());
            ps.setString(4, encomenda.getEndereco());
            ps.setInt(5, encomenda.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
