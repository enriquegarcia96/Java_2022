package org.garcia.pointerfaces.repositorio;

import org.garcia.pointerfaces.modelo.Cliente;

import java.util.List;

public interface Crudrepositorio {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
