package com.QMS.FastLine.EntidadesDao;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity

@Table(name = "funcionarios")
public class Funcionario {

    @Id
    private int id;
    @Column
    private String funcionario;
    @Column
    private String senhaF;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getSenhaF() {
        return senhaF;
    }

    public void setSenhaF(String senhaF) {
        this.senhaF = senhaF;
    }

}
