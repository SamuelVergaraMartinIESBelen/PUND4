package pullup;

/**
 * 
 * @author Samuel Vergara Martín
 * @version 1.0
 * @since 29-04-2024
 */
public class Car extends Vehicle {
        /**
         * Atriubuto que indica la matricula del vehiculo
         */
	private String matricula;
        /**
         * Atriuto que indica el maletero
         */
	private String maletero;
        /**
         * Atributo que indica si el maletero está abierto o cerrado
         */
	private boolean isMaleteroAbierto;
	
        /**
         * Constructor sin parámetros
         */
	public void start() {
	}

        /**
         * Método que devuelve el estado del maletaro
         * @return abierto o cerrado
         */
	public boolean isTrunkOpen() {
		return isMaleteroAbierto;
	}

    /**
     * Método de selección del atributo matricula
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método de acceso del atributo matrícula
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Método de selección del atributo maletero
     * @return the maletero
     */
    public String getMaletero() {
        return maletero;
    }

    /**
     * Método de acceso del atributo de maletero
     * @param maletero the maletero to set
     */
    public void setMaletero(String maletero) {
        this.maletero = maletero;
    }

    /**
     * Método de acceso del atributo isMaleteroAbieeto
     * @param isMaleteroAbierto the isMaleteroAbierto to set
     */
    public void setIsMaleteroAbierto(boolean isMaleteroAbierto) {
        this.isMaleteroAbierto = isMaleteroAbierto;
    }
        
}
