
package datos.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalDTO {
    
    int id_animal;
    String Nombre;
    String tipo;
    Date fecha_entrada;
    String Nombre_responsable;
    
    public AnimalDTO(int id_animal, String Nombre, String tipo, Date fecha_entrada, String Nombre_responsable) {
        this.id_animal = id_animal;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.fecha_entrada = fecha_entrada;
        this.Nombre_responsable = Nombre_responsable;
    }
    
    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getNombre_responsable() {
        return Nombre_responsable;
    }

    public void setNombre_responsable(String Nombre_responsable) {
        this.Nombre_responsable = Nombre_responsable;
    }

    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");

    @Override
    public String toString(){
        return this.Nombre + "-" + this.tipo + "-" + formateador.format(this.fecha_entrada) + "-" + this.Nombre_responsable;
    }
    
}
