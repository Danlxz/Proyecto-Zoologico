
package hashing;

import datos.dto.AnimalDTO;
import static java.lang.Math.sqrt;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class HashTableDAO {

    public Object[] matrizhash;
    int tipo_funcion;

    public HashTableDAO() {
        matrizhash = new Object[101];
    }

    public HashTableDAO(int numeroDeElementos, int tipo_funcion) {
        if (numeroDeElementos < 1) {
            numeroDeElementos = 101;
        } else {
            numeroDeElementos = numeroPrimo(numeroDeElementos);
        }
        matrizhash = new AnimalDTO[numeroDeElementos];
        this.tipo_funcion = tipo_funcion;
    }

    public int numeroPrimo(int n) {
        boolean primo = false;
        int i, r = (int) Math.sqrt((double) n);

        if (n % 2 == 0) {
            n++;
        }
        while (!primo) {
            primo = true;
            for (i = 3; i <= r; i += 2) {
                if (n % i == 0) {
                    primo = false;
                }
            }

            if (!primo) {
                n += 2; // siguiente impar
            }
        }
        return n;
    }

    public abstract int funcionHash(Object obj);

    public abstract int funcionHashMulti(Object obj);

    public abstract int comparar(Object obj1, Object obj2);

    public void hashIn(Object x) {
        int i;
        int conta = 0;
        boolean insertado = false;

        if (tipo_funcion == 1) {
            i = funcionHashMulti(x);
        } else {
            i = funcionHash(x);
        }

        while (!insertado && conta < matrizhash.length) {
            if (matrizhash[i] == null) // elemento libre
            {
                matrizhash[i] = x;
                JOptionPane.showMessageDialog(null, "Animal Ingresado con Exito");
                insertado = true;
            } else if (comparar(x, matrizhash[i]) == 0) {
                JOptionPane.showMessageDialog(null, "Error: clave duplicada");
                insertado = true;
            } else {
                i++;
                conta++;
                if (i == matrizhash.length) {
                    i = 0;
                }
            }
        }
        if (conta == matrizhash.length) {
            JOptionPane.showMessageDialog(null, "Error: matriz llena\n");
        }
    }

    public Object hashOut(Object x) {
        int i;
        int conta = 0;
        boolean encontrado = false;

        if (tipo_funcion == 1) {
            i = funcionHashMulti(x);
        } else {
            i = funcionHash(x);
        }
        if (matrizhash[i] == null) {
            return null;
        }
        while (!encontrado && conta < matrizhash.length) {
            if (comparar(x, matrizhash[i]) == 0) {
                x = matrizhash[i];
                encontrado = true;
            } else {

                i++;
                conta++;
                if (i == matrizhash.length) {
                    i = 0;
                }
            }
        }
        if (conta == matrizhash.length) {
            return null;
        } else {
            return x;
        }
    }

    public void hashUpdate(Object x, int id_animal) {
        int i;
        int conta = 0;

        if (tipo_funcion == 1) {
            i = (int) ((int) numeroDeElementos()*(((id_animal & 0x7fffffff)*((sqrt(5)-1)/2))%1));
        } else {
            i = (id_animal & 0x7fffffff) % numeroDeElementos();
        }

       
        boolean modificado = false;

        if (matrizhash[i] == null) {
            JOptionPane.showMessageDialog(null, "Animal No Existe");
        }

        while (!modificado && conta < matrizhash.length) {
            Object dato = matrizhash[i];
            if (id_animal == ((AnimalDTO) dato).getId_animal()) {
                matrizhash[i] = x;
                modificado = true;
            } else {
                i++;
                conta++;
                if (i == matrizhash.length) {
                    i = 0;
                }
            }
        }

        if (conta == matrizhash.length) {
            JOptionPane.showMessageDialog(null, "Animal No Existe");
        } else {
            JOptionPane.showMessageDialog(null, "Animal Modificado con Exito");
        }

    }

    public int numeroDeElementos() {
        return matrizhash.length;
    }

    public void mostrarDatos(DefaultTableModel md, JTable tb) {
        md.setRowCount(0);
        Object file[] = new Object[tb.getColumnCount()];
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
        for (int i = 0; i < matrizhash.length; i++) {
            Object obj = matrizhash[i];
            if (obj != null) {
                file[0] = ((AnimalDTO) obj).getId_animal();
                file[1] = ((AnimalDTO) obj).getNombre();
                file[2] = ((AnimalDTO) obj).getTipo();
                file[3] = formateador.format(((AnimalDTO) obj).getFecha_entrada());
                file[4] = ((AnimalDTO) obj).getNombre_responsable();
                md.addRow(file);
            }

        }
    }

}
