package Service;


import Dao.EncomendaDao;

import Model.Encomenda;
import Model.Veiculo;

import java.sql.ResultSet;
import java.sql.SQLException;

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
    public double listarPesoEncomendas(Veiculo veiculo){
        return encomendaDao.listarPesoEncomendas(veiculo);
    }

    public boolean verificarCapacidadeVeiculo(Veiculo veiculo) {
        double rs = encomendaDao.listarPesoEncomendas(veiculo);
        double totalPeso = rs;
        double capacidade = veiculo.getCapacidade();
        int id = veiculo.getId();
            if (totalPeso > veiculo.getCapacidade()) {
                System.out.println("O Veiculo de id " + id + ", tem o peso das encomendas " + totalPeso + " maior que a capacidade " + capacidade);
                return false;
            } else {
                System.out.println("Peso dentro do limite da capacidade.");
            }

        return true;
    }





}
