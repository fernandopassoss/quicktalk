package com.pi2.quicktalk.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "membros_grupos")
public class QuickTalkMembrosGrupos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
  
    @ManyToOne
    @JoinColumn(name="usuario_id", nullable = false)
    private QuickTalkUsuarios usuario_id;

    @ManyToOne
    @JoinColumn(name="grupo_id", nullable = false)
    private QuickTalkGrupos grupo_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public QuickTalkUsuarios getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(QuickTalkUsuarios usuario_id) {
        this.usuario_id = usuario_id;
    }

    public QuickTalkGrupos getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(QuickTalkGrupos grupo_id) {
        this.grupo_id = grupo_id;
    }

    
}
