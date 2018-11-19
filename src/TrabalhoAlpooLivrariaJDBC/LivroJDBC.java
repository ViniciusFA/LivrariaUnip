/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAlpooLivrariaJDBC;

import TrabalhoAlpooLivraria.Codigo.Incluir;
import TrabalhoAlpooLivraria.Codigo.Livro;
import TrabalhoAlpooLivrariaDAO.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author viniciusfa
 */
public class LivroJDBC implements Dao{
    //dados para a conexão com o banco de dados
    private static final String user="root";
    private static final String password="root";
    private static final String DataBase ="livraria";
    private static final String url="jdbc:postgresql://localhost:5432/";
    
    public  Connection Conexao() {
        Connection con = null;
        try{
            con = DriverManager.getConnection(url+DataBase,user,password);
              //JOptionPane.showMessageDialog(null,"Conectado com sucesso!");
            return con;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    
    
    public void fechaConexao(Connection con){
        
        try{
            if(con != null){
                con.close();
                System.out.println("Fechada a conexão com o Banco de dados.");
           
        } }catch(Exception e){
                    System.out.println("Não foi possível fechar a conexão com o banco de dados "+
                            e.getMessage());
                    }
            }
    public  void fechaConexao(Connection con,PreparedStatement stmt){
        try{
            if(con!=null){
                fechaConexao(con);
            }
        }catch(Exception e){
            System.out.println("Não foi possível fechar o statement" + e.getMessage());
        }
    }
    
    public void fechaConexao(Connection con,PreparedStatement stmt,ResultSet rs){
        try{
           if(con!=null || stmt !=null){
               fechaConexao(con,stmt);
           } 
           if(rs != null){
               rs.close();
               System.out.println("ResultSet fechado com sucesso.");
           }
        }catch(Exception e){
            System.out.println("Não foi possível fechar o ResultSet " + e.getMessage());
        }
    }

   

    @Override
    public void cadastrarLivro(Livro l) {
        System.out.println("O livro com o isbn"  + l.getIsbn() + " já foi cadastrado.");
        }

    @Override
    public void alterarLivro(Livro l) {
        System.out.println("O livro com o isbn"  + l.getIsbn() + " já foi alterado.");
        
    }

    @Override
    public void excluirLivro(Livro l) {
        System.out.println("O livro com o isbn"  + l.getIsbn() + " já foi excluido.");
    }

    @Override
    public ArrayList listarLivro(Livro l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList buscarTitulo(Livro l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList buscarNomeAutor(Livro l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList buscarSobrenomeAutor(Livro l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public ArrayList buscarNomeEdit(Livro l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
