package modelos;

import java.util.ArrayList;
import java.util.List;

public class Producto{

    protected String nombre;
    protected Double precio;
    private Integer id;
    private static int ultimoId;


    public Producto() {
    }

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "Id= " + id + " " +
                "Nombre= " + nombre + " " +
                "Precio= " + precio + " ";
    }
}
