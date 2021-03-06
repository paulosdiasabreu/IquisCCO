/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

/**
 *
 * @author home
 */
public class IndexOdonto extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public IndexOdonto() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jlbIcone = new javax.swing.JLabel();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiDentista = new javax.swing.JMenuItem();
        jmiPaciente = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IquisODONTO");

        jToolBar1.setRollover(true);

        jlbIcone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/odontologia.png"))); // NOI18N
        jlbIcone.setToolTipText("");

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbIcone, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbIcone, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );
        jdpPrincipal.setLayer(jlbIcone, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jmbBarraMenu.setMargin(new java.awt.Insets(1, 1, 1, 1));

        jmCadastro.setText("Cadastro");

        jmiDentista.setText("Dentista");
        jmiDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDentistaActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiDentista);

        jmiPaciente.setText("Paciente");
        jmiPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPacienteActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiPaciente);

        jmbBarraMenu.add(jmCadastro);

        jmConsulta.setText("Consulta");
        jmbBarraMenu.add(jmConsulta);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpPrincipal)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(840, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDentistaActionPerformed
        // TODO add your handling code here:
        CadDentista cadastroDentista = new CadDentista();
        jdpPrincipal.add(cadastroDentista);
        cadastroDentista.setVisible(true);
    }//GEN-LAST:event_jmiDentistaActionPerformed

    private void jmiPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPacienteActionPerformed
        // TODO add your handling code here:
        CadPaciente cadastroCliente = new CadPaciente();
        jdpPrincipal.add(cadastroCliente);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jmiPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(IndexOdonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexOdonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexOdonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexOdonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexOdonto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JLabel jlbIcone;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiDentista;
    private javax.swing.JMenuItem jmiPaciente;
    // End of variables declaration//GEN-END:variables






}
