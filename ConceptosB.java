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
        
        
        Automovil miAkura= new Automovil();
        miAkura.setMarca("Akura");
        miAkura.setSubMarca("NSX");
        miAkura.setModelo(2013);
        miAkura.setColor(Color.BLUE );
        System.out.println(miAkura);
        
        
        Automovil miMustang= new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustan");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.YELLOW);
        System.out.println(miMustang);
    }
    
}


