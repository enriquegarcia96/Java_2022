package org.garcia.pointerfaces.repositorio;
import java.util.List;

public interface Crudrepositorio<T> {

    List<T> listar();
    T porId(Integer id);
    void crear(T cliente);
    void editar(T cliente);
    void eliminar(Integer id);
}
