package com.meuprojeto.controller;

import com.meuprojeto.controller.adapter.LoginControllerAdapter;
import com.meuprojeto.controller.dto.request.LoginRequest;
import com.meuprojeto.controller.dto.response.LoginResponse;
import com.meuprojeto.entity.Login;
import com.meuprojeto.repository.LoginRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {


    public final LoginRepository LoginRepository;

    public LoginController(LoginRepository LoginRepository, LoginRepository loginRepository) {
        this.LoginRepository = loginRepository;
    }

    @PostMapping("/login/salvar")
    public LoginResponse salvar(@RequestBody LoginRequest request) {
        Login login = LoginControllerAdapter.castRequest(request);
        Login loginSalvo = LoginRepository.salvar(login);
        return LoginControllerAdapter.castResponse(loginSalvo);
    }
    @GetMapping("/login/{id}")
    public String pesquisar(@PathVariable String id) {

        String login = LoginRepository.consultar();

        return "Realizar Login";
    }

    @PutMapping("/login/atualizar")
    public LoginResponse atualizar(@RequestBody LoginRequest request) {

        Login login = LoginControllerAdapter.castRequest(request);

        Login loginAtualizado = LoginRepository.atualizar(login);

        return LoginControllerAdapter.castResponse(loginAtualizado);
    }
    // DELETE
    @DeleteMapping("/login/{id}")
    public String deletar(@PathVariable String id) {
        LoginRepository.deletar(id);
        return "Login deletado com sucesso";
    }

}
