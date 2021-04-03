public class Principal {

	public static void main(String[] args) {
		
		ClaseA Persona = new ClaseA("0706323193", "Raul", "Centeno", "Empleado", "Administrador", 700);
		
		Archivo personal = new Archivo();
		personal.guardarArchivo(Persona);
		
		System.out.println("se ha guardado la lista\n");
		
	}

}
