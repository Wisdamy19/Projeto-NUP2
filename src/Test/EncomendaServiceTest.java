package Test;

import Dao.EncomendaDao;
import Model.Encomenda;
import Model.Veiculo;
import Service.EncomendaService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EncomendaServiceTest {
    private EncomendaDao encomendaDao;
    private EncomendaService encomendaService;
    @Before
    public void EncomendaService(){
        encomendaDao = new EncomendaDao();
        encomendaService = new EncomendaService();
    }
    @Test
    public void listarTest(){
        ResultSet rs = encomendaService.listar();
        Assert.assertNotNull(rs);
    }
    @Test
    public void inserirTest(){
        Encomenda encomenda = new Encomenda();
        Veiculo veiculo = new Veiculo();
        veiculo.setId(3);
        encomenda.setNome("Nootbook");
        encomenda.setRemetente("Charles");
        encomenda.setDestinatario("Emanuel");
        encomenda.setEndereco("Rua dos bobos, numero 0");
        encomenda.setPeso(10.0);
        encomenda.setVeiculo(veiculo);
        Assert.assertTrue(encomendaService.inserir(encomenda));
    }
    @Test
    public void inserirEncomendaInvalidaTest(){
        Encomenda encomenda = new Encomenda();
        Veiculo veiculo = new Veiculo();
        veiculo.setId(3);
        encomenda.setNome("");
        encomenda.setRemetente("");
        encomenda.setDestinatario("");
        encomenda.setEndereco("");
        encomenda.setPeso(0);
        encomenda.setVeiculo(veiculo);

        Assert.assertFalse(encomendaService.inserir(encomenda));
    }

    @Test
    public void excluirTest(){
        Encomenda encomenda = new Encomenda();
        encomenda.setId(1);
        Assert.assertTrue(encomendaService.excluir(encomenda));
    }

    @Test
    public void listarPesoEncomendaTest(){
        Veiculo veiculo = new Veiculo();
        veiculo.setId(3);
        double peso = encomendaService.listarPesoEncomendas(veiculo);
        Assert.assertEquals(1260.0, peso, 1);
    }
    @Test
    public void verificarCapacidadeVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setId(3);
        veiculo.setCapacidade(1000.0);
        boolean test = encomendaService.verificarCapacidadeVeiculo(veiculo);

        Assert.assertFalse(test);
    }

}
