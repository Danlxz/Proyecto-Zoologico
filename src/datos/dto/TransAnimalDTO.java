
package datos.dto;

import java.util.Date;

public class TransAnimalDTO {
    
    int id_animal;
    String nombre;
    String tipo;
    Date fecha_salida;
    String nombre_zoologico_destino;

    public TransAnimalDTO(int id_animal, String nombre, String tipo, Date fecha_salida, String nombre_zoologico_destino) {
        this.id_animal = id_animal;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha_salida = fecha_salida;
        this.nombre_zoologico_destino = nombre_zoologico_destino;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getNombre_zoologico_destino() {
        return nombre_zoologico_destino;
    }

    public void setNombre_zoologico_destino(String nombre_zoologico_destino) {
        this.nombre_zoologico_destino = nombre_zoologico_destino;
    }

    @Override
    public String toString(){
        return this.nombre + "-" + this.tipo + "-" + this.fecha_salida + "-" + this.nombre_zoologico_destino;
    }
    
}
