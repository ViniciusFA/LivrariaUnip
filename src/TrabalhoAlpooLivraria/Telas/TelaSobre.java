/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAlpooLivraria.Telas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author viniciusfa
 */
public class TelaSobre extends JFrame implements ActionListener{

    private JPanel painelSuperior,painelMeio,painelInf;
    private JButton botaoVoltar,botaoSair;
    private JLabel sobreNos;
    
    
    public TelaSobre() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        painelSuperior = new JPanel();
        painelMeio = new JPanel();
        painelInf = new JPanel();
        botaoVoltar = new JButton("Voltar");
        botaoSair = new JButton("Sair");
        sobreNos = new JLabel();
    
        botaoVoltar.addActionListener(this);
        botaoSair.addActionListener(this);
        
        sobreNos.setText("Estudantes de Ciência da Computação....");
        
        painelMeio.add(sobreNos);
        painelInf.add(botaoVoltar);
        painelInf.add(botaoSair);
        
        add(painelSuperior,BorderLayout.NORTH);
        add(painelMeio,BorderLayout.CENTER);
        add(painelInf,BorderLayout.SOUTH);
        
        setSize(600,300);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botaoVoltar){
            TelaMenuPrincipal tmp = new TelaMenuPrincipal();
            dispose();
        }else if(e.getSource()==botaoSair){
            System.exit(0);
            
        }
    }
    
}
