package com.nutri.nut.service;

import com.nutri.nut.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario crearUsuario(Usuario usuario);

    void borrarUsuario(long id);

    List<Usuario> listarUsuarios();

    Usuario buscarUsuarioPorID(long id);

    void modificarUsuario(Usuario usuario);
}
