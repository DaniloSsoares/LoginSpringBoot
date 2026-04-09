package com.meuprojeto.controller.dto.request;

import java.util.List;

public record LoginRequest(
        String id, String username, String email, String password, List<String> roles) {}
