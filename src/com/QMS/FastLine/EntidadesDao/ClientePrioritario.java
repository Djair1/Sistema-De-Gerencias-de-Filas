package com.QMS.FastLine.EntidadesDao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "clientesPrioritarios")
public class ClientePrioritario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String cliente;
    @Column
    private String senha;
    @Column
    private int guicheMesa;

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getGuicheMesa() {
        return guicheMesa;
    }

    public void setGuicheMesa(int guicheMesa) {
        this.guicheMesa = guicheMesa;
    }

}
