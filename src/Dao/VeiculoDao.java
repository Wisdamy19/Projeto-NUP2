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
            String SQL = "INSERT INTO veiculo(motorista, placa, capacidade, rota)" +
                    "VALUES (?, ?, ?, ?)";
            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, veiculo.getMotorista());
            ps.setString(2, veiculo.getPlaca());
            ps.setDouble(3, veiculo.getCapacidade());
            ps.setString(4, veiculo.getRota());

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
            String SQL = "UPDATE veiculo SET motorista=?, placa=?, capacidade=?, rota=? WHERE id=?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, veiculo.getMotorista());
            ps.setString(2, veiculo.getPlaca());
            ps.setDouble(3, veiculo.getCapacidade());
            ps.setString(4, veiculo.getRota());
            ps.setInt(5, veiculo.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
