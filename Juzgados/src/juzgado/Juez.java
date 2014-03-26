package juzgado;

import java.util.ArrayList;

public class Juez {
	private String nombre;
	private ArrayList<Caso> casos;
	
	
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Caso> getCasos() {
		return casos;
	}
	public void setCasos(ArrayList<Caso> casos) {
		this.casos = casos;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Juez(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	public Juez() {
		super();
		casos = new ArrayList<>();
	}
	@Override
	public String toString() {
		return "Juez [nombre=" + nombre + ", casos=" + casos + "]";
	}
	
	juez= new juezzs rgfuosbgosubdi-nyjñlchlunmxfkcz
	
}
