/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QMS.FastLine.CadastroModelo;

import com.QMS.FastLine.EntidadesDao.Funcionario;
import com.QMS.FastLine.EntidadesDao.FuncionarioDao;
import com.QMS.FastLine.Telas.FuncioCadastrar;

/**
 *
 * @author ONE
 */
public class CadastroFuncionario {

    public void setfuncionario(int codigo, String usuario, String senha) {

        if (codigo >= 1 && usuario.length() != 0 && senha.length() != 0) {
            Funcionario fu = new Funcionario();
            fu.setId(codigo);
            fu.setFuncionario(usuario);
            fu.setSenhaF(senha);
            FuncionarioDao.getInstance().merge(fu);
            FuncioCadastrar fc = new FuncioCadastrar();
            fc.cadastrado();
        } else {
            FuncioCadastrar fc = new FuncioCadastrar();
            fc.erroCadastrar();
            fc.idErrado();

        }

    }

}
