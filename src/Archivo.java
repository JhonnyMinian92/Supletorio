import java.io.*;
import java.util.*;

public class Archivo {
	
	private ObjectOutputStream salida;
	private ObjectInputStream entrada;
	
	public void guardarArchivo(ClaseA e) {

			try {
				salida = new ObjectOutputStream(new FileOutputStream("personas.ser"));
				salida.writeObject(e);
				salida.close();
			} catch (IOException e1) {
				
				System.out.println(e1.getMessage());
			}
			
	}
	
	public ClaseA leerArchivo() {
		ClaseA lista = new ClaseA();
		
		try {
			entrada = new ObjectInputStream(new FileInputStream("personas.ser"));
			lista = (ClaseA)entrada.readObject();
			entrada.close();
		} catch (IOException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return lista;
		
	}

}
