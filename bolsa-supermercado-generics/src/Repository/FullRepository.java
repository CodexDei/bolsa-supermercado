package Repository;

public interface FullRepository<T> extends CRUDRepository<T>,
        OrdenableRepositorio<T>, ContableRegistros {
}
