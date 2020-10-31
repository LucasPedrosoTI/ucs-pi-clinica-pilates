/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.naming.directory.InvalidAttributeValueException;

import utils.Utils;

public class IMC {

    public static double calcularIMC(String peso, String altura) throws InvalidAttributeValueException {
        try {
            Double pesoDouble = Double.valueOf(peso);
            Double alturaDouble = Double.valueOf(altura);

            return Utils.paraDuasCasasDecimais((pesoDouble / Math.pow(alturaDouble, 2)));
        } catch (Exception e) {
            throw new InvalidAttributeValueException("Peso e Altura devem ser números");
        }

    }

}
