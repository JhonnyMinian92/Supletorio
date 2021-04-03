import java.io.Serializable;

public abstract class ClaseAbstracta extends ClaseB implements InterfaceA {

	private String situacion;
	
	public ClaseAbstracta(String situacion, String trabajo, double sueldo) {
		super(trabajo, sueldo);
		this.situacion = situacion;
	}

	public String getSituacion() {
		return situacion;
	}
	
	public abstract String ObtenerDatos();
	
}
