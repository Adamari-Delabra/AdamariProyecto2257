
package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;


public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public void guardarEmpleados(ArrayList<Empleado>datos){
        //aqui el codigo para grabar ed Disco Duro
    }
        public ArrayList<Empleado>leerEmpleado(){
          ArrayList<Empleado> tmp=null;
          //leer del disco duro
          //se sube al ArrayListtmp
          return tmp;
        }
}   
       
}


    
