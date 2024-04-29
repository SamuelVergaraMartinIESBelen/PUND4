package pullup;
/**
 * 
 * @author Samuel Vergara Martín
 * @version 1.0
 * @since 29-04-2024
 */
public class MotorBike extends Vehicle {
     /**
      * Atributo que indica la matricula del vehiculo
      */
	private String matricula;
        /**
         * Atributo que indica el casco
         */
	private String casco;

        /**
         * Método de inicio
         */
	public void start() {
	}

    /**
     * Método de selección del atributo matrícula
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método de acceso del atrinuto matrícula
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Método de selección del atributo casco
     * @return the casco
     */
    public String getCasco() {
        return casco;
    }

    /**
     * Método de acceso del atributo casco
     * @param casco the casco to set
     */
    public void setCasco(String casco) {
        this.casco = casco;
    }
        
}
