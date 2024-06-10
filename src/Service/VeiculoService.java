package Service;

import Dao.VeiculoDao;

import Model.Veiculo;

import java.sql.ResultSet;

public class VeiculoService {
    private VeiculoDao veiculoDao;
    public VeiculoService(){
        veiculoDao = new VeiculoDao();
    }
    public ResultSet listar(){
        return veiculoDao.listar();
    }
    public boolean inserir(Veiculo veiculo){
        if (veiculo.getMotorista() == "" || veiculo.getPlaca() == "" || veiculo.getCapacidade() == 0 || veiculo.getRota() == "")
            return false;

        veiculoDao.inserir(veiculo);
        return true;
    }

    public boolean excluir(Veiculo veiculo){
        if (veiculo.getId() == 0)
            return false;

        veiculoDao.excluir(veiculo);
        return true;
    }

    public boolean editar(Veiculo veiculo){
        if (veiculo.getMotorista() == "" || veiculo.getPlaca() == "" || veiculo.getCapacidade() == 0 || veiculo.getRota() == "")
            return false;

        veiculoDao.editar(veiculo);
        return true;
    }
}
