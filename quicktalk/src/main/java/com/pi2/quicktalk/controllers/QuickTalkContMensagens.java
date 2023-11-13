package com.pi2.quicktalk.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi2.quicktalk.models.QuickTalkMensagens;
import com.pi2.quicktalk.models.QuickTalkUsuarios;
import com.pi2.quicktalk.repositories.QuickTalkRepMensagens;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/mensagem")
public class QuickTalkContMensagens {

    @Autowired
    private QuickTalkRepMensagens quickTalkRepMensagens;

    @GetMapping("/get")
    Iterable<QuickTalkMensagens> getMensagens(){
        return quickTalkRepMensagens.findAll();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<QuickTalkMensagens> getMensagemID(@PathVariable int id) {
        Long longID = Long.valueOf(id);
        QuickTalkMensagens result = quickTalkRepMensagens.getReferenceById(longID);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build(); 
        }
    }
    
    @PostMapping("/post")
    QuickTalkMensagens novaMensagem(@RequestBody QuickTalkMensagens mensagem) {
        QuickTalkMensagens novaMensagem = quickTalkRepMensagens.save(mensagem);
        return novaMensagem;
    }
}

