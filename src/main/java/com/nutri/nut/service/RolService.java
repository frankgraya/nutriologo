package com.nutri.nut.service;

import com.nutri.nut.model.Rol;

import java.util.List;

public interface RolService {

    public Rol crearRol(Rol rol);

    public void borrarRol(long id);

    public List<Rol> listarRols();

    public Rol buscarRolPorID(long id);

    public void modificarRol(Rol rol);
}