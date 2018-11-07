/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAlpooLivrariaDAO;

import TrabalhoAlpooLivraria.Codigo.Incluir;
import TrabalhoAlpooLivraria.Codigo.Livro;
import TrabalhoAlpooLivraria.Telas.TelaExcluir;
import TrabalhoAlpooLivraria.Telas.TelaIncluir;
import TrabalhoAlpooLivraria.Telas.TelaPesquisar;
import TrabalhoAlpooLivrariaJDBC.FabricaConexao;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author viniciusfa
 */
public class QueriesDao {
    //declarando variavel da interace Connection
    private Connection conecta;
     Livro l = new Livro();
    
    //construtor
    public QueriesDao(){
        this.conecta = new FabricaConexao().Conexao();
    }
    
    public void  listarLivro(DefaultTableModel modelo){
        modelo.setNumRows(0);
        
        
    }
   
    
    
    public void cadastrarLivro(Incluir obj) throws SQLException{
        try{
        
        //1-criar o comando sql
        String sql = "insert into livro (isbn,titulo,autor,editora,preco )values(?,?,?,?,?)";
        
        //2- organizar e executar o comando sql
        PreparedStatement stmt  = conecta.prepareStatement(sql);
        
        //setando os campos conforme a sua ordem no bd
        stmt.setInt(1, obj.getIsbn());
        stmt.setString(2, obj.getTitulo());
        stmt.setString(3, obj.getAutor());
        stmt.setString(4, obj.getEditora());
        stmt.setFloat(5, obj.getPreco());
        
        //3- executar a query
        stmt.execute();
        
        //4-fechando a conexao
        stmt.close();
        
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
                
    }
    
    public void alterarLivro(Livro l) throws SQLException{
        Connection con = null;
        FabricaConexao f = new FabricaConexao();
        con = f.Conexao(); 
        
        try{
            
        //1-criar o comando sql
        String sql = "update livro set (titulo,autor,editora,preco) = "
                + "(?,?,?,?) where isbn = "+ l.getIsbn()+";";
            System.err.println(sql);
   
        
        //2-organizar e executar o comando sql
        PreparedStatement prep = conecta.prepareStatement(sql);
        
        
            prep.setString(1, l.getTitulo());
            prep.setString(2,l.getAutor());
            prep.setString(3, l.getEditora());
            prep.setDouble(4, l.getPreco());
        
        prep.executeUpdate();
        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
       
        }catch(SQLException e){
           System.err.println("Erro ao alterar o livro. " + e.getMessage());
            e.printStackTrace();
        }
        
        conecta.close();
    }
    
    public void excluirLivro(Livro l) throws SQLException{
        Connection con =null;
        FabricaConexao f = new FabricaConexao();
        con = f.Conexao();
  try{
            //1-criar o comando sql que deleterará direto do bd
            String sql = "delete from livro where isbn = ?";
            
            
            //2-Criar o preparedStatement
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,l.getIsbn());
            //Executa o PreparedStatement
            ps.execute();
            
            //mensagem se excluido com sucesso
            JOptionPane.showMessageDialog(null,"Livro removido com sucesso!");
            }catch(SQLException e){
                //mensagem se nao conseguir excluir
                System.err.println("Erro na hora de excluir." + e.getMessage());
                e.printStackTrace();
            }
            //fecha a conexão
            f.fechaConexao(con);    
    }
    

}
