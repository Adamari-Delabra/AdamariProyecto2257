/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosb;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author Adamari
 */
public class ConceptosB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miBocho= new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.RED);
        System.out.println(miBocho);
    }
    
}


