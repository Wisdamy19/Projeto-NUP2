package Dao;

import JBDC.Conexao;

import Model.Rota;
import Model.Veiculo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RotaDao {
    private Conexao conexao;
    private PreparedStatement ps;
    public RotaDao() {
        conexao = new Conexao();
    }

    public ResultSet listar(){
        try {
            return conexao.getConn().createStatement().executeQuery("SELECT * FROM rota");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void inserir(Rota rota){
        try {
            String SQL = "INSERT INTO rota(destino, data_partida, data_chegada, status, veiculo_id)" +
                    "VALUES (?, ?, ?, ?, ?)";
            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, rota.getDestino());
            ps.setObject(2, rota.getDataPartida());
            ps.setObject(3, rota.getDataChegada());
            ps.setString(4, rota.getStatus());
            ps.setInt(5, rota.getVeiculo().getId());



            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void excluir(Rota rota){
        try {
            String SQL = "DELETE FROM rota WHERE id = ?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setInt(1, rota.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void editar(Rota rota){
        try {
            String SQL = "UPDATE rota SET destino=?, data_partida=?, data_chegada=?, status=? WHERE id=?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, rota.getDestino());
            ps.setObject(2, rota.getDataPartida());
            ps.setObject(3, rota.getDataChegada());
            ps.setString(4, rota.getStatus());
            ps.setInt(5, rota.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public ResultSet listarId(Rota rota){
        try {
            PreparedStatement ps = conexao.getConn().prepareStatement("SELECT * FROM rota WHERE id=?");

            ps.setInt(1, rota.getId());
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
