package org.garcia.pointerfaces.repositorio;
import org.garcia.pointerfaces.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}