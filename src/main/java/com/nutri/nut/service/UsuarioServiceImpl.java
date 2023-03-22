package com.nutri.nut.service;


import com.nutri.nut.model.Usuario;
import com.nutri.nut.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void borrarUsuario(long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorID(long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
