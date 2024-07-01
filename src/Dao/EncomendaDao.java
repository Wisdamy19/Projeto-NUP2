package Dao;

import JBDC.Conexao;
import Model.Encomenda;
import Model.Veiculo;

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
            String SQL = "INSERT INTO encomenda(nome, remetente, destinatario, endereco, peso, veiculo_id)" +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, encomenda.getNome());
            ps.setString(2, encomenda.getRemetente());
            ps.setString(3, encomenda.getDestinatario());
            ps.setString(4, encomenda.getEndereco());
            ps.setDouble(5, encomenda.getPeso());
            ps.setInt(6, encomenda.getVeiculo().getId());

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
            String SQL = "UPDATE encomenda SET nome=?, remetente=?, destinatario=?, endereco=?, peso=? WHERE id=?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, encomenda.getNome());
            ps.setString(2, encomenda.getRemetente());
            ps.setString(3, encomenda.getDestinatario());
            ps.setString(4, encomenda.getEndereco());
            ps.setDouble(5, encomenda.getPeso());
            ps.setInt(6, encomenda.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public ResultSet listarPesoEncomendas(Veiculo veiculo){
        try {
            PreparedStatement ps = conexao.getConn().prepareStatement(" SELECT sum(peso) AS total_peso FROM encomenda WHERE veiculo_id =?;");

            ps.setInt(1, veiculo.getId());
            ResultSet rs = ps.executeQuery();
            if (rs != null){
                return rs;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
