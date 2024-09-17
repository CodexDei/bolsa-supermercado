package Repository;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> ordenarLista(String campo, Direccion direccion);

}
