package com.meuprojeto.repository.adapter;

import com.meuprojeto.entity.Login;
import com.meuprojeto.repository.LoginRepository;
import com.meuprojeto.repository.org.LoginOrmMongo;

public class LoginRepositoryAdapter{

    private LoginRepositoryAdapter() {
    }

    public static Login castOrm(LoginOrmMongo orm) {
        return new Login(
                orm.id(),
                orm.username(),
                orm.email(),
                orm.password(),
                orm.roles()
        );
    }

    public static LoginOrmMongo castEntity(Login entity) {
        return new LoginOrmMongo(
                entity.id(),
                entity.username(),
                entity.email(),
                entity.password(),
                entity.roles()
        );
    }
}