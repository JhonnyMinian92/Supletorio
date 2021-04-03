
public class ClaseB implements InterfaceB {

	private String Trabajo;
	private double Sueldo;
	
	public ClaseB(String trabajo, double sueldo) {
		this.Trabajo = trabajo;
		this.Sueldo = sueldo;
	}

	public String getTrabajo() {
		return Trabajo;
	}

	public void setTrabajo(String trabajo) {
		Trabajo = trabajo;
	}

	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}
	
	public void CambiarSueldo(double sueldo) {
		this.setSueldo(sueldo);
	}
	
}