package Dao;

import JBDC.Conexao;

import Model.Funcionario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDao {
    private Conexao conexao;
    private PreparedStatement ps;

    public FuncionarioDao(){
        conexao = new Conexao();
    }

    public ResultSet listar(){
        try {
            return conexao.getConn().createStatement().executeQuery("SELECT * FROM funcionario");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void inserir(Funcionario funcionario){
        try {
            String SQL = "INSERT INTO funcionario(nome, cargo, CPF, salario, status)" +
                    "VALUES (?, ?, ?, ?, ?)";
            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCargo());
            ps.setString(3, funcionario.getCPF());
            ps.setDouble(4, funcionario.getSalario());
            ps.setString(3, funcionario.getStatus());


            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void excluir(Funcionario funcionario){
        try {
            String SQL = "DELETE FROM funcionario WHERE id = ?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setInt(1, funcionario.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void editar(Funcionario funcionario){
        try {
            String SQL = "UPDATE funcionario SET nome=?, cargo=?, CPF=?, salario=?, status=? WHERE id=?";

            ps = conexao.getConn().prepareStatement(SQL);

            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCargo());
            ps.setString(3, funcionario.getCPF());
            ps.setDouble(4, funcionario.getSalario());
            ps.setString(3, funcionario.getStatus());
            ps.setInt(5, funcionario.getId());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }


}
