
package gui.run;

import Excel.mReportes;
import hashing.CAnimal;
import hashing.CTrans;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Entrada en;
    Transladar tr;
    Reportes rp;
    Inicial i;
    Gestion g = new Gestion();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        autores = new javax.swing.JLabel();
        izq = new javax.swing.JButton();
        der = new javax.swing.JButton();
        cbejecutar = new javax.swing.JComboBox<>();
        tapiz = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(51, 51, 51));
        fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Proyecto Hash - Zoologico ");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        fondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 590, 80));

        autores.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        autores.setForeground(new java.awt.Color(204, 204, 204));
        autores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autores.setText("Autores: Duvan Botello - Daniel Luna - Camilo Ojeda");
        autores.setToolTipText("ANALISIS DE ALGORITMOS - Pedro Ariza Acevedo.");
        autores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fondo.add(autores, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 13, 385, -1));

        izq.setToolTipText("Anterior");
        izq.setContentAreaFilled(false);
        izq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izq.setEnabled(false);
        izq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izqActionPerformed(evt);
            }
        });
        fondo.add(izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 100, 100));

        der.setToolTipText("Siguiente");
        der.setContentAreaFilled(false);
        der.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        der.setEnabled(false);
        der.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derActionPerformed(evt);
            }
        });
        fondo.add(der, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 100, 100));

        cbejecutar.setBackground(new java.awt.Color(204, 204, 204));
        cbejecutar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbejecutar.setForeground(new java.awt.Color(255, 255, 255));
        cbejecutar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ejecutar Por:", "Hash - JAVA", "Hash - MANUAL" }));
        cbejecutar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbejecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbejecutar.setFocusable(false);
        cbejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbejecutarActionPerformed(evt);
            }
        });
        fondo.add(cbejecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 180, 40));

        tapiz.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tapiz.setOpaque(false);
        tapiz.setPreferredSize(new java.awt.Dimension(900, 364));

        javax.swing.GroupLayout tapizLayout = new javax.swing.GroupLayout(tapiz);
        tapiz.setLayout(tapizLayout);
        tapizLayout.setHorizontalGroup(
            tapizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tapizLayout.setVerticalGroup(
            tapizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        fondo.add(tapiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 115, 1070, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void izqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izqActionPerformed
        if (cbejecutar.getSelectedIndex() == 1) {
            g.desplazar(2, en, tr, rp);
        }else{
            i.izq();
        }
    }//GEN-LAST:event_izqActionPerformed

    private void derActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derActionPerformed
        if (cbejecutar.getSelectedIndex() == 1) {
            g.desplazar(1, en, tr, rp);
        }else{
            i.der();
        }
    }//GEN-LAST:event_derActionPerformed

    private void cbejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbejecutarActionPerformed
        switch (cbejecutar.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Por Favor Seleccione modo de Ejecucion");
                break;
            case 1:
                Gestion g = new Gestion();
                CTrans Transferencia = new CTrans();
                CAnimal animal = new CAnimal();
                mReportes reporte = new mReportes(null, Transferencia, animal);
                en = new Entrada(g, null, animal);
                tr = new Transladar(g, null, Transferencia, animal);
                rp = new Reportes(g, reporte, Transferencia);
                izq.setEnabled(true);
                der.setEnabled(true);
                cbejecutar.setEnabled(false);
                tapiz.add(en);
                en.setSize(1070, 540);
                break;
            case 2:
                i = new Inicial();
                tapiz.add(i);
                i.setSize(1070, 540);
                break;
        }
    }//GEN-LAST:event_cbejecutarActionPerformed

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
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autores;
    public static javax.swing.JComboBox<String> cbejecutar;
    public static javax.swing.JButton der;
    private javax.swing.JPanel fondo;
    public static javax.swing.JButton izq;
    public static javax.swing.JPanel tapiz;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
