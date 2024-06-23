package Service;


import Dao.EncomendaDao;

import Model.Encomenda;

import java.sql.ResultSet;

public class EncomendaService {
    private EncomendaDao encomendaDao;
    public EncomendaService(){
        encomendaDao = new EncomendaDao();
    }

    public ResultSet listar(){
        return encomendaDao.listar();
    }
    public boolean inserir(Encomenda encomenda){
        if (encomenda.getNome() == "" || encomenda.getRemetente() == "" || encomenda.getDestinatario() == "" || encomenda.getEndereco() == "" || encomenda.getPeso() == 0)
            return false;
        encomendaDao.inserir(encomenda);
        return true;
    }

    public boolean excluir(Encomenda encomenda){
        if (encomenda.getId() == 0)
            return false;

        encomendaDao.excluir(encomenda);
        return true;
    }

    public boolean editar(Encomenda encomenda){
        if (encomenda.getNome() == "" || encomenda.getRemetente() == "" || encomenda.getDestinatario() == "" || encomenda.getEndereco() == "" || encomenda.getPeso() == 0)
            return false;

        encomendaDao.editar(encomenda);
        return true;
    }
}
