package com.meuprojeto.entity;

import java.util.List;

public record Login(
        String id,
        String username,
        String email,
        String password,
        List<String> roles
){
}
