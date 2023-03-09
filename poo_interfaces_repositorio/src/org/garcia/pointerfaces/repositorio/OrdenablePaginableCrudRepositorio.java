package org.garcia.pointerfaces.repositorio;
public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
                                PaginableRepositorio<T>, Crudrepositorio<T>, ContableRepositorio{ }
