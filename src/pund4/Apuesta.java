/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pund4;

/**
 * 
 * @author Samuel Vergara Martín
 * @version 1.0
 * @since 29-04-2024
 */
public class Apuesta {

   /**
    * Método de selección del atributo goles_local
    * @return los goles en local
    */
    public int getGoles_local() {
        return goles_local;
    }

    /**
     * Método de acceso del atributo goles_local
     * @param goles_local El numero de goles en local
     */
    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }

   /**
    * Método de selección del atributo goles_visitante
    * @return Los goles del visitante
    */
    public int getGoles_visitante() {
        return goles_visitante;
    }

    /**
     * Método de acceso del atributo goles_visitante
     * @param goles_visitante El numero de goles del visitante
     */
    public void setGoles_visitante(int goles_visitante) {
        this.goles_visitante = goles_visitante;
    }

    /**
     * Método de selección del atributo apostado
     * @return apostado
     */
    public int getApostado() {
        return apostado;
    }

    /**
     * Método de acceso del atributo apostado
     * @param apostado Apostado
     */
    public void setApostado(int apostado) {
        this.apostado = apostado;
    }

    /**
     * Atributo que indica el dinero diaponible
     */
    private int dinero_disp;
    /**
     * Atributo que indica los goles de local
     */
    private int goles_local;
    /**
     * Atributo que indica los goles de visitante
     */
    private int goles_visitante;
    /**
     * Atributo que indica el dinero apostado
     */
    private int apostado;

    /**
     * Contructor por defecto
     */
    public Apuesta() {
    }

    /**
     * Contructor con parámetros
     * @param dinero_disp Dinero disponible
     * @param goles_local Numero de goles en local
     * @param goles_visitante Numero de goles en visitante
     */
    public Apuesta(int dinero_disp, int goles_local, int goles_visitante) {
        this.dinero_disp = dinero_disp;
        this.goles_local = goles_local;
        this.goles_visitante = goles_visitante;
        this.apostado = 0;
    }
    /**
     * Método para obtener el valor del atributo dinero_disp
     * @return el dinero disponible
     */
    public int getDinero_disp() {
        return dinero_disp;
    }
    /**
     * Método para modificar el valor del atributo dinero_disp
     * @param dinero_disp El dinero disponible
     */
    public void setDinero_disp(int dinero_disp) {
        this.dinero_disp = dinero_disp;
    }

    /**
     * Método para apostar.
     * Permite elegir la cantidad a apostar, no pudiendo ser inferior a 1 ni superior a tu saldo disponible
     * Este método será probado con JUnit
     * @param dinero El dinero a apostar
     * @throws Exception 
     */
    public void apostar(int dinero) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No se puede apostar menos de 1€");
        }

        if (dinero > getDinero_disp()) {
            throw new Exception("No se puede apostar mas de lo que tienes");
        }
        {
            setDinero_disp(dinero - getDinero_disp());
            setApostado(dinero);
        }
    }
    /**
     * Método que comprueba si se ha acertado el resultado del partido
     * En caso de que lo haya acertado devuelve true. Chequea que no se metan menos de 0 goles
     * @param local Numero de goles en local
     * @param visitante Numero de goles del visitante
     * @return El resultado
     * @throws Exception
     */
    public boolean comprobar_resultado(int local, int visitante) throws Exception {
        boolean acertado = false;
        if ((local < 0) || (visitante) < 0) {
            throw new Exception("Un equipo no puede meter menos de 0 goles, por malo que sea");
        }

        if (getGoles_local() == local && getGoles_visitante() == visitante) {
            acertado = true;
        }
        return acertado;
    }
    /** 
     *  Método para cobrar la apuesta.
     * Comprueba que se acertó el resultado y, en ese caso, añade el valor apostado multiplicado por 10
     * al saldo disponible
     * Este método se va a probar con Junit
     * @param cantidad_goles_local Cantidad de goles del local
     * @param cantidad_goles_visit Cantidad de goles del visitante
     * @throws Exception
     */
    void cobrar_apuesta(int cantidad_goles_local, int cantidad_goles_visit) throws Exception {

        if (comprobar_resultado(cantidad_goles_local, cantidad_goles_visit) == false) {
            throw new Exception("No se puede cobrar una apuesta no acertada");
        }
        setDinero_disp(getDinero_disp() * 10);
        
    }
    
}