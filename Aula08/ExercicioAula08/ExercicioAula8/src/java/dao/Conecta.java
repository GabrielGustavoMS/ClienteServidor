/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hight
 */
public class Conecta {
    /***
     * Método getConexao()
     * Devolver conexão com o banco de dados.
     * @return con
     */
    public static Connection getConexao() throws ClassNotFoundException, SQLException{
        Connection con = null;
        //Configura servidor de Banco de Dados e nome do Banco.
        String serverName = "localhost";
        String myDataBase = "produtos";
        
        //Login e senha do banco
        String username = "root";
        String password = "root";
        
        //Carregando JDBC Driver 
        String driverName = "com.mysql.jdbc.Driver";//Caminho de pacotes para o arquivo jar
        Class.forName(driverName);
        
        //Criando a conexão com o banco de dados
        String url = "jdbc:mysql://"+serverName + "/"+myDataBase+"?characterEncoding=UTF-8";//A JDBC url
        con = DriverManager.getConnection(url,username,password);
        return con;
    }
}
