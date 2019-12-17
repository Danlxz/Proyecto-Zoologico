
package gui.run;

import Excel.mReportes;
import hashing.CTrans;
import javax.swing.JOptionPane;

public class Reportes extends javax.swing.JPanel {

    Gestion g;
    mReportes reporte;
    CTrans Transferencia;
    String[] tipos = {"Anfibios","Mamiferos","Reptiles","Aves"};
    
    public Reportes(Gestion g, mReportes reporte, CTrans Transferencia) {
        initComponents();
        this.g = g;
        this.reporte = reporte;
        this.Transferencia = Transferencia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo2 = new javax.swing.JComboBox<>();
        btmGenerar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablarp = new javax.swing.JTable();
        titulo2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        combo2.setBackground(new java.awt.Color(153, 153, 153));
        combo2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        combo2.setForeground(new java.awt.Color(51, 51, 51));
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Reporte de todos los animales", "Reporte de animales por tipo", "Reporte de animales trasladados", "Reporte de cantidad de animales x tipo", "Reporte de los animales trasladados según su tipo", "Reporte de los animales por responsable", "Reporte de los animales trasladados por fecha" }));
        combo2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        combo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo2.setFocusable(false);
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });

        btmGenerar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btmGenerar.setForeground(new java.awt.Color(204, 204, 204));
        btmGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ex.png"))); // NOI18N
        btmGenerar.setContentAreaFilled(false);
        btmGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btmGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmGenerarActionPerformed(evt);
            }
        });

        tablarp.setBackground(new java.awt.Color(153, 153, 153));
        tablarp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablarp.setForeground(new java.awt.Color(51, 51, 51));
        tablarp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablarp.setEnabled(false);
        tablarp.setRowHeight(25);
        jScrollPane3.setViewportView(tablarp);

        titulo2.setBackground(new java.awt.Color(204, 204, 204));
        titulo2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titulo2.setForeground(new java.awt.Color(204, 204, 204));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Reportes");
        titulo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btmGenerar)
                .addGap(321, 321, 321))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo2)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(144, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo2)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btmGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btmGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmGenerarActionPerformed
          reporte.abrirArchivo();
    }//GEN-LAST:event_btmGenerarActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        switch (combo2.getSelectedIndex()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Por Favor Seleccione un Reporte");
                break;
            case 1:
                reporte.reporteAnimales();
                break;
            case 2:
                try {
                    String tipito = (String) JOptionPane.showInputDialog(null, "Seleccione Tipo de Animal", "Reporte Tipos",
                            JOptionPane.DEFAULT_OPTION, null, tipos, tipos[0]);
                    reporte.reporteAnimalesPorTipo(tipito);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un ERROR, Verifique");
                }
                break;
            case 3:
                if (!Transferencia.HashD.isEmpty()) {
                    reporte.reporteTanslados();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay translados disponibles");
                }
                break;
            case 4:
                reporte.reporteAnimalesCantidadTipo();
                break;
            case 5:
                if (!Transferencia.HashD.isEmpty()) {
                    try {
                        String tipito = (String) JOptionPane.showInputDialog(null, "Seleccione Tipo de Animal", "Reporte Tipos Translados",
                                JOptionPane.DEFAULT_OPTION, null, tipos, tipos[0]);
                        reporte.reporteTansladosSegunTipo(tipito);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ocurrio un ERROR, Verifique");
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "No hay translados disponibles");
                }
                break;
            case 6:
                try {
                    String[] nombres = reporte.buscarResponsables();
                    String persona = (String) JOptionPane.showInputDialog(null, "Seleccione nombre del Responsable", "Reporte Responsables",
                            JOptionPane.DEFAULT_OPTION, null, nombres, nombres[0]);
                    reporte.reporteAnimalesPorPersona(persona);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un ERROR, Verifique");
                }
                break;
            case 7:
                if (!Transferencia.HashD.isEmpty()) {
                    String[] fechas = reporte.buscarFechas();
                    String fecha = (String) JOptionPane.showInputDialog(null, "Seleccione Fecha Salida", "Reporte Fechas",
                            JOptionPane.DEFAULT_OPTION, null, fechas, fechas[0]);
                    reporte.reporteTransladosPorFechas(fecha);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay translados disponibles");
                }
                break;
        }
    }//GEN-LAST:event_combo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btmGenerar;
    public static javax.swing.JComboBox<String> combo2;
    public static javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable tablarp;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
