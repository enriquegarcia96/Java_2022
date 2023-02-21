package org.garcia.pointerfaces.repositorio;

import org.garcia.pointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}
