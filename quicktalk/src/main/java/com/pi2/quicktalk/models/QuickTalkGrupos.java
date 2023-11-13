package com.pi2.quicktalk.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="grupos")
public class QuickTalkGrupos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = true)
    private String texto;

    @OneToOne
    @JoinColumn(name="administrador_id")
    private QuickTalkUsuarios administrador_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public QuickTalkUsuarios getAdministrador_id() {
        return administrador_id;
    }

    public void setAdministrador_id(QuickTalkUsuarios administrador_id) {
        this.administrador_id = administrador_id;
    }
    
}
