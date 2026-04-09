package com.meuprojeto.repository.org;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.util.List;

@Document(value = "Pessoa")
public record LoginOrmMongo(
    @Id
    String id,
    String username,
    String email,
    String password,
    List roles

){}
