package Creacion_de_Clase;
/**
 * Clase Moto que determina ciertas caracterista de ella
 * @author NEVARDO ANTONIO OSPINA ZUÑIGA
 */

public class Moto {
    //Atributo de la clase
    /**
     * Color de la moto
     */
    private String color;
    /**
     * Estilo de la moto 
     */
    String estilo;
    /**
     * Potencia de la moto
     */
    private float potencia;
    /**
     * Cilindraje de la moto
     */
    protected float cilindraje;

   //Metodo de la clase
    /**
     * Devuelve el estilo de la moto
     * @return 
     */
    public String getEstilo() {
        return estilo;
    }
    /**
     * Modificador del atributo Estilo
     * @param estilo 
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    //metodo protegido
     /**
      * Devuelve el valor del atributo cilindraje de la moto
      * @return 
      */
    protected float getCilindraje() {
        return cilindraje;
    }
    //metodo protegido
     /**
      * Modifica el valor del atributo cilindraje
      * @param cilindraje 
      */
    protected void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

}
