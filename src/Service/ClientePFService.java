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
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public boolean inserir(ClientePF clientePF){
        if (clientePF.getNome() == "" || clientePF.getTelefone() == "" || clientePF.getEndereco() == "" || clientePF.getCPF() == "") {
            System.out.println(RED + "Insira o CPF.");
            return false;
        }
        if (clientePF.getCPF().length() != 11){
            System.out.println(RED + "Insira um CPF com apenas os 11 dígitos.");
           return false;
        }
        String cpf = clientePF.getCPF();
        if (cpf.contains(".") || cpf.contains("-")){
            System.out.println(RED + "Insira apenas numeros");
            return false;
        }

        clientePFDao.inserir(clientePF);
        System.out.println(GREEN + "Cliente inserido com sucesso.");
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
