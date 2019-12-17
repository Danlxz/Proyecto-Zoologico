
package gui.run;

import datos.dto.AnimalDTO;
import static gui.run.Principal.cbejecutar;
import hashing.CAnimal;
import hashing.HasTable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Entrada extends javax.swing.JPanel {

    Gestion g;
    HasTable AnimalHasTable;
    CAnimal animals;
    DefaultTableModel md1 = new DefaultTableModel();
      
    public Entrada(Gestion g, HasTable AnimalHasTable, CAnimal animals) {
        initComponents();
        this.g = g;
        this.AnimalHasTable = AnimalHasTable;
        this.animals = animals;
        iniciar();
    }

    public void iniciar() {
        md1.addColumn("ID ANIMAL");
        md1.addColumn("NOMBRE ANIMAL");
        md1.addColumn("TIPO ANIMAL");
        md1.addColumn("FECHA ENTRADA");
        md1.addColumn("NOMBRE RESPONSABLE");
        tb1.setModel(md1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        txt_nombreanimal = new javax.swing.JTextField();
        combo_tipo = new javax.swing.JComboBox<>();
        txt_idanimal = new javax.swing.JTextField();
        txt_nombreRespon = new javax.swing.JTextField();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        btmInsertar = new javax.swing.JButton();
        btmModificar = new javax.swing.JButton();
        btmBuscar = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Datos Animal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        txt_nombreanimal.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombreanimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombreanimal.setForeground(new java.awt.Color(51, 51, 51));
        txt_nombreanimal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreanimal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Animal", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        combo_tipo.setBackground(new java.awt.Color(204, 204, 204));
        combo_tipo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        combo_tipo.setForeground(new java.awt.Color(51, 51, 51));
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Anfibios", "Mamiferos", "Reptiles", "Aves" }));
        combo_tipo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        combo_tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo_tipo.setFocusable(false);

        txt_idanimal.setBackground(new java.awt.Color(204, 204, 204));
        txt_idanimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idanimal.setForeground(new java.awt.Color(51, 51, 51));
        txt_idanimal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_idanimal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Id Animal", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        txt_nombreRespon.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombreRespon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombreRespon.setForeground(new java.awt.Color(51, 51, 51));
        txt_nombreRespon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreRespon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Encargado", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        txt_fecha.setBackground(new java.awt.Color(204, 204, 204));
        txt_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Fecha Entrada", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        txt_fecha.setForeground(new java.awt.Color(51, 51, 51));
        txt_fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nombreRespon)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_tipo, 0, 160, Short.MAX_VALUE)
                    .addComponent(txt_nombreanimal)
                    .addComponent(txt_idanimal))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txt_idanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txt_nombreanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_nombreRespon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btmInsertar.setBackground(new java.awt.Color(153, 153, 153));
        btmInsertar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btmInsertar.setForeground(new java.awt.Color(102, 102, 102));
        btmInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ve.png"))); // NOI18N
        btmInsertar.setText("Insertar");
        btmInsertar.setToolTipText("");
        btmInsertar.setContentAreaFilled(false);
        btmInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmInsertarActionPerformed(evt);
            }
        });

        btmModificar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btmModificar.setForeground(new java.awt.Color(102, 102, 102));
        btmModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ch.png"))); // NOI18N
        btmModificar.setText("Modificar");
        btmModificar.setContentAreaFilled(false);
        btmModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btmModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btmModificar.setIconTextGap(-10);
        btmModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmModificarActionPerformed(evt);
            }
        });

        btmBuscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btmBuscar.setForeground(new java.awt.Color(102, 102, 102));
        btmBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bi.jpg"))); // NOI18N
        btmBuscar.setText(" Buscar");
        btmBuscar.setContentAreaFilled(false);
        btmBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarActionPerformed(evt);
            }
        });

        titulo2.setBackground(new java.awt.Color(204, 204, 204));
        titulo2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titulo2.setForeground(new java.awt.Color(153, 153, 153));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Entrada");
        titulo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Contenedor Animal", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        tb1.setBackground(new java.awt.Color(204, 204, 204));
        tb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb1.setForeground(new java.awt.Color(51, 51, 51));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
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
        tb1.setRowHeight(25);
        jScrollPane1.setViewportView(tb1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btmInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(535, 535, 535)
                        .addComponent(titulo2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo2)
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btmInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btmModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btmBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btmInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmInsertarActionPerformed
        if (g.ValidarDatos()) {
            try {
                int id_animal = Integer.parseInt(txt_idanimal.getText().trim());
                String nombre_animal = txt_nombreanimal.getText().trim();
                String tipo_animal = combo_tipo.getSelectedItem().toString();
                Date fecha_ingreso = txt_fecha.getDate();
                String nombre_respon = txt_nombreRespon.getText().trim();
                if (cbejecutar.getSelectedIndex() == 1) {
                    animals.AnimalPut(id_animal, new AnimalDTO(id_animal, nombre_animal, tipo_animal, fecha_ingreso, nombre_respon));
                    animals.AnimalDatos(md1, tb1);
                }else{
                    AnimalHasTable.hashIn(new AnimalDTO(id_animal, nombre_animal, tipo_animal, fecha_ingreso, nombre_respon));
                    AnimalHasTable.mostrarDatos(md1, tb1);
                }
                g.limpiarCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un Error, Verifique Datos");
            }
        }
    }//GEN-LAST:event_btmInsertarActionPerformed

    private void btmModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmModificarActionPerformed
        if (g.ValidarDatos()) {
            try {
                int id_animal = Integer.parseInt(txt_idanimal.getText().trim());
                String nombre_animal = txt_nombreanimal.getText().trim();
                String tipo_animal = combo_tipo.getSelectedItem().toString();
                Date fecha_ingreso = txt_fecha.getDate();
                String nombre_respon = txt_nombreRespon.getText().trim();
                if (cbejecutar.getSelectedIndex() == 1) {
                    animals.AnimalUpdate(id_animal, new AnimalDTO(id_animal, nombre_animal, tipo_animal, fecha_ingreso, nombre_respon));
                    animals.AnimalDatos(md1, tb1);
                }else{
                    AnimalHasTable.hashUpdate(new AnimalDTO(id_animal, nombre_animal, tipo_animal, fecha_ingreso, nombre_respon), id_animal);
                    AnimalHasTable.mostrarDatos(md1, tb1);
                }
                g.limpiarCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrio un Error, Verifique Datos");
            }
        }
    }//GEN-LAST:event_btmModificarActionPerformed

    private void btmBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarActionPerformed
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
                txt_idanimal.setText(Integer.toString(((AnimalDTO) Buscado).getId_animal()));
                txt_nombreanimal.setText(((AnimalDTO) Buscado).getNombre());
                txt_nombreRespon.setText(((AnimalDTO) Buscado).getNombre_responsable());
                combo_tipo.setSelectedItem(((AnimalDTO) Buscado).getTipo());
                txt_fecha.setDate(((AnimalDTO) Buscado).getFecha_entrada());
            } else {
                JOptionPane.showMessageDialog(null, "Animal no Encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error, Verifique Datos");
        }
    }//GEN-LAST:event_btmBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btmBuscar;
    public static javax.swing.JButton btmInsertar;
    public static javax.swing.JButton btmModificar;
    public static javax.swing.JComboBox<String> combo_tipo;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tb1;
    private javax.swing.JLabel titulo2;
    public static com.toedter.calendar.JDateChooser txt_fecha;
    public static javax.swing.JTextField txt_idanimal;
    public static javax.swing.JTextField txt_nombreRespon;
    public static javax.swing.JTextField txt_nombreanimal;
    // End of variables declaration//GEN-END:variables
}
