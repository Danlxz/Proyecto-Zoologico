
package Excel;

import datos.dto.AnimalDTO;
import datos.dto.TransAnimalDTO;
import static gui.run.Principal.cbejecutar;
import static gui.run.Reportes.tablarp;
import hashing.CAnimal;
import hashing.CTrans;
import hashing.HasTable;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mReportes {

    HasTable Hash;
    CAnimal animalHash;
    CTrans HashContenedor;
    DefaultTableModel md = new DefaultTableModel();
    File reporte_anumales;
    String columnasA = "ID ANIMAL" + "\t" + "NOMBRE ANIMAL" + "\t" + "TIPO ANIMAL" + "\t" + "FECHA ENTRADA" + "\t" + "NOMBRE RESPONSABLE";
    String columnasB = "ID ANIMAL" + "\t" + "NOMBRE ANIMAL" + "\t" + "TIPO ANIMAL" + "\t" + "FECHA SALIDA" + "\t" + "NOMBRE ZOOLOGICO";
    String columnasC = "Anfibios" + "\t" + "Mamiferos" + "\t" + "Reptiles" + "\t" + "Aves";
            
    public mReportes(HasTable Hash2, CTrans HashContenedor, CAnimal animalHash) {
        this.Hash = Hash2;
        this.HashContenedor = HashContenedor;
        this.animalHash = animalHash;
    }
    
    public void abrirArchivo (){
        int option = JOptionPane.showConfirmDialog(null, "¿Desea Abrir el archivo?", "Abrir el archivo", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            try {
                Desktop.getDesktop().open(reporte_anumales);
            } catch (IOException ex) {
                Logger.getLogger(mReportes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Object[] tablaReport (String columnas){
        md.setColumnCount(0);
        StringTokenizer tok = new StringTokenizer(columnas,"\t");
        while (tok.hasMoreTokens()) {            
            md.addColumn(tok.nextToken());
        }
        tablarp.setModel(md);
        md.setRowCount(0);
        Object file[] = new Object[tablarp.getColumnCount()];
        return file;
    }
    
    public void reporteAnimales() {
        reporte_anumales = new File("src/Excel/Reporte_Animales.xls");
        try {
            reporte_anumales.delete();
            reporte_anumales.createNewFile();
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reporte_anumales, true), "utf-8"));
            Fescribe.write("------------------------------------------REPORTE DE ANIMALES-----------------------------------------------" + "\r\n");
            Fescribe.write( columnasA + "\r\n");
            
            Object file[] = tablaReport(columnasA);
            if (cbejecutar.getSelectedIndex() == 1) {
                for (Entry<Integer, AnimalDTO> animal : animalHash.AnimalMap.entrySet()) {
                    int it = 1;
                    file[0] = animal.getKey();
                    AnimalDTO a = animal.getValue();
                    StringTokenizer tok = new StringTokenizer(a.toString(),"-");
                    while (tok.hasMoreTokens()) {  
                        file[it] = tok.nextToken();
                        it++;
                    }
                    Fescribe.write(file[0] + "\t" + file[1] + "\t" + file[2] + "\t" + file[3] + "\t" + file[4] + "\r\n");
                    md.addRow(file);
                }
            }else{
              for (int i = 0; i < Hash.matrizhash.length; i++) {
                    Object obj = Hash.matrizhash[i];
                    if (obj != null) {
                        int id_animal = ((AnimalDTO) obj).getId_animal();
                        String nombre_animal = ((AnimalDTO) obj).getNombre();
                        String tipo = ((AnimalDTO) obj).getTipo();
                        String fecha_entrada = new SimpleDateFormat("dd/MM/yyyy").format(((AnimalDTO) obj).getFecha_entrada());
                        String nombre_respon = ((AnimalDTO) obj).getNombre_responsable();
                        Fescribe.write(id_animal + "\t" + nombre_animal + "\t" + tipo + "\t" + fecha_entrada + "\t" + nombre_respon + "\r\n");

                        file[0] = id_animal;
                        file[1] = nombre_animal;
                        file[2] = tipo;
                        file[3] = fecha_entrada;
                        file[4] = nombre_respon;
                        md.addRow(file);
                    }
                }  
            }
            Fescribe.close();
        } catch (Exception e) {
        }
    }

    public void reporteAnimalesPorTipo(String tipoAnimal) {
        reporte_anumales = new File("src/Excel/Reporte_Animales_tipo.xls");
        try {
            reporte_anumales.delete();
            reporte_anumales.createNewFile();
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reporte_anumales, true), "utf-8"));
            Fescribe.write("------------------------------------------REPORTE DE ANIMALES POR TIPO-----------------------------------------------" + "\r\n");
            Fescribe.write(columnasA + "\r\n");
            
            Object file[] = tablaReport(columnasA);
            if (cbejecutar.getSelectedIndex() == 1) {
                for (Entry<Integer, AnimalDTO> animal : animalHash.AnimalMap.entrySet()) {
                    int it = 1;
                    file[0] = animal.getKey();
                    AnimalDTO a = animal.getValue();
                    if (tipoAnimal.equals(((AnimalDTO) a).getTipo())) {
                        StringTokenizer tok = new StringTokenizer(a.toString(),"-");
                        while (tok.hasMoreTokens()) {  
                            file[it] = tok.nextToken();
                            it++;
                        }
                        Fescribe.write(file[0] + "\t" + file[1] + "\t" + file[2] + "\t" + file[3] + "\t" + file[4] + "\r\n");
                        md.addRow(file);
                    }
                }
            }else{
                for (int i = 0; i < Hash.matrizhash.length; i++) {
                    Object obj = Hash.matrizhash[i];
                    if (obj != null) {
                        if (tipoAnimal.equals(((AnimalDTO) obj).getTipo())) {
                            int id_animal = ((AnimalDTO) obj).getId_animal();
                            String nombre_animal = ((AnimalDTO) obj).getNombre();
                            String tipo = ((AnimalDTO) obj).getTipo();
                            String fecha_entrada = new SimpleDateFormat("dd/MM/yyyy").format(((AnimalDTO) obj).getFecha_entrada());
                            String nombre_respon = ((AnimalDTO) obj).getNombre_responsable();
                            Fescribe.write(id_animal + "\t" + nombre_animal + "\t" + tipo + "\t" + fecha_entrada + "\t" + nombre_respon + "\r\n");

                            file[0] = id_animal;
                            file[1] = nombre_animal;
                            file[2] = tipo;
                            file[3] = fecha_entrada;
                            file[4] = nombre_respon;
                            md.addRow(file);
                        }
                    }
                }
            }
            Fescribe.close();
        } catch (Exception e) {
        }
    }

    public void reporteTanslados() {
        reporte_anumales = new File("src/Excel/Reporte_Tanslados.xls");
        try {
            reporte_anumales.delete();
            reporte_anumales.createNewFile();
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reporte_anumales, true), "utf-8"));
            Fescribe.write("------------------------------------------REPORTE DE TRANSLADOS-----------------------------------------------" + "\r\n");
            Fescribe.write(columnasB + "\r\n");

            Object file[] = tablaReport(columnasB);
            for (TransAnimalDTO t : HashContenedor.HashD) {
                int id_animal = t.getId_animal();
                String nombre_animal = t.getNombre();
                String tipo = t.getTipo();
                String fecha_salida = new SimpleDateFormat("dd/MM/yyyy").format(t.getFecha_salida());
                String Nombre_zooologico = t.getNombre_zoologico_destino();
                Fescribe.write(id_animal + "\t" + nombre_animal + "\t" + tipo + "\t" + fecha_salida + "\t" + Nombre_zooologico + "\r\n");
                
                file[0] = id_animal;
                file[1] = nombre_animal;
                file[2] = tipo;
                file[3] = fecha_salida;
                file[4] = Nombre_zooologico;
                md.addRow(file);
            }
            Fescribe.close();
        } catch (Exception e) {
        }
    }

    public void reporteAnimalesCantidadTipo() {
        reporte_anumales = new File("src/Excel/Reporte_CaTipo.xls");
        int contAnfibios = 0, CMamiferos = 0, CReptiles = 0, CAves = 0;
        try {
            reporte_anumales.delete();
            reporte_anumales.createNewFile();
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reporte_anumales, true), "utf-8"));
            Fescribe.write("------------------------------------------REPORTE DE CANTIDAD DE ANIMALES POR TIPO-----------------------------------------------" + "\r\n");
            Fescribe.write( columnasC + "\r\n");

            Object file[] = tablaReport(columnasC);
            if (cbejecutar.getSelectedIndex() == 1) {
                for (Entry<Integer, AnimalDTO> animal : animalHash.AnimalMap.entrySet()) {
                    AnimalDTO a = animal.getValue();
                    if (((AnimalDTO) a).getTipo().equals("Anfibios")) {
                        contAnfibios++;
                    }

                    if (((AnimalDTO) a).getTipo().equals("Mamiferos")) {
                        CMamiferos++;
                    }

                    if (((AnimalDTO) a).getTipo().equals("Reptiles")) {
                        CReptiles++;
                    }

                    if (((AnimalDTO) a).getTipo().equals("Aves")) {
                        CAves++;
                    }
                }
            }else{
                for (int i = 0; i < Hash.matrizhash.length; i++) {
                    Object obj = Hash.matrizhash[i];
                    if (obj != null) {
                        if (((AnimalDTO) obj).getTipo().equals("Anfibios")) {
                            contAnfibios++;
                        }

                        if (((AnimalDTO) obj).getTipo().equals("Mamiferos")) {
                            CMamiferos++;
                        }

                        if (((AnimalDTO) obj).getTipo().equals("Reptiles")) {
                            CReptiles++;
                        }

                        if (((AnimalDTO) obj).getTipo().equals("Aves")) {
                            CAves++;
                        }
                    }
                }
            }
            Fescribe.write(contAnfibios + "\t" + CMamiferos + "\t" + CReptiles + "\t" + CAves + "\r\n");
            file[0] = contAnfibios;
            file[1] = CMamiferos;
            file[2] = CReptiles;
            file[3] = CAves;
            md.addRow(file);

            Fescribe.close();
        } catch (Exception e) {
        }
    }

    public void reporteTansladosSegunTipo(String Tipo_d) {
        reporte_anumales = new File("src/Excel/Reporte_Tanslados_tipo.xls");
        try {
            reporte_anumales.delete();
            reporte_anumales.createNewFile();
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reporte_anumales, true), "utf-8"));
            Fescribe.write("------------------------------------------REPORTE DE TRANSLADOS POR TIPO-----------------------------------------------" + "\r\n");
            Fescribe.write( columnasB + "\r\n");

            Object file[] = tablaReport(columnasB);
            for (TransAnimalDTO t : HashContenedor.HashD) {
                if (t.getTipo().equals(Tipo_d)) {
                    int id_animal = t.getId_animal();
                    String nombre_animal = t.getNombre();
                    String tipo = t.getTipo();
                    String fecha_salida = new SimpleDateFormat("dd/MM/yyyy").format(t.getFecha_salida());
                    String Nombre_zooologico = t.getNombre_zoologico_destino();
                    Fescribe.write(id_animal + "\t" + nombre_animal + "\t" + tipo + "\t" + fecha_salida + "\t" + Nombre_zooologico + "\r\n");
                    
                    file[0] = id_animal;
                    file[1] = nombre_animal;
                    file[2] = tipo;
                    file[3] = fecha_salida;
                    file[4] = Nombre_zooologico;
                    md.addRow(file);
                }
            }
            Fescribe.close();
        } catch (Exception e) {
        }
    }

    public String[] buscarResponsables (){
        Map <String,Integer> responsables = new TreeMap<>();
        if (cbejecutar.getSelectedIndex() == 1) {
            for (Entry<Integer, AnimalDTO> animal : animalHash.AnimalMap.entrySet()) {
                int i = 0;
                String nombre_respon = null;
                AnimalDTO a = animal.getValue();
                StringTokenizer tok = new StringTokenizer(a.toString(),"-");
                while (tok.hasMoreTokens()) {  
                    nombre_respon = tok.nextToken();
                }
                responsables.put(nombre_respon, i);
                i++;
            }
        }else{
            for (int i = 0; i < Hash.matrizhash.length; i++) {
                Object obj = Hash.matrizhash[i];
                if (obj != null) {
                    String nombre_respon = ((AnimalDTO) obj).getNombre_responsable();
                    responsables.put(nombre_respon, i);
                }
            }
        }
        String[] nombres = new String[responsables.size()];
        Iterator<String> it = responsables.keySet().iterator();
        int pos = 0;
        while(it.hasNext()){
          nombres[pos] = it.next();
          pos++;
        }
        return nombres;
    }
    
    public void reporteAnimalesPorPersona(String persona) {
        reporte_anumales = new File("src/Excel/Reporte_Animales_persona.xls");
        try {
            reporte_anumales.delete();
            reporte_anumales.createNewFile();
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reporte_anumales, true), "utf-8"));
            Fescribe.write("------------------------------------------REPORTE DE ANIMALES POR PERSONA-----------------------------------------------" + "\r\n");
            Fescribe.write(columnasA + "\r\n");

            Object file[] = tablaReport(columnasA);
            if (cbejecutar.getSelectedIndex() == 1) {
                for (Entry<Integer, AnimalDTO> animal : animalHash.AnimalMap.entrySet()) {
                    int it = 1;
                    file[0] = animal.getKey();
                    AnimalDTO a = animal.getValue();
                    if (persona.equals(((AnimalDTO) a).getNombre_responsable())) {
                        StringTokenizer tok = new StringTokenizer(a.toString(),"-");
                        while (tok.hasMoreTokens()) {  
                            file[it] = tok.nextToken();
                            it++;
                        }
                        Fescribe.write(file[0] + "\t" + file[1] + "\t" + file[2] + "\t" + file[3] + "\t" + file[4] + "\r\n");
                        md.addRow(file);
                    }
                }
            }else{
                for (int i = 0; i < Hash.matrizhash.length; i++) {
                    Object obj = Hash.matrizhash[i];
                    if (obj != null) {
                        if (persona.equals(((AnimalDTO) obj).getNombre_responsable())) {
                            int id_animal = ((AnimalDTO) obj).getId_animal();
                            String nombre_animal = ((AnimalDTO) obj).getNombre();
                            String tipo = ((AnimalDTO) obj).getTipo();
                            String fecha_entrada = new SimpleDateFormat("dd/MM/yyyy").format(((AnimalDTO) obj).getFecha_entrada());
                            String nombre_respon = ((AnimalDTO) obj).getNombre_responsable();
                            Fescribe.write(id_animal + "\t" + nombre_animal + "\t" + tipo + "\t" + fecha_entrada + "\t" + nombre_respon + "\r\n");

                            file[0] = id_animal;
                            file[1] = nombre_animal;
                            file[2] = tipo;
                            file[3] = fecha_entrada;
                            file[4] = nombre_respon;
                            md.addRow(file);
                        }
                    }
                }
            }
            Fescribe.close();
        } catch (Exception e) {
        }      
    }

    public String[] buscarFechas (){
        Map <String,Integer> fechas = new TreeMap<>();
        int i = 0;
        for (TransAnimalDTO t : HashContenedor.HashD) {
            String fecha_salida = new SimpleDateFormat("dd/MM/yyyy").format(t.getFecha_salida());
            fechas.put(fecha_salida, i);
            i++;
        }
        String[] fs = new String[fechas.size()];
        Iterator<String> it = fechas.keySet().iterator();
        int pos = 0;
        while(it.hasNext()){
          fs[pos] = it.next();
          pos++;
        }
        return fs;
    }
    
    public void reporteTransladosPorFechas(String fecha) {
        reporte_anumales = new File("src/Excel/Reporte_Translados_Fecha.xls");
        try {
            reporte_anumales.delete();
            reporte_anumales.createNewFile();
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reporte_anumales, true), "utf-8"));
            Fescribe.write("------------------------------------------REPORTE DE ANIMALES TRANSLADADOS POR FECHA-----------------------------------------------" + "\r\n");
            Fescribe.write(columnasB + "\r\n");

            Date fechaS = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            Object file[] = tablaReport(columnasB);
            for (TransAnimalDTO t : HashContenedor.HashD) {
                if (t.getFecha_salida().equals(fechaS)) {
                    int id_animal = t.getId_animal();
                    String nombre_animal = t.getNombre();
                    String tipo = t.getTipo();
                    String fecha_salida = new SimpleDateFormat("dd/MM/yyyy").format(t.getFecha_salida());
                    String Nombre_zooologico = t.getNombre_zoologico_destino();
                    Fescribe.write(id_animal + "\t" + nombre_animal + "\t" + tipo + "\t" + fecha_salida + "\t" + Nombre_zooologico + "\r\n");
                    
                    file[0] = id_animal;
                    file[1] = nombre_animal;
                    file[2] = tipo;
                    file[3] = fecha_salida;
                    file[4] = Nombre_zooologico;
                    md.addRow(file);
                }
            }
            Fescribe.close();
        } catch (Exception e) {
        }      
    }
    
}
