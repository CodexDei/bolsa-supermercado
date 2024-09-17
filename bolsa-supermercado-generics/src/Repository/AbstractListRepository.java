package Repository;

import modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends Producto> implements FullRepository<T> {

    protected List<T> datasource;

    public AbstractListRepository() {

        this.datasource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return this.datasource;
    }

    @Override
    public T buscar(Integer id) {

       T resultado = null;

       for (T elemento : datasource){

           if(elemento.getId() != null && elemento.getId().equals(id)){

               resultado = elemento;
               break;
           }
       }
       return resultado;
    }

    @Override
    public void crear(T t) {

        datasource.add(t);
    }

    @Override
    public void eliminar(Integer id) {

        datasource.remove(id);
    }

    @Override
    public Integer totalRegistros() {

        return datasource.size();
    }
}
