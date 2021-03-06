/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Persona;
import clases.Usuario;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        tfUsuario = new javax.swing.JTextField();
        pfContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jbRegistrarte = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbIniciarSesión = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfUsuario.setText("Usuario");
        tfUsuario.setToolTipText("Usuario");
        tfUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pfContraseña.setText("jPasswordField1");
        pfContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("¿No tienes una cuenta?");

        jbRegistrarte.setText("Regístrate");
        jbRegistrarte.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbRegistrarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarteregistrarUsuario(evt);
            }
        });

        jbIniciarSesión.setBackground(new java.awt.Color(0, 153, 153));
        jbIniciarSesión.setText("Iniciar sesión");
        jbIniciarSesión.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbIniciarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarSesión(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jbRegistrarte))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbIniciarSesión, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pfContraseña))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbIniciarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRegistrarte)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarteregistrarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarteregistrarUsuario
        // TODO add your handling code here:
        panelRegistro panelParcial = new panelRegistro();
        panelParcial.setBounds(pnlPrincipal.getBounds());
        pnlPrincipal.removeAll();
        pnlPrincipal.add(panelParcial,rootPane);
        pnlPrincipal.setLayout(new java.awt.BorderLayout());
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jbRegistrarteregistrarUsuario

    private void jbIniciarSesión(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarSesión
        // TODO add your handling code here:
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Usuarios.obj"))){
            while(true){
                Usuario uLectura = (Usuario)ois.readObject();
                    if(uLectura.getUsuario().equals(tfUsuario.getText())){
                        System.out.println(uLectura.getContraseña());
                        if(uLectura.getContraseña().equals(String.valueOf(pfContraseña.getPassword()))){
                            JOptionPane.showMessageDialog(rootPane,"Bienvenido");
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Contraseña equivocada");
                        }
                    break;}
            }
        } catch (Exception e){
            if(tfUsuario.getText().compareTo("")!=0 && String.valueOf(pfContraseña.getPassword()).compareTo("")!=0){
                JOptionPane.showMessageDialog(rootPane, "El usuario "+tfUsuario.getText()+" no existe, registrate por favor");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Usuario y contraseña son necesarios");
            }
        }
    }//GEN-LAST:event_jbIniciarSesión

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbIniciarSesión;
    private javax.swing.JButton jbRegistrarte;
    private javax.swing.JPasswordField pfContraseña;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
