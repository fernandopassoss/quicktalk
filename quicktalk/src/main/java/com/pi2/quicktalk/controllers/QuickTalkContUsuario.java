package com.pi2.quicktalk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi2.quicktalk.repositories.QuickTalkRepUsuario;
import com.pi2.quicktalk.models.QuickTalkUsuarios;

import java.util.Optional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/usuario")
public class QuickTalkContUsuario {

    @Autowired
    private QuickTalkRepUsuario quickTalkRepUsuario;

    @GetMapping
    Iterable<QuickTalkUsuarios> getUsuarios() {
        return quickTalkRepUsuario.findAll();
    }


    @GetMapping("/{id}")
    QuickTalkUsuarios getUsuarioByID(@PathVariable int id) {
        Long longID = Long.valueOf(id);
        Optional<QuickTalkUsuarios> result = quickTalkRepUsuario.findById(longID);
        return !result.isPresent() ? null : result.get();
    }

    @PostMapping
    QuickTalkUsuarios novoUsuario(@RequestBody QuickTalkUsuarios usuario) {
        QuickTalkUsuarios novoUsuario = quickTalkRepUsuario.save(usuario);
        return novoUsuario;
    }

    @DeleteMapping("/{id}")
    QuickTalkUsuarios deleteUsuarioByID(@PathVariable int id) {
        Long longID = Long.valueOf(id);
        quickTalkRepUsuario.deleteById(longID);
        Optional<QuickTalkUsuarios> result = quickTalkRepUsuario.findById(longID);
        return !result.isPresent() ? null : result.get();
    }

    @PutMapping("/{id}")
    QuickTalkUsuarios alteraUsuario(@RequestBody QuickTalkUsuarios usuario, @PathVariable int id) {
        Long longID = Long.valueOf(id);
        if (quickTalkRepUsuario.existsById(longID)) {
            usuario.setId(longID);
            QuickTalkUsuarios novoUsuario = quickTalkRepUsuario.save(usuario);
            return novoUsuario;
        } else {
            return null;
        }
    }


    @PostMapping("/login")
    QuickTalkUsuarios loginUsuario(@RequestBody LoginRequest loginRequest) {
        QuickTalkUsuarios usuario = quickTalkRepUsuario.findByEmail(loginRequest.getEmail());
        if (usuario != null && usuario.getSenha().equals(loginRequest.getSenha())) {
            return usuario;
        } else {
            return null;
        }
    }

    static class LoginRequest {
        private String email;
        private String senha;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
    }

}
