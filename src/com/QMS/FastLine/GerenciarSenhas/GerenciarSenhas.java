/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QMS.FastLine.GerenciarSenhas;

import com.QMS.FastLine.EntidadesDao.ClienteDao;
import com.QMS.FastLine.EntidadesDao.ClienteDaoPrioritario;
import com.QMS.FastLine.EntidadesDao.ClientePrioritario;
import com.QMS.FastLine.EntidadesDao.Clientes;
import javax.swing.JOptionPane;

/**
 *
 * @author ONE
 */
public class GerenciarSenhas {

    public void SenhaPrioritaria(String senha, int mesaG, String nome, String sobre) {
 
        String cliente = nome + "  " + sobre;

        if (senha.length() != 0 && nome.length() != 0 && nome.length() != 0 && sobre.length() != 0 && mesaG != 0) {
            ClientePrioritario cp = new ClientePrioritario();
            cp.setGuicheMesa(mesaG);
            cp.setCliente(cliente);
            cp.setSenha(senha);
            ClienteDaoPrioritario.getInstance().persist(cp);
            JOptionPane.showMessageDialog(null, "Cliente  cadastrado com susseso !");
        } else {
            JOptionPane.showMessageDialog(null, "Erro campos vazios ou id incorreto !");
        }

    }

    public void Senhaspadrao(String senha, int mesaG, String nome, String sobre) {

        String cliente = nome + "  " + sobre;

        if (senha.length() != 0 && nome.length() != 0 && nome.length() != 0 && sobre.length() != 0 && mesaG != 0) {
            Clientes c = new Clientes();
            c.setGuicheMesa(mesaG);
            c.setCliente(cliente);
            c.setSenha(senha);
            ClienteDao.getInstance().persist(c);
            JOptionPane.showMessageDialog(null, "Cliente  cadastrado com susseso !");
        } else {
            JOptionPane.showMessageDialog(null, "Erro campos vazios ou id incorreto !");
        }
    }
}
