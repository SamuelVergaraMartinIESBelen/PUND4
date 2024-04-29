package pullup;

public class MotorBike extends Vehicle {
	private String matricula;
	private String casco;

	public void start() {
	}

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the casco
     */
    public String getCasco() {
        return casco;
    }

    /**
     * @param casco the casco to set
     */
    public void setCasco(String casco) {
        this.casco = casco;
    }
        
}
