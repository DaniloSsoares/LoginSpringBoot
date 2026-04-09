package com.meuprojeto.repository;

import com.meuprojeto.entity.Login;
import com.meuprojeto.repository.adapter.LoginRepositoryAdapter;
import com.meuprojeto.repository.mongo.LoginRepositoryWithMongoDB;
import com.meuprojeto.repository.org.LoginOrmMongo;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

    private final LoginRepositoryWithMongoDB repository;

    public LoginRepositoryImpl(LoginRepositoryWithMongoDB repository) {
        this.repository = repository;
    }

    @Override
    public Login salvar(Login login) {
        LoginOrmMongo orm = LoginRepositoryAdapter.castEntity(login);
        LoginOrmMongo ormSave = repository.save(orm);
        return LoginRepositoryAdapter.castOrm(ormSave);
    }

    @Override
    public String consultar(){
        return "Realizar Login";
    }

    @Override
    public Login atualizar(Login login){
        LoginOrmMongo orm = LoginRepositoryAdapter.castEntity(login);
        LoginOrmMongo ormUpdate = repository.save(orm);
        return LoginRepositoryAdapter.castOrm(ormUpdate);
    }

    @Override
    public void deletar(String id) {
        repository.deleteById(id);
    }


}