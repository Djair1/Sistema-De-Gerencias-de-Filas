package com.QMS.FastLine.EntidadesDao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "administrador")
public class Administrador implements Serializable {

    @Id
    private int id;
    @Column 
   
    private String administrador;
    @Column
    
    private String senhaA;

    @Column

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getSenhaA() {
        return senhaA;
    }

    public void setSenhaA(String senhaA) {
        this.senhaA = senhaA;
    }

}
