/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAlpooLivraria.Telas;

import TrabalhoAlpooLivrariaDAO.QueriesDao;
import TrabalhoAlpooLivrariaJDBC.FabricaConexao;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author viniciusfa
 */
public class TelaPesquisar extends JFrame implements ActionListener{
    private JButton btnPesquisar,btnVoltar;
    private JTextField texto;
    private JTable tabela;
    private int incCod=0;
    private Connection conecta;
    
    public TelaPesquisar(){
        setTitle("Tabela");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       
      
        Container P = getContentPane();
        P.setLayout(new BorderLayout());
        
         
         
        /*tabela.setModel(new DefaultTableModel(new Object [][]{},new String[]{
          //  "isbn","título","editora","autor","preço"}));
        
        //define largura das colunas,permitindo ou nao ajustar a largura
        tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(1).setResizable(true);*/
    
        JScrollPane rolagemTabela = new JScrollPane(tabela);
        P.add(rolagemTabela,"Center");
        
        //criação do painel de baixo
        JPanel PanelSouth = new JPanel();
        texto = new JTextField("Nome selecionado");
        PanelSouth.add(texto);
        btnPesquisar = new JButton("Pesquisar");
        PanelSouth.add(btnPesquisar);
        btnVoltar = new JButton("Voltar");
        PanelSouth.add(btnVoltar);
        P.add(PanelSouth,"South");
        btnPesquisar.addActionListener(this);
        btnVoltar.addActionListener(this);
        
        
        
        setSize(441,300);
        setLocation(100,50);
        setVisible(true);
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        Object origem = e.getSource();
        try{
             if(origem == btnPesquisar){
              
                 DefaultTableModel modelo = new DefaultTableModel(null,
                    new String[]{"isbn", "titulo", "editora", "autor","preco"});
                 
            String sql="select * from livraria" ;
            Statement st = conecta.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String dados[] = new String[5];
                dados[0] = rs.getString("isbn");
                dados[1] = rs.getString("titulo");
                dados[2] = rs.getString("autor");
                dados[3] = rs.getString("editora");
                dados[4] = rs.getString("preco");
              tabela.setModel(modelo);
            }
                         
            
            
            /*texto.setText(tabela.getValueAt(tabela.getSelectedRow(), 
                    tabela.getSelectedColumn()).toString());*/
        }else if(origem == btnVoltar){
            TelaMenuPrincipal tmp = new TelaMenuPrincipal();
            dispose();
        }
        }catch(RuntimeException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPesquisar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public static void main(String [] args){
        TelaPesquisar t = new TelaPesquisar();
        t.setVisible(true);
   } 
}
