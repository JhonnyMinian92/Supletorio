import java.io.Serializable;

public class ClaseA extends ClaseAbstracta implements Serializable {

	private String Cedula;
	private String Nombre;
	private String Apellido;
	
	public ClaseA() {
		super("", "", 0.0);
	}
	
	public ClaseA(String cedula, String nombre, String apellido, String situacion, String trabajo, double sueldo) {
		super(situacion, trabajo, sueldo);
		this.Apellido = cedula;
		this.Nombre = nombre;
		this.Apellido = apellido;
	}
	
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public void CambiarApellido(String Apellido) {
		this.setApellido(Apellido);
	}
	
	public String ObtenerDatos() {
		return "Nombre: "+getNombre()+"Apellido: "+getApellido()+"Cedula: "+getCedula()+"";
	}
	
}
