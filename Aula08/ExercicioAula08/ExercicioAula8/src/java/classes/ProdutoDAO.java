/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import dao.Conecta;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hight
 */
public class ProdutoDAO {
    public String cadastrarProduto(Produto produto){
        String resp = "";
        try {
           Connection con = Conecta.getConexao();
           //Montando o comando de insercao
           String sql = "INSERT INTO "
                        +"produtos(nome,descricao,qtde_estoque,valor,fabricante)"
                        + "VALUES(?,?,?,?,?)";
           
            //DECLARAÇÃO preparada
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,this.ISO88591ToUTF8(produto.getNome()) );
            ps.setString(2, this.ISO88591ToUTF8(produto.getDescricao()));
            ps.setInt(3, produto.getQtde_estoque());
            ps.setFloat(4,produto.getValor());
            ps.setString(5,this.ISO88591ToUTF8(produto.getFabricante()));
            
            ps.execute();
            ps.close();
            
            resp = "OK";
        } catch (Exception e) {
            resp = "ERRO" + e.toString();
            System.out.println(resp);
        }
        return resp;
        
    }
    public String excluirProduto(Produto produto){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "DELETE FROM produtos WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, produto.getId());
            
            ps.execute();
            
            ps.close();
            con.close();
            
            resp = "OK";
            
        }catch(Exception e){
            resp = "ERRO: "+e.toString();
            System.out.println(resp);
        }
        return resp;
    }
    public Produto procurarPrdutos(int id){
        Produto produto = new Produto();
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM dados WHERE id='"+id+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next()){
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtde_estoque(rs.getInt("qtde_estoque"));
                produto.setValor(rs.getFloat("valor"));
                produto.setFabricante(rs.getString("fabricante"));
            }else{
                produto.setId(-1);
                produto.setNome("Produto não encontrado");
                produto.setDescricao("");
                produto.setQtde_estoque(-1);
                produto.setValor(-1);
                produto.setFabricante("");
            }
            rs.close();
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return produto;
        
    }
     public ArrayList<Produto> listarProdutos(){
        ArrayList<Produto> lista = new ArrayList<>();
        try{
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM produtos ORDER BY nome";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtde_estoque(rs.getInt("qtde_estoque"));
                produto.setValor(rs.getFloat("valor"));
                produto.setFabricante(rs.getString("fabricante"));
                
                lista.add(produto);
            }
            
            rs.close();
            stmt.close();
            con.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
        
    }
     public  String ISO88591ToUTF8 (String original){
         String converted = "não foi possível converter";
        try {
            converted = new String(original.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return converted;
     }
}
