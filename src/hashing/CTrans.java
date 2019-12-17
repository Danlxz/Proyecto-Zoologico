
package hashing;

import datos.dto.TransAnimalDTO;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CTrans {

    public LinkedList<TransAnimalDTO> HashD = new LinkedList<>();

    public void HashAdd(TransAnimalDTO translado) {
        HashD.add(translado);
        JOptionPane.showMessageDialog(null, "Translado Realizado con Exito");
    }

    public void mostrarDatos(DefaultTableModel md, JTable tb) {
        md.setRowCount(0);
        Object file[] = new Object[tb.getColumnCount()];
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
        for (TransAnimalDTO a : HashD) {

            file[0] = a.getId_animal();
            file[1] = a.getNombre();
            file[2] = a.getTipo();
            file[3] = formateador.format(a.getFecha_salida());
            file[4] = a.getNombre_zoologico_destino();
            md.addRow(file);

        }
    }
}
