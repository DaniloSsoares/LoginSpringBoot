package com.meuprojeto.controller.adapter;

import com.meuprojeto.controller.dto.request.LoginRequest;
import com.meuprojeto.controller.dto.response.LoginResponse;
import com.meuprojeto.entity.Login;

import java.util.UUID;

public class LoginControllerAdapter {
    public static Login castRequest(LoginRequest request) {
        String id = request.id();

        if (id == null || id.isBlank()) {
            id = UUID.randomUUID().toString();
        }

        return new Login(
                id,
                request.username(),
                request.email(),
                request.password(),
                request.roles()
        );
    }

    public static LoginResponse castResponse(Login login) {
        return new LoginResponse(
                login.id(),
                login.username(),
                login.email(),
                login.roles()
                );
    }
}