
package gui.run;

import Excel.mReportes;
import hashing.CTrans;
import hashing.HasTable;
import javax.swing.JOptionPane;

public class Inicial extends javax.swing.JPanel {

    Entrada en;
    Transladar tr;
    Reportes rp;
    Gestion g = new Gestion();
    
    public Inicial() {
        initComponents();
        titulo2.setVisible(false);
    }

    public void der (){
        g.desplazar(1, en, tr, rp);
    }
    public void izq (){
        g.desplazar(2, en, tr, rp);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttamaño = new javax.swing.JTextField();
        utilizar = new javax.swing.JPanel();
        cbmutilizar = new javax.swing.JComboBox<>();
        continuar = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        txttamaño.setBackground(new java.awt.Color(51, 51, 51));
        txttamaño.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txttamaño.setForeground(new java.awt.Color(204, 204, 204));
        txttamaño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttamaño.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Ingrese Tamaño Matriz", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(204, 204, 204))); // NOI18N

        utilizar.setBackground(new java.awt.Color(51, 51, 51));
        utilizar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Utilizar", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(204, 204, 204))); // NOI18N

        cbmutilizar.setBackground(new java.awt.Color(204, 204, 204));
        cbmutilizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbmutilizar.setForeground(new java.awt.Color(255, 255, 255));
        cbmutilizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Funciones Hash: Método de Multiplicación", "Funciones Hash: Método de División" }));
        cbmutilizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbmutilizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbmutilizar.setFocusable(false);

        javax.swing.GroupLayout utilizarLayout = new javax.swing.GroupLayout(utilizar);
        utilizar.setLayout(utilizarLayout);
        utilizarLayout.setHorizontalGroup(
            utilizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbmutilizar, 0, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
        utilizarLayout.setVerticalGroup(
            utilizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbmutilizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        continuar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        continuar.setForeground(new java.awt.Color(204, 204, 204));
        continuar.setText("Continuar");
        continuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        continuar.setContentAreaFilled(false);
        continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        titulo2.setBackground(new java.awt.Color(204, 204, 204));
        titulo2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        titulo2.setForeground(new java.awt.Color(204, 204, 204));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Desplaze para acceder :)");
        titulo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txttamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(utilizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txttamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(utilizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(titulo2))
                    .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        if (!txttamaño.getText().isEmpty()) {
            if (cbmutilizar.getSelectedIndex() != 0) {
                try {
                    int tamaño = Integer.parseInt(txttamaño.getText().trim());
                    int funcion = cbmutilizar.getSelectedIndex();
                    HasTable AnimalHasTable = new HasTable(tamaño, funcion);
                    CTrans Transferencia = new CTrans();
                    mReportes reporte = new mReportes(AnimalHasTable, Transferencia, null);
                    en = new Entrada(g, AnimalHasTable, null);
                    tr = new Transladar(g, AnimalHasTable, Transferencia, null);
                    rp = new Reportes(g, reporte, Transferencia);
                    g.desactivarbtn();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un Error, por favor verifique los datos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una Funcion Hash");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese Tamaño");
        }
    }//GEN-LAST:event_continuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbmutilizar;
    public static javax.swing.JButton continuar;
    public static javax.swing.JLabel titulo2;
    public static javax.swing.JTextField txttamaño;
    public static javax.swing.JPanel utilizar;
    // End of variables declaration//GEN-END:variables
}
