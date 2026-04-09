package com.meuprojeto.repository;

import com.meuprojeto.entity.Login;

import java.util.Optional;

public interface LoginRepository {
    String consultar();
    Login salvar(Login user);
    Login atualizar (Login user);
    void deletar(String id);

}
