/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QMS.FastLine.GerenciarSenhas;

import java.util.Random;

/**
 *
 * @author ONE
 */
public class GerarSenhas {

    public void gerarSenhaPadrao(int mesa, String nome, String sobre) {

        int tamanhoSenhaLetras = 2;
        int tamanhoSenhaNumeros = 3;
        String l = "N" + "";
        String n = "";
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] letras = {"A", "B", "C", "D",
            "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
            "X", "Y", "Z"};

        Random ran = new Random();

        for (int i = 0; i < tamanhoSenhaLetras; i++) {
            int a = ran.nextInt(letras.length);
            l += letras[a];
        }
        for (int i = 0; i < tamanhoSenhaNumeros; i++) {
            int a = ran.nextInt(numeros.length);
            n += numeros[a];
        }

        String senha = l + n;

        GerenciarSenhas gerenciar = new GerenciarSenhas();
        gerenciar.Senhaspadrao(senha, mesa,nome, sobre);

    }

    public void GerarSenhasPrioritarias(int mesa, String nome, String sobre) {

        int tamanhoSenhaLetras = 2;
        int tamanhoSenhaNumeros = 3;
        String l = "P" + "";
        String n = "";
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] letras = {"A", "B", "C", "D",
            "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
            "X", "Y", "Z"};

        Random ran = new Random();

        for (int i = 0; i < tamanhoSenhaLetras; i++) {
            int a = ran.nextInt(letras.length);
            l += letras[a];
        }
        for (int i = 0; i < tamanhoSenhaNumeros; i++) {
            int a = ran.nextInt(numeros.length);
            n += numeros[a];
        }
        String senha = l + n;

        GerenciarSenhas gerenciar = new GerenciarSenhas();
        gerenciar.SenhaPrioritaria(senha, mesa,nome, sobre);

    }

}
