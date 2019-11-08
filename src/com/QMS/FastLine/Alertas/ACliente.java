/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QMS.FastLine.Alertas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author ONE
 */
public class ACliente {

    public void SomReproduzir(String audio) {

        URL url = ACliente.class.getResource(audio + ".wav");
        AudioClip au = Applet.newAudioClip(url);
        au.play();

    }
}
