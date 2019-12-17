
package gui.run;

import static gui.run.Entrada.combo_tipo;
import static gui.run.Entrada.txt_fecha;
import static gui.run.Entrada.txt_idanimal;
import static gui.run.Entrada.txt_nombreRespon;
import static gui.run.Entrada.txt_nombreanimal;
import static gui.run.Inicial.cbmutilizar;
import static gui.run.Inicial.continuar;
import static gui.run.Inicial.titulo2;
import static gui.run.Inicial.txttamaño;
import static gui.run.Principal.cbejecutar;
import static gui.run.Principal.der;
import static gui.run.Principal.izq;
import static gui.run.Principal.tapiz;
import static gui.run.Transladar.Buscar;
import static gui.run.Transladar.combo_tipo1;
import static gui.run.Transladar.transferir;
import static gui.run.Transladar.txt_fecha1;
import static gui.run.Transladar.txt_idanimal1;
import static gui.run.Transladar.txt_nombreanimal1;
import static gui.run.Transladar.txt_zoologico;
import javax.swing.JOptionPane;

public class Gestion {
    
    int pos = -1;
    
    public void desplazar(int mov, Entrada en, Transladar tr, Reportes rp) {
        if (mov == 1) { // Derecha.
            if (pos == 2) {
                pos = -1;
            }
            pos++;
        }else{ // Izquierda. 
            if (pos == -1 || pos == 0) {
                pos = 3;
            }
            pos--;
        }
        tapiz.removeAll();
        switch (pos) {
            case 0:
                en.setSize(1070, 540);
                tapiz.add(en);
                break;
            case 1:
                tr.setSize(1070, 540);
                tapiz.add(tr);
                break;
            case 2:
                rp.setSize(1070, 540);
                tapiz.add(rp);
                break;
            default:
                break;
        }
        tapiz.repaint();
    }
    
    public void desactivarCampos() {
        txt_fecha1.setEnabled(false);
        txt_zoologico.setEnabled(false);
        transferir.setEnabled(false);
        Buscar.setEnabled(true);
    }
    
    public void desactivarbtn (){
        continuar.setVisible(false);
        txttamaño.setEditable(false);
        cbmutilizar.setEnabled(false);
        izq.setEnabled(true);
        der.setEnabled(true);
        titulo2.setVisible(true);
        cbejecutar.setEnabled(false);
    }

    public void limpiarCampos() {
        txt_fecha.setDate(null);
        txt_idanimal.setText("");
        txt_nombreRespon.setText("");
        txt_nombreanimal.setText("");
        combo_tipo.setSelectedIndex(0);
    }

    public void limpiarCampos2() {
        txt_fecha1.setDate(null);
        txt_idanimal1.setText("");
        txt_zoologico.setText("");
        txt_nombreanimal1.setText("");
        combo_tipo1.setSelectedIndex(0);
    }

    public boolean ValidarDatos() {
        boolean valido = false;
        if (!txt_idanimal.getText().isEmpty()) {
            if (!txt_nombreanimal.getText().isEmpty()) {
                if (combo_tipo.getSelectedIndex() != 0) {
                    if (txt_fecha.getDate() != null) {

                        if (!txt_nombreRespon.getText().isEmpty()) {
                            valido = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Digite Nombre Cuidador");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione Fecha");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un Tipo");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Digite Nombre Animal");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite ID animal");
        }
        return valido;
    }

    public boolean ValidarDatos2() {
        boolean valido = false;
        if (!txt_idanimal1.getText().isEmpty()) {
            if (!txt_nombreanimal1.getText().isEmpty()) {
                if (combo_tipo1.getSelectedIndex() != 0) {
                    if (txt_fecha1.getDate() != null) {

                        if (!txt_zoologico.getText().isEmpty()) {
                            valido = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Digite Nombre Zoologico");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione Fecha");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione un Tipo");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Digite Nombre Animal");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite ID animal");
        }
        return valido;
    }
    
}
