package pullup;

public class Car extends Vehicle {
	private String matricula;
	private String maletero;
	private boolean isMaleteroAbierto;
	
	public void start() {
	}

	public boolean isTrunkOpen() {
		return isMaleteroAbierto;
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
     * @return the maletero
     */
    public String getMaletero() {
        return maletero;
    }

    /**
     * @param maletero the maletero to set
     */
    public void setMaletero(String maletero) {
        this.maletero = maletero;
    }

    /**
     * @param isMaleteroAbierto the isMaleteroAbierto to set
     */
    public void setIsMaleteroAbierto(boolean isMaleteroAbierto) {
        this.isMaleteroAbierto = isMaleteroAbierto;
    }
        
}
