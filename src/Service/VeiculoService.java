package Service;

import Dao.RotaDao;
import Dao.VeiculoDao;

import Model.Veiculo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VeiculoService {
    private VeiculoDao veiculoDao;
    private RotaDao rotaDao;
    public VeiculoService(){
        veiculoDao = new VeiculoDao();
    }
    public ResultSet listar(){
        return veiculoDao.listar();
    }
    public boolean inserir(Veiculo veiculo){
        if (veiculo.getNome() == "" || veiculo.getMotorista() == "" || veiculo.getPlaca() == "" || veiculo.getCapacidade() == 0 || veiculo.getRota() == "")
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

    public ResultSet listarId(Veiculo veiculo){
        return veiculoDao.listarId(veiculo);
    }








}
