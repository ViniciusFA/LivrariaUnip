/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, c
hoose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAlpooLivrariaDAO;
import TrabalhoAlpooLivraria.Codigo.Incluir;
import TrabalhoAlpooLivraria.Codigo.Livro;
import VIEW.TelaBuscar;
import TrabalhoAlpooLivrariaJDBC.LivroJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LivroDao implements Dao{
             int isbn ;
            String titulo;
            String autor;
            String editora;
            float preco;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Connection getConecta() {
        return conecta;
    }

    public void setConecta(Connection conecta) {
        this.conecta = conecta;
    }

    public Livro getL() {
        return l;
    }

    public void setL(Livro l) {
        this.l = l;
    }
    //declarando variavel da interace Connection
    private Connection conecta;
     Livro l = new Livro();
    
    //construtor
    public LivroDao(){
        this.conecta = new LivroJDBC().Conexao();
    }
    
    @Override
    public ArrayList <LivroDao> listarLivro(Livro l){
        
     ArrayList<LivroDao> livros = new ArrayList<>();
     conecta = new LivroJDBC().Conexao();
     try{
         String sql = "select * from livro;";
         PreparedStatement pStmt = conecta.prepareStatement(sql);
         ResultSet rs = pStmt.executeQuery();
        while(rs.next()){
            LivroDao L = new LivroDao();
            L.setIsbn(rs.getInt("isbn"));
            L.setTitulo(rs.getString("titulo"));
            L.setAutor(rs.getString("autor"));
            L.setEditora(rs.getString("editora"));
            L.setPreco(rs.getFloat("preco"));
            livros.add(L);
        }
        rs.close();
        pStmt.close();
        return livros;
        
        
     }catch(SQLException e){
         throw  new RuntimeException(e);
     }
    }
    
    @Override
    public ArrayList<LivroDao> buscarTitulo(Livro l){
        
        ArrayList<LivroDao> livros = new ArrayList<>();
        TelaBuscar tb = new TelaBuscar();
        
        conecta = new LivroJDBC().Conexao();
        
        try{
            String sql = "select * from livro where titulo = "   ;
            PreparedStatement prep = conecta.prepareStatement(sql);
            ResultSet rs = prep.executeQuery();
            while(rs.next()){
                LivroDao L = new LivroDao();
                L.setIsbn(rs.getInt("isbn"));
                L.setTitulo(rs.getString("titulo"));
                L.setAutor(rs.getString("autor"));
                L.setEditora(rs.getString("editora"));
                L.setPreco(rs.getFloat("preco"));
                livros.add(L);
            }
            rs.close();
            prep.close();
            return livros;
                    
        }catch(SQLException e){
            throw new RuntimeException();
       }
        
        
    }
    
    @Override
    public ArrayList<LivroDao> buscarNomeAutor(Livro l){
    
         ArrayList<LivroDao> livros = new ArrayList<>();
        TelaBuscar tb = new TelaBuscar();
        
        conecta = new LivroJDBC().Conexao();
        
        try{
            String sql = "select * from livro where titulo = "   ;
            PreparedStatement prep = conecta.prepareStatement(sql);
            ResultSet rs = prep.executeQuery();
            while(rs.next()){
                LivroDao L = new LivroDao();
                L.setIsbn(rs.getInt("isbn"));
                L.setTitulo(rs.getString("titulo"));
                L.setAutor(rs.getString("autor"));
                L.setEditora(rs.getString("editora"));
                L.setPreco(rs.getFloat("preco"));
                livros.add(L);
            }
            rs.close();
            prep.close();
            return livros;
                    
        }catch(SQLException e){
            throw new RuntimeException();
       }
        
    }
    
    @Override
    public ArrayList<LivroDao> buscarSobrenomeAutor(Livro l){
         ArrayList<LivroDao> livros = new ArrayList<>();
        TelaBuscar tb = new TelaBuscar();
        
        conecta = new LivroJDBC().Conexao();
        
        try{
            String sql = "select * from livro where titulo = "   ;
            PreparedStatement prep = conecta.prepareStatement(sql);
            ResultSet rs = prep.executeQuery();
            while(rs.next()){
                LivroDao L = new LivroDao();
                L.setIsbn(rs.getInt("isbn"));
                L.setTitulo(rs.getString("titulo"));
                L.setAutor(rs.getString("autor"));
                L.setEditora(rs.getString("editora"));
                L.setPreco(rs.getFloat("preco"));
                livros.add(L);
            }
            rs.close();
            prep.close();
            return livros;
                    
        }catch(SQLException e){
            throw new RuntimeException();
       }
    }
    
    @Override
    public ArrayList<LivroDao> buscarNomeEdit(Livro l){
         ArrayList<LivroDao> livros = new ArrayList<>();
        TelaBuscar tb = new TelaBuscar();
        
        conecta = new LivroJDBC().Conexao();
        
        try{
            String sql = "select * from livro where titulo = "   ;
            PreparedStatement prep = conecta.prepareStatement(sql);
            ResultSet rs = prep.executeQuery();
            while(rs.next()){
                LivroDao L = new LivroDao();
                L.setIsbn(rs.getInt("isbn"));
                L.setTitulo(rs.getString("titulo"));
                L.setAutor(rs.getString("autor"));
                L.setEditora(rs.getString("editora"));
                L.setPreco(rs.getFloat("preco"));
                livros.add(L);
            }
            rs.close();
            prep.close();
            return livros;
                    
        }catch(SQLException e){
            throw new RuntimeException();
       }
    }
    
    @Override
    public void cadastrarLivro(Livro l) {
        try{
        
        //1-criar o comando sql
        String sql = "insert into livro (isbn,titulo,autor,editora,preco )values(?,?,?,?,?)";
        
        //2- organizar e executar o comando sql
        PreparedStatement stmt  = conecta.prepareStatement(sql);
        
        //setando os campos conforme a sua ordem no bd
        stmt.setInt(1, l.getIsbn());
        stmt.setString(2, l.getTitulo());
        stmt.setString(3, l.getAutor());
        stmt.setString(4, l.getEditora());
        stmt.setDouble(5, l.getPreco());
        
        //3- executar a query
        stmt.execute();
        
        //4-fechando a conexao
        stmt.close();
        
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
                
    }
    
    @Override
    public void alterarLivro(Livro l) {
        Connection con = null;
        LivroJDBC f = new LivroJDBC();
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
        
                 try {
                     conecta.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(LivroDao.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }
    
    @Override
    public void excluirLivro(Livro l){
        Connection con =null;
        LivroJDBC f = new LivroJDBC();
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

   
    
    

