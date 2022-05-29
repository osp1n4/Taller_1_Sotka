package Creacion_de_Clase;
/**
 * Clase Estudiante que determina ciertas caracterista de ella 
 * @author NEVARDO ANTONIO OSPINA ZUÑIGA
 */

public class Estudiante {
    //Atributo 
    /**
     * numero de cedula del estudiante
     */
    protected int cedula;
    /**
     * nombre del estudiante
     */
    String nombre;
    /**
     * maria inscrita por el estudiante
     */
    String Materia;
    /**
     * nota que lleva por cada materia
     */
    private float nota;
    
    //Metodo de la clase
    /**
     * Devuelve el valor guardado en la variable Cedula
     * @return cedula
     */

    public int getCedula() {
        return cedula;
    }

   /**
    * Devuelve el valor guardado en la variable Nombre

    * @return nombre
    */

    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el valor de la variable Nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     //Metodo privado
    /**
    * Devuelve el valor guardado en la variable Nota

    * @return nota
    */

    private float getNota() {
        return nota;
    }


}
