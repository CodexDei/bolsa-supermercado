package Repository;

import java.util.List;

public interface CRUDRepository<T>  {

    List<T> listar();
    T buscar(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}
