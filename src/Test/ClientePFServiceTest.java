package Test;

import Dao.ClientePFDao;
import Model.ClientePF;
import Service.ClientePFService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;

public class ClientePFServiceTest {
    private ClientePFDao clientePFDao;

    private ClientePFService clientePFService;


    @Before
    public void setUp(){
        clientePFService = new ClientePFService();
    }

    @Test
    public void listarTest() throws SQLException {
        ResultSet rs = clientePFService.listar();
        rs.next();
        String nome = rs.getString("Nome");
        String telefone = rs.getString("Telefone");
        String endereco = rs.getString("Endereco");
        String CPF = rs.getString("CPF");

        Assert.assertEquals("Aryele Suane da Silva", nome);
        Assert.assertEquals("81 9999-9999", telefone);
        Assert.assertEquals("Belo Jardim", endereco);
        Assert.assertEquals("12345678901", CPF);
    }
    @Test
    public void inserirTest(){




    }


}
