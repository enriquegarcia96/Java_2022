package org.garcia.pointerfaces.repositorio;
import org.garcia.pointerfaces.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
