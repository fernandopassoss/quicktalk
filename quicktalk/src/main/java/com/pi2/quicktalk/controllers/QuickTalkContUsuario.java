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

    @GetMapping("/get")
    Iterable<QuickTalkUsuarios> getUsuarios() {
        return quickTalkRepUsuario.findAll();
    }

    @GetMapping("/get/{id}")
    QuickTalkUsuarios getUsuarioByID(@PathVariable int id) {
        Long longID = Long.valueOf(id);
        Optional<QuickTalkUsuarios> result = quickTalkRepUsuario.findById(longID);
        return !result.isPresent() ? null : result.get();
    }

    @PostMapping("/post")
    QuickTalkUsuarios novoUsuario(@RequestBody QuickTalkUsuarios usuario) {
        QuickTalkUsuarios novoUsuario = quickTalkRepUsuario.save(usuario);
        return novoUsuario;
    }

    @DeleteMapping("delete/{id}")
    QuickTalkUsuarios deleteUsuarioByID(@PathVariable int id) {
        Long longID = Long.valueOf(id);
        quickTalkRepUsuario.deleteById(longID);
        Optional<QuickTalkUsuarios> result = quickTalkRepUsuario.findById(longID);
        return !result.isPresent() ? null : result.get();
    }

    @PutMapping("/put/{id}")
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

}
