
package hashing;

import datos.dto.AnimalDTO;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CAnimal {
    
    public Map<Integer, AnimalDTO> AnimalMap = new TreeMap<>();
    
    public void AnimalPut (int clave, AnimalDTO animal){
        if (AnimalMap.containsKey(clave)) {
            JOptionPane.showMessageDialog(null, "Error: clave duplicada");
        }else{
            AnimalMap.put(clave, animal);
        }
    }
    
    public void AnimalUpdate (int clave, AnimalDTO animal){
        if (AnimalMap.containsKey(clave)) {
            AnimalMap.put(clave, animal);
        }else{
            JOptionPane.showMessageDialog(null, "Animal No Existe");
        }
    }
    
    public Object AnimalOut (int clave){
        Object buscado = AnimalMap.get(clave);
        return buscado;
    }
    
    public void AnimalDatos (DefaultTableModel md, JTable tb){
        md.setRowCount(0);
        Object file[] = new Object[tb.getColumnCount()];
        AnimalDTO a;
        for (Entry<Integer, AnimalDTO> animal : AnimalMap.entrySet()) {
            int it = 1;
            file[0] = animal.getKey();
            a = animal.getValue();
            StringTokenizer tok = new StringTokenizer(a.toString(),"-");
            while (tok.hasMoreTokens()) {  
                file[it] = tok.nextToken();
                it++;
            }
            md.addRow(file);
        }
    }
    
}
