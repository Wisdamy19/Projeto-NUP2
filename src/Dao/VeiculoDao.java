package Dao;

import JBDC.Conexao;
import Model.Veiculo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VeiculoDao {
    private Conexao conexao;
    private PreparedStatement ps;



    public VeiculoDao() {
        conexao = new Conexao();
    }

    public ResultSet listar(){
        try {
            return conexao.getConn().createStatement().executeQuery("SELECT * FROM veiculo");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void inserir(Veiculo veiculo){
        try {
            String SQL = "INSERT INTO veiculo(nome, motorista, placa, capacidade, rota, status)" +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, veiculo.getNome());
            ps.setString(2, veiculo.getMotorista());
            ps.setString(3, veiculo.getPlaca());
            ps.setDouble(4, veiculo.getCapacidade());
            ps.setString(5, veiculo.getRota());
            ps.setString(6, veiculo.getStatus());


            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void excluir(Veiculo veiculo){
        try {
            String SQL = "DELETE FROM veiculo WHERE id = ?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setInt(1, veiculo.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void editar(Veiculo veiculo){
        try {
            String SQL = "UPDATE veiculo SET nome=?, motorista=?, placa=?, capacidade=?, rota=?, status=? WHERE id=?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, veiculo.getNome());
            ps.setString(2, veiculo.getMotorista());
            ps.setString(3, veiculo.getPlaca());
            ps.setDouble(4, veiculo.getCapacidade());
            ps.setString(5, veiculo.getRota());
            ps.setString(6, veiculo.getStatus());
            ps.setInt(7, veiculo.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public ResultSet listarId(Veiculo veiculo){
        try {
            PreparedStatement ps = conexao.getConn().prepareStatement("SELECT * FROM veiculo WHERE id=?");

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
