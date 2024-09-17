package lists;

import Repository.AbstractListRepository;
import Repository.Direccion;
import modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoList extends AbstractListRepository<Producto> {


    @Override
    public void editar(Producto producto) {

        Producto p = buscar(producto.getId());
        p.setNombre(producto.getNombre());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> ordenarLista(String campo, Direccion direccion) {

        List<Producto> listaOrdenada = new ArrayList<>(this.datasource);

        listaOrdenada.sort((a,b) ->{

            int resultado = 0;

            if (direccion == Direccion.ASC){

                resultado = ordenar(campo,a,b);

            } if (direccion == Direccion.DESC) {

                resultado = ordenar(campo,b,a);
            }
            return resultado;
        });

        return listaOrdenada;
    }

    public int ordenar(String campo, Producto a, Producto b) {

        int resultado = 0;

        switch (campo){

            case "id" ->

                resultado = a.getId().compareTo(b.getId());

            case "nombre" ->

                resultado = a.getNombre().compareTo(b.getNombre());

            case "precio" ->

                resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
