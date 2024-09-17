package modelos;

import Repository.FullRepository;
import lists.ProductoList;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> extends Producto {

    protected List<T> listaProductos;
    protected int maximoProductos = 4;

    public BolsaSupermercado(){
        super();
        listaProductos = new ArrayList<>();
    }

    public List<T> getListaProductos(){

        return this.listaProductos;
    }

    public void addProductos(T t){

        if (listaProductos.size() <= maximoProductos){

            listaProductos.add(t);

        }else{

            System.out.println("Bolsa llena");
        }
    }

}
