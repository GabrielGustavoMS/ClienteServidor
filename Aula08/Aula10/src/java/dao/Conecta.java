 package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {

    public static Connection getConexao() throws Exception {

        Connection con = null;
        //Configura servidor de Banco de Dados e nome do Banco
        String serverName = "localhost";
        String mydatabase = "alunos";

        //Login e senha do banco
        String username = "root";
        String password = "root";

        //Carregando o JDBC Driver
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);

        // Criando a conex�o com o Banco de Dados
        
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase; // a JDBC url
        con = DriverManager.getConnection(url, username, password);

        return con;
    }
}

