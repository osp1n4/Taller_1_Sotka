
package Creacion_de_Clase;
/**
 * Clase Fruta
 * Contiene informacion de cada fruta
 * @author NEVARDO ANTONIO OSPINA ZUÑIGA
 */
public class Fruta {

    //Atributos de nuestra 
    /**
     * Nombre de la Fruta
     */
    String name;
    /**
     * Peso promedio de la Fruta
     */
    float averageWight;
    /**
     * Devuelve el nombre de la fruta
     * @return nombre de la fruta
     */
    public String getName() {
        return name;
    }
    /**
     * Modifica el nombre de la fruta
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Color de la Fruta
     */
    private arrayList<String> colors;
   
    /**
     * Método accesor del atributo colors (colores de la fruta).
     * @param colors 
     */

    public void getColors(arrayList<String> colors) {
        this.colors = colors;
    }
    /**
     * Clase arrayList para obtener el listado de los colores
     * @param <T> 
     */

    private static class arrayList<T> {

        public arrayList() {
        }
    }

}
