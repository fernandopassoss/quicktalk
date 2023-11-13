package com.pi2.quicktalk.models;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensagens_grupos")
public class QuickTalkMensagensGrupos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Date data_envio;

    @Column
    private Time horario_envio;

    @ManyToOne
    @JoinColumn(name = "emissor_id", nullable = false)
    private QuickTalkUsuarios emissor;

    @ManyToOne
    @JoinColumn(name = "grupo_id", nullable = false)
    private QuickTalkGrupos grupo;

    @Column
    private String tipo_conteudo;

    @Column
    private String texto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData_envio() {
        return data_envio;
    }

    public void setData_envio(Date data_envio) {
        this.data_envio = data_envio;
    }

    public Time getHorario_envio() {
        return horario_envio;
    }

    public void setHorario_envio(Time horario_envio) {
        this.horario_envio = horario_envio;
    }

    public QuickTalkUsuarios getEmissor() {
        return emissor;
    }

    public void setEmissor(QuickTalkUsuarios emissor) {
        this.emissor = emissor;
    }

    public QuickTalkGrupos getGrupo() {
        return grupo;
    }

    public void setGrupo(QuickTalkGrupos grupo) {
        this.grupo = grupo;
    }

    public String getTipo_conteudo() {
        return tipo_conteudo;
    }

    public void setTipo_conteudo(String tipo_conteudo) {
        this.tipo_conteudo = tipo_conteudo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
