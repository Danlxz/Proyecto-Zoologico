
package gui.run;

import datos.dto.AnimalDTO;
import datos.dto.TransAnimalDTO;
import static gui.run.Principal.cbejecutar;
import hashing.CAnimal;
import hashing.CTrans;
import hashing.HasTable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Transladar extends javax.swing.JPanel {

    Gestion g;
    HasTable AnimalHasTable;
    CTrans Transferencia;
    CAnimal animals;
    DefaultTableModel md2 = new DefaultTableModel();
    
    public Transladar(Gestion g, HasTable AnimalHasTable, CTrans Transferencia, CAnimal animals) {
        initComponents();
        this.g = g;
        this.AnimalHasTable = AnimalHasTable;
        this.Transferencia = Transferencia;
        this.animals = animals;
        iniciar();
    }
    
    public void iniciar() {
        md2.addColumn("ID ANIMAL");
        md2.addColumn("NOMBRE ANIMAL");
        md2.addColumn("TIPO ANIMAL");
        md2.addColumn("FECHA SALIDA");
        md2.addColumn("ZOOLOGICO DESTINO");
        tb2.setModel(md2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        txt_fecha1 = new com.toedter.calendar.JDateChooser();
        txt_nombreanimal1 = new javax.swing.JTextField();
        txt_zoologico = new javax.swing.JTextField();
        combo_tipo1 = new javax.swing.JComboBox<>();
        txt_idanimal1 = new javax.swing.JTextField();
        transferir = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Translado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(204, 204, 204))); // NOI18N

        txt_fecha1.setBackground(new java.awt.Color(255, 255, 255));
        txt_fecha1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Fecha Salida", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        txt_fecha1.setForeground(new java.awt.Color(51, 51, 51));
        txt_fecha1.setEnabled(false);
        txt_fecha1.setFocusable(false);
        txt_fecha1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_nombreanimal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombreanimal1.setForeground(new java.awt.Color(51, 51, 51));
        txt_nombreanimal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreanimal1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Animal", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        txt_nombreanimal1.setFocusable(false);

        txt_zoologico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_zoologico.setForeground(new java.awt.Color(51, 51, 51));
        txt_zoologico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_zoologico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Zoologico Destino", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        txt_zoologico.setEnabled(false);

        combo_tipo1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        combo_tipo1.setForeground(new java.awt.Color(51, 51, 51));
        combo_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Anfibios", "Mamiferos", "Reptiles", "Aves" }));
        combo_tipo1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        combo_tipo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo_tipo1.setEnabled(false);
        combo_tipo1.setFocusable(false);

        txt_idanimal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idanimal1.setForeground(new java.awt.Color(51, 51, 51));
        txt_idanimal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_idanimal1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Id Animal", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        txt_idanimal1.setFocusable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_zoologico)
                    .addComponent(txt_fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_tipo1, 0, 159, Short.MAX_VALUE)
                    .addComponent(txt_nombreanimal1)
                    .addComponent(txt_idanimal1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(txt_idanimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_nombreanimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(combo_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txt_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_zoologico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        transferir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        transferir.setForeground(new java.awt.Color(153, 153, 153));
        transferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a.png"))); // NOI18N
        transferir.setText("Transferir");
        transferir.setToolTipText("Transferir");
        transferir.setContentAreaFilled(false);
        transferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transferir.setEnabled(false);
        transferir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transferir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        transferir.setIconTextGap(-30);
        transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(204, 204, 204));
        Buscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Buscar.setForeground(new java.awt.Color(153, 153, 153));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bi.jpg"))); // NOI18N
        Buscar.setText("  Buscar");
        Buscar.setToolTipText("Buscar Animal");
        Buscar.setContentAreaFilled(false);
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        titulo2.setBackground(new java.awt.Color(204, 204, 204));
        titulo2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titulo2.setForeground(new java.awt.Color(204, 204, 204));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Translados");
        titulo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contenedor Translados", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(204, 204, 204))); // NOI18N

        tb2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb2.setForeground(new java.awt.Color(51, 51, 51));
        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb2.setRowHeight(25);
        jScrollPane2.setViewportView(tb2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo2)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(transferir)
                                .addGap(29, 29, 29)
                                .addComponent(Buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirActionPerformed
        if (g.ValidarDatos2()) {
            try {
                int id_animal = Integer.parseInt(txt_idanimal1.getText().trim());
                String nombre_animal = txt_nombreanimal1.getText().trim();
                String tipo_animal = combo_tipo1.getSelectedItem().toString();
                Date fecha_salida = txt_fecha1.getDate();
                String nombre_zoologico = txt_zoologico.getText().trim();
                Transferencia.HashAdd(new TransAnimalDTO(id_animal, nombre_animal, tipo_animal, fecha_salida, nombre_zoologico));
                Transferencia.mostrarDatos(md2, tb2);
                g.limpiarCampos2();
                g.desactivarCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un Error, Verifique Datos");
            }
        }
    }//GEN-LAST:event_transferirActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try {
            Object Buscado = null;
            int id_animal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID ANIMAL"));
            if (cbejecutar.getSelectedIndex() == 1) {
                Buscado = animals.AnimalOut(id_animal);
            }else{
                SimpleDateFormat parseador = new SimpleDateFormat("dd-MM-yy");
                Date date = parseador.parse("31-03-2016");
                AnimalDTO aniBus = new AnimalDTO(id_animal, "", "", date, "");
                Buscado = AnimalHasTable.hashOut(aniBus);
            }
            
            if (Buscado != null) {
                txt_idanimal1.setText(Integer.toString(((AnimalDTO) Buscado).getId_animal()));
                txt_nombreanimal1.setText(((AnimalDTO) Buscado).getNombre());
                combo_tipo1.setSelectedItem(((AnimalDTO) Buscado).getTipo());
                txt_fecha1.setEnabled(true);
                txt_zoologico.setEnabled(true);
                transferir.setEnabled(true);
                Buscar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Animal no Encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error, Verifique Datos");
        }
    }//GEN-LAST:event_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Buscar;
    public static javax.swing.JComboBox<String> combo_tipo1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tb2;
    private javax.swing.JLabel titulo2;
    public static javax.swing.JButton transferir;
    public static com.toedter.calendar.JDateChooser txt_fecha1;
    public static javax.swing.JTextField txt_idanimal1;
    public static javax.swing.JTextField txt_nombreanimal1;
    public static javax.swing.JTextField txt_zoologico;
    // End of variables declaration//GEN-END:variables
}
