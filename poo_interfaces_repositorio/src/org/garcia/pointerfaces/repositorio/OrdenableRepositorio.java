package org.garcia.pointerfaces.repositorio;

import org.garcia.pointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> listar(String campo, Direccion dir);

}
