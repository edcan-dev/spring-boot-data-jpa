package dev.edcan.springboot.app.models.dao;

import dev.edcan.springboot.app.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {
    public List<Cliente> findAll();

    public void save(Cliente cliente);
}
