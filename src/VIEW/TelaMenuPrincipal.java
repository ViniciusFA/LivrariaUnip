/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import TrabalhoAlpooLivrariaJDBC.LivroJDBC;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.*;

/**
 *
 * @author viniciusfa
 */
public class TelaMenuPrincipal extends JFrame implements ActionListener{

    private JMenuBar barraMenu;
    private JMenu menuArquivo,menuEditar,menuAjuda;
    private JMenuItem menuItemListar,menuItemSair,menuItemAlterar,menuItemSobre,menuItemBuscar;
    private JPanel painelSuperior,painelCentral,painelInferior;
     private JMenuItem menuItemIncluir,menuItemExcluir;

    public TelaMenuPrincipal() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        barraMenu = new JMenuBar();
        menuAjuda = new JMenu("Ajuda");
        menuArquivo = new JMenu("Arquivo");
        menuEditar = new JMenu("Editar");
        menuItemListar = new JMenuItem("Listar");
        menuItemAlterar = new JMenuItem("Alterar");
        menuItemSair = new JMenuItem("Sair");
        menuItemSobre = new JMenuItem("Sobre");
        painelSuperior = new JPanel();
        painelCentral = new JPanel();
        painelInferior = new JPanel();
        menuItemIncluir = new JMenuItem("Incluir");
        menuItemExcluir = new JMenuItem("Excluir");
        menuItemBuscar = new JMenuItem("Buscar");
        
        setLayout(new BorderLayout());
                
        barraMenu.setBackground(Color.LIGHT_GRAY);
        painelCentral.setBackground(Color.WHITE);
        
        
        barraMenu.add(menuArquivo);
        barraMenu.add(menuEditar);
        barraMenu.add(menuAjuda);
        menuArquivo.add(menuItemListar);
        menuArquivo.add(menuItemSair);
        menuEditar.add(menuItemAlterar);
        menuEditar.add(menuItemIncluir);
        menuEditar.add(menuItemExcluir);
        menuEditar.add(menuItemBuscar);
        menuAjuda.add(menuItemSobre);
        painelSuperior.add(barraMenu);
        
        add(painelSuperior,BorderLayout.NORTH);
        add(painelCentral,BorderLayout.CENTER);
        add(painelInferior,BorderLayout.SOUTH);
        
        menuItemListar.addActionListener(this);
        menuItemAlterar.addActionListener(this);
        menuItemIncluir.addActionListener(this);
        menuItemExcluir.addActionListener(this);
        menuItemSair.addActionListener(this);
        menuItemSobre.addActionListener(this);
        menuItemBuscar.addActionListener(this);
        
        setSize(600,300);
        setVisible(true);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==menuItemSair){
           System.exit(0);
           
        }else if(e.getSource()==menuItemListar){
            TelaListar tl = new TelaListar();
            dispose();
        }else if(e.getSource()==menuItemAlterar){
            TelaAlterar talt=new TelaAlterar();
            dispose();
        }else if(e.getSource()==menuItemIncluir){
            TelaCadastrar tinclui = new TelaCadastrar();
            dispose();
        }else if(e.getSource() ==menuItemExcluir){
            TelaExcluir texclui = new TelaExcluir();
        }else if(e.getSource()==menuItemSobre){
            TelaSobreNos ts = new TelaSobreNos();
            dispose();
        }else if(e.getSource()==menuItemBuscar){
            TelaBuscar tb = new TelaBuscar();
            dispose();
        }else if(e.getSource()==menuItemSair){
            Connection con = null;
            LivroJDBC f = new LivroJDBC();
            f.fechaConexao(con);
        }
    }
    
    public static void main(String[] args){
        LivroJDBC f = new LivroJDBC();
        f.Conexao();
        TelaMenuPrincipal tmp = new TelaMenuPrincipal();
        
    }
    
}
