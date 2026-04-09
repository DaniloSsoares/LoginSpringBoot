package com.meuprojeto.controller.dto.response;

import java.util.List;

public record LoginResponse(String username, String email, String password, List<String> roles) {}