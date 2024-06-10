package Service;

import Dao.EncomendaDao;
import Dao.RotaDao;
import Model.Encomenda;
import Model.Rota;

import java.sql.ResultSet;

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
        if (rota.getDestino() == ""  || rota.getStatus() == "")
            return false;

        rotaDao.editar(rota);
        return true;
    }
}
