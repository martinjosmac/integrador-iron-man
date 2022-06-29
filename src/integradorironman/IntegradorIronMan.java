/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorironman;

import ServiciosIntegrador.ServiciosIronMan;

public class IntegradorIronMan {

    public static void main(String[] args) {
        ServiciosIronMan im = new ServiciosIronMan();
        
//        int x = (int) (Math.random() * 10 + 1);
//        System.out.println("x"+x);
//        Float x = (float) Math.random();
//3.4028235E38
//        System.out.println(Float.MAX_VALUE-34927.523);
        im.mostraArmaduraIronMan();
        System.out.println("---------------");
//        im.informeBateria();
        
        im.dañosArmadura();

        im.repararDañoBota();

        im.repararDañoConsola();

        im.repararDañoGuantes();
        im.repararDañoSintetizador();
        im.reparacionesBotas();
        im.reparacionesConsola();
        im.reparacionesGuante();
        System.out.println("----");
        im.crearRadar();
        im.destruyendoEnemigos();

    }

}
