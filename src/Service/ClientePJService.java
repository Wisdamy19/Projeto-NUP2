package Service;

import Dao.ClientePJDao;
import Model.ClientePJ;

import java.sql.ResultSet;

public class ClientePJService {
    private ClientePJDao clientePJDao;
    public ClientePJService(){
        clientePJDao = new ClientePJDao();
    }

    public ResultSet listar(){
        return clientePJDao.listar();
    }
    public boolean inserir(ClientePJ clientePJ){
        if (clientePJ.getNome() == "" || clientePJ.getTelefone() == "" || clientePJ.getEndereco() == "" || clientePJ.getCNPJ() == "")
            return false;
        if (clientePJ.getCNPJ().length() != 14){
            return false;
        }
        clientePJDao.inserir(clientePJ);
        return true;
    }

    public boolean excluir(ClientePJ clientePJ){
        if (clientePJ.getId() == 0)
            return false;

        clientePJDao.excluir(clientePJ);
        return true;
    }

    public boolean editar(ClientePJ clientePJ){
        if (clientePJ.getNome() == "" || clientePJ.getTelefone() == "" || clientePJ.getEndereco().toString() == "" || clientePJ.getCNPJ() == "")
            return false;

        clientePJDao.editar(clientePJ);
        return true;
    }


}
