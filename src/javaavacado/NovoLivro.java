/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaavacado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author H.Chirico
 */
public class NovoLivro extends javax.swing.JFrame {

 
     private JComboBox secondComboBox;
    /**
     * Creates new form NovoLivro
     */
    public NovoLivro() {
        initComponents();
        initCustomComponents();
         setResizable(false);
    }
    
    
    
     private void initCustomComponents() {
//    jComboBox2 = new JComboBox();
    
combo.addItem("selecione  a Editora ");
combo.addItem("ENM");
    combo.addItem("Longman");
    combo.addItem("Paulinas");
 combo.addItem("Fundza");
  combo.addItem("inter Escolas");
  combo.addItem("Plural");
  combo.addItem("Texto Editores");
  combo.addItem("Trinta Zero Nove");
  combo.addItem("Aleph");
  combo.addItem("Globo Livros");
 
    
    secondComboBox = new JComboBox();
    
      pack();
  }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDLivro = new javax.swing.JFormattedTextField();
        titulo = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        ano = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        vol = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID Livro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Titulo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Autor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ano");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Editora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Volume");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        try {
            IDLivro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(IDLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 270, 30));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 270, 30));

        autor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 270, 30));

        ano.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 270, 30));

        combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 270, 40));

        vol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(vol, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 90, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/save2.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/close2.png"))); // NOI18N
        jButton2.setText("Sair ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sl.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
         String Idlivro=IDLivro.getText();
        String Titulo= titulo.getText();
        String Autor= autor.getText();
       int Ano=Integer.parseInt(ano.getText());
        String Editora=(String) combo.getSelectedItem();
         int Vol=Integer.parseInt(vol.getText());
        
        try{
             Connection con= BD.getconnection();
             Statement st= con.createStatement();
             st.executeUpdate("insert into livro values('"+Idlivro+"','"+Titulo+"','"+Autor+"','"+Ano+"','"+Editora+"','"+Vol+"')");
             JOptionPane.showMessageDialog(null,"Livro Cadastrado com Sucesso");
             setVisible(true);
             new NovoLivro().setVisible(true);
            
            
        }catch(Exception e){
            
           e.printStackTrace();
           
           JOptionPane.showMessageDialog(null," Id Do Livro ja existe");
           
           setVisible(true);
             new NovoLivro().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        Home h= new Home();
        h.show();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField IDLivro;
    private javax.swing.JTextField ano;
    private javax.swing.JTextField autor;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField vol;
    // End of variables declaration//GEN-END:variables
}
