package com.meuprojeto.repository.mongo;


import com.meuprojeto.repository.org.LoginOrmMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LoginRepositoryWithMongoDB extends MongoRepository<LoginOrmMongo, String> {
}