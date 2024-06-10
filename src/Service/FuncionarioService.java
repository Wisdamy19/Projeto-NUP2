package Service;

import Dao.FuncionarioDao;
import Model.Encomenda;
import Model.Funcionario;

import java.sql.ResultSet;

public class FuncionarioService {
    private FuncionarioDao funcionarioDao;
    public FuncionarioService(){
        funcionarioDao = new FuncionarioDao();
    }
    public ResultSet listar(){
        return funcionarioDao.listar();
    }
    public boolean inserir(Funcionario funcionario){
        if (funcionario.getNome() == "" || funcionario.getCargo() == "" || funcionario.getCPF() == "" || funcionario.getSalario() == 0 || funcionario.getStatus() == "")
            return false;
        funcionarioDao.inserir(funcionario);
        return true;
    }
    public boolean excluir(Funcionario funcionario){
        if (funcionario.getId() == 0)
            return false;

        funcionarioDao.excluir(funcionario);
        return true;
    }
    public boolean editar(Funcionario funcionario){
        if (funcionario.getNome() == "" || funcionario.getCargo() == "" || funcionario.getCPF() == "" || funcionario.getSalario() == 0 || funcionario.getStatus() == "")
            return false;

        funcionarioDao.editar(funcionario);
        return true;
    }
}
