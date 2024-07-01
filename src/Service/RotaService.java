package Service;


import Dao.RotaDao;

import Dao.VeiculoDao;
import Model.Rota;
import Model.Veiculo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RotaService {
    private RotaDao rotaDao;
    public RotaService(){
        rotaDao = new RotaDao();
    }

    public ResultSet listar(){
        return rotaDao.listar();
    }
    public boolean inserir(Rota rota){
        if (rota.getDestino() == "" || rota.getStatus() == "")
            return false;
        rotaDao.inserir(rota);
        return true;
    }
    public boolean excluir(Rota rota){
        if (rota.getId() == 0)
            return false;

        rotaDao.excluir(rota);
        return true;
    }
    public boolean editar(Rota rota){
        if (rota.getDestino() == "" || rota.getStatus() == "")
            return false;

        rotaDao.editar(rota);
        return true;
    }

    public ResultSet listarId(Rota rota){
        return rotaDao.listarId(rota);
    }
    public ResultSet listarRotaVeiculo(Veiculo veiculo){
        return rotaDao.listarRotaVeiculo(veiculo);
    }




}
