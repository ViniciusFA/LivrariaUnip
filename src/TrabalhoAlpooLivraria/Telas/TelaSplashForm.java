/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAlpooLivraria.Telas;
import static java.lang.Thread.sleep;
import TrabalhoAlpooLivrariaJDBC.FabricaConexao;
/**
 *
 * @author viniciusfa
 */
public class TelaSplashForm extends javax.swing.JFrame {

    /**
     * Creates new form TelaSplashForm
     */
    public TelaSplashForm() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
                new Thread(){
           @Override
           public void run () {
               
            for(int i=0;i < 101 ; i++){
                
            try {
            sleep(50);
          jProgressBar1.setValue(i);
            if(jProgressBar1.getValue()<=25){
               jLabel1.setText(" Inicialiazando o sistema...");
            }else if(jProgressBar1.getValue() <= 50){
               jLabel1.setText( " Carregando banco de dados");
            }else if(jProgressBar1.getValue() <= 75){
               jLabel1.setText( " Carregando módulos...");
            } else {
                jLabel1.setText(" Abrindo o sistema...");
            }
            
            //FabricaConexao conecta = new FabricaConexao();
            
                             
                                  
        }// fim do try
            catch(InterruptedException ex){
                System.out.println(ex.getMessage());
        }
        }// for
           TelaLogin login = new TelaLogin();
           login.setVisible(true);
           dispose();
        }
        }.start();//Thread
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jProgressBar1.setBackground(new java.awt.Color(176, 181, 184));
        jProgressBar1.setForeground(new java.awt.Color(71, 163, 73));
        jProgressBar1.setName("barraProgresso"); // NOI18N
        jProgressBar1.setStringPainted(true);

        jLabel1.setForeground(new java.awt.Color(40, 160, 42));
        jLabel1.setText("Carregando..");
        jLabel1.setName("loading"); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/viniciusfa/Área de Trabalho/cultura.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        TelaSplashForm t = new TelaSplashForm();
        t.setVisible(true);
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSplashForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
            
        
        
       
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
