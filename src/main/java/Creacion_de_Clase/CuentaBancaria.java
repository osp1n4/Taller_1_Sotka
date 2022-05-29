package Creacion_de_Clase;

/**
 * Clase cuenta bancaria la siguiente clase nos permite
 * determinar si una cuenta se encuentra se encuentrfa activa o desactivada
 * @author NEVARDO ANTONIO OSPINA ZUÑIGA
 */
public class CuentaBancaria {
    //Atributos de nuestra 
    /**
     * Numero de la cuenta
     */
    private int accounNumber;
    /**
     * Estado de la acuenta 
     */
    protected boolean activated;
    /**
     * Método accesor del atributo activado (activada).
     * @return 
     */

    public boolean isActivated() {
        return activated;
    }
    /**
     * Método accesor del atributo activated (activated).
     * @param activated 
     */

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
 
}
