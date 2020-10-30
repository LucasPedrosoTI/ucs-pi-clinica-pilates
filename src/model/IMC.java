/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class IMC {

    public static double calcularIMC(String peso, String altura) {
        
        Double pesoDouble = Double.valueOf(peso);
        Double alturaDouble = Double.valueOf(altura);
            
        return pesoDouble / Math.pow(alturaDouble, 2);
    }

}
