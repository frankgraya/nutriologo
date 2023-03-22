package com.nutri.nut.service;

import com.nutri.nut.model.Rol;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RolServiceImpl implements RolService{

    @Override
    public Rol crearRol(Rol rol) {
        log.info("Se crearHumano con exito ");
        return null;
    }

    @Override
    public void borrarRol(long id) {
        log.info("Se crearHumano con exito ");
    }

    @Override
    public List<Rol> listarRols() {
        log.info("Se crearHumano con exito ");
        return null;
    }

    @Override
    public Rol buscarRolPorID(long id) {
        log.info("Se crearHumano con exito ");
        return null;
    }

    @Override
    public void modificarRol(Rol rol) {
        log.info("Se crearHumano con exito ");
    }
}
