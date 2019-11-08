/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QMS.FastLine.CadastroModelo;

import com.QMS.FastLine.EntidadesDao.Administrador;
import com.QMS.FastLine.EntidadesDao.AdministradorDao;
import com.QMS.FastLine.EntidadesDao.Funcionario;
import com.QMS.FastLine.EntidadesDao.FuncionarioDao;
import com.QMS.FastLine.Telas.AdministradorHome;
import com.QMS.FastLine.Telas.FuncionarioHome;

/**
 *
 * @author ONE
 */
public class LoginSistema {

    public void Login(String usuario, String senha, int codigo) {
        Administrador a = AdministradorDao.getInstance().getById(codigo);

        int i = a.getId();
        String ad = a.getAdministrador();
        String se = a.getSenhaA();

        if (i == codigo && ad.equals(usuario) && se.equals(senha)) {
            FuncionarioHome fh = new FuncionarioHome();
            fh.setVisible(true);
            AdministradorHome af = new AdministradorHome();
            af.setVisible(true);

        }

    }

    public void LoginFuncionario(String usuario, String senha, int codigo) {
        Funcionario f = FuncionarioDao.getInstance().getById(codigo);

        int i = f.getId();
        String ad = f.getFuncionario();
        String se = f.getSenhaF();

        if (i == codigo && ad.equals(usuario) && se.equals(senha)) {
            FuncionarioHome fh = new FuncionarioHome();
            fh.setVisible(true);

        }
    }

}
