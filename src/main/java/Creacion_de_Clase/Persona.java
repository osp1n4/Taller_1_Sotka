package Creacion_de_Clase;
/**
 * Importamos la clase java.util.date 
 */
import java.util.Date;
/**
 * Clase persona 
 * Contiene informacion de cada persona
 * @author NEVARDO ANTONIO OSPINA ZUÑIGA
 */
public class Persona {

    //Atributos de nuestra clase
    /**
     * Nombre de la persona
     */
    String name;
    /**
     * Primer Apellido de la persona
     */
    String lastName1;
    /**
     * Segundo apellido de la persona
     */
    String lastName2;
    /**
     * Fecha de nacimien de la persona
     */
    Date dateBirth;
    /**
     * Estatura de la persona
     */
    float height;

    //Metodo publicos
    /**
     * Devuelve el nombre de la persona
     * @return nomble de la persona
     */
    public String getName() {
        return name;
    }
    /**
     * Modifica el nombre de la persona
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }
    /**
     * Devuelve el primer apellido de la persona
     * @return Primer apellido de la persona
     */

    public String getLastName1() {
        return lastName1;
    }
    /**
     * Modifica el primer apellido de la persona
     * @param lastName1
     */

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Devuelve el segundo apellido de la persona
     * @return Segundo apellido de la persona
     */

    public String getLastName2() {
        return lastName2;
    }
    /**
     * Modifica el segundo apellido de la persona
     * @param lastName2 
     */

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Devuelve la fecha de nacimien de la persona
     * @return Fecha de nacimien de la persona
     */

    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * Modifica la fecha de nacimiento de la persona
     * @param dateBirth 
     */

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /**
     * Devuelve la estatura de la persona
     * @return 
     */

    public float getHeight() {
        return height;
    }
    /**
     * Modifica la estatura de la persona
     * @param height 
     */

    public void setHeight(float height) {
        this.height = height;
    }

}
