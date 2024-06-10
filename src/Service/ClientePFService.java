package Service;

import Dao.ClientePFDao;
import Model.ClientePF;

import java.sql.ResultSet;

public class ClientePFService {
    private ClientePFDao clientePFDao;

    public ClientePFService(){
        clientePFDao = new ClientePFDao();
    }


    public ResultSet listar(){
        return clientePFDao.listar();
    }
    public boolean inserir(ClientePF clientePF){
        if (clientePF.getNome() == "" || clientePF.getTelefone() == "" || clientePF.getEndereco() == "" || clientePF.getCPF() == "")
            return false;
        if (clientePF.getCPF().length() < 11 || clientePF.getCPF().length() > 11){
            return false;
        }

        clientePFDao.inserir(clientePF);
        return true;
    }

    public boolean excluir(ClientePF clientePF){
        if (clientePF.getId() == 0)
            return false;

        clientePFDao.excluir(clientePF);
        return true;
    }

    public boolean editar(ClientePF clientePF){
        if (clientePF.getNome() == "" || clientePF.getTelefone() == "" || clientePF.getEndereco() == "" || clientePF.getCPF() == "")
            return false;

        clientePFDao.editar(clientePF);
        return true;
    }





}
