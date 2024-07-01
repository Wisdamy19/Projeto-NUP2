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
    public ResultSet listarPesoEncomendas(Veiculo veiculo){
        return encomendaDao.listarPesoEncomendas(veiculo);
    }
    public void verificarCapacidadeVeiculo(Veiculo veiculo) throws SQLException {
        ResultSet rs = encomendaDao.listarPesoEncomendas(veiculo);
        if (rs.next()) {
            double totalPeso = rs.getDouble("total_peso");
            double capacidade = veiculo.getCapacidade();
            if (totalPeso >= veiculo.getCapacidade()) {
                System.out.println("O peso das encomendas listadas " + totalPeso + " é maior que a capacidade " + capacidade);
            } else {
                System.out.println("Tudo certo");
            }
        }
    }

}
