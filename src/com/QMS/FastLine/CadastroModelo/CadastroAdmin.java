package com.QMS.FastLine.CadastroModelo;

import com.QMS.FastLine.EntidadesDao.AdministradorDao;
import com.QMS.FastLine.EntidadesDao.Administrador;
import com.QMS.FastLine.Telas.JadminCadastrar;

public class CadastroAdmin {

    public void setadmin(int codigo, String usuario, String senha) {

        if (codigo >= 1 && usuario.length() != 0 && senha.length() != 0) {
            Administrador ca = new Administrador();
            ca.setId(codigo);
            ca.setAdministrador(usuario);
            ca.setSenhaA(senha);
            AdministradorDao.getInstance().merge(ca);
            JadminCadastrar jc = new JadminCadastrar();
            jc.cadastrado();
        } else {
            JadminCadastrar jca = new JadminCadastrar();
            jca.erroCadastrar();
            jca.idErrado();
        }

    }

    public void adminDevelomp() {
        Administrador ca = new Administrador();
        ca.setId(54321);
        ca.setAdministrador("root");
        ca.setSenhaA("toor");
        AdministradorDao.getInstance().merge(ca);
    }
}
