package Test;

import Dao.RotaDao;
import Model.Rota;
import Model.Veiculo;
import Service.RotaService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.junit.Assert.*;
public class RotaServiceTest {
    private RotaDao rotaDao;
    private RotaService rotaService;


    @Before
    public void RotaService(){
        rotaDao = new RotaDao();
        rotaService = new RotaService();
    }

    @Test
    public void listarTest(){
        ResultSet rs = rotaService.listar();
        Assert.assertNotNull(rs);
    }
    @Test
    public void inserirTest(){
        Rota rota = new Rota();
        Veiculo veiculo = new Veiculo();
        veiculo.setId(4);
        rota.setDestino("Jaraguaias");
        rota.setDataPartida(LocalDateTime.of(2024, 6, 12, 9, 0, 0));
        rota.setDataChegada(LocalDateTime.of(2024, 6, 12, 9, 0, 0));
        rota.setStatus("Finalizada");
        rota.setVeiculo(veiculo);

        Assert.assertTrue(rotaService.inserir(rota));

    }
    @Test
    public void listarRotaVeiculoTest()  {
        Veiculo veiculo = new Veiculo();
        ResultSet rs = rotaDao.listarRotaVeiculo(veiculo);
        Assert.assertNotNull(rs);
    }
}