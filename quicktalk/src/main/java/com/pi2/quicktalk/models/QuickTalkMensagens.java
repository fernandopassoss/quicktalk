package com.pi2.quicktalk.models;

import java.io.Serializable;
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
@Table(name = "mensagens")
public class QuickTalkMensagens implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private Date data_envio;

    @Column(nullable = false)
    private Time horario_envio;

    @Column(nullable = true)
    private Date data_recebimento;

    @Column(nullable = false)
    private Time horario_recebimento;

    @ManyToOne
    @JoinColumn(name = "emissor_id")
    private QuickTalkUsuarios emissor;

    @ManyToOne
    @JoinColumn(name = "receptor_id")
    private QuickTalkUsuarios receptor;

    @Column
    private String status;

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

    public Date getData_recebimento() {
        return data_recebimento;
    }

    public void setData_recebimento(Date data_recebimento) {
        this.data_recebimento = data_recebimento;
    }

    public Time getHorario_recebimento() {
        return horario_recebimento;
    }

    public void setHorario_recebimento(Time horario_recebimento) {
        this.horario_recebimento = horario_recebimento;
    }

    public QuickTalkUsuarios getEmissor() {
        return emissor;
    }

    public void setEmissor(QuickTalkUsuarios emissor) {
        this.emissor = emissor;
    }

    public QuickTalkUsuarios getReceptor() {
        return receptor;
    }

    public void setReceptor(QuickTalkUsuarios receptor) {
        this.receptor = receptor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
