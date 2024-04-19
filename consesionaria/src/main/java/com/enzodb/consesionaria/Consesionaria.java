

package com.enzodb.consesionaria;

import com.enzodb.consesionaria.igu.GraficaPrincipal;

public class Consesionaria {

    public static void main(String[] args) {
        //llamar y hacer visible a nuestra IGU
       GraficaPrincipal principal =  new GraficaPrincipal();
       principal.setVisible(true);
       principal.setResizable(false);
       principal.setLocationRelativeTo(null);
    }
}
