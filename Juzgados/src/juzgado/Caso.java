package juzgado;

import java.util.ArrayList;

public class Caso {
	private String nombre;
	private Juez juez;
	private String delito;
	private ArrayList<Abogado> abogados;
	private ArrayList<Acusado> acusados;
	private Sala sala;
	private int numAbogados;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Juez getJuez() {
		return juez;
	}

	public void setJuez(Juez juez) {
		this.juez = juez;
	}

	public String getDelito() {
		return delito;
	}

	public void setDelito(String delito) {
		this.delito = delito;
	}

	public ArrayList<Abogado> getAbogado() {
		return abogados;
	}

	public void setAbogado(ArrayList<Abogado> abogado) {
		this.abogados = abogado;
	}

	public ArrayList<Acusado> getAcusado() {
		return acusados;
	}

	public void setAcusado(ArrayList<Acusado> acusado) {
		this.acusados = acusado;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Caso(String nombre, Juez juez, String delito, Sala sala) {
		super();
		this.nombre = nombre;
		this.juez = juez;
		this.delito = delito;
		this.sala = sala;
		this.numAbogados = 0;
	}

	public Caso() {
		super();
		abogados = new ArrayList<>();
		acusados = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Caso [nombre=" + nombre + ", juez=" + juez + ", delito="
				+ delito + ", abogado=" + abogados + ", acusado=" + acusados
				+ ", sala=" + sala + "]";
	}
	public boolean añadirAbogado(int numAbogados, Abogado nou){
		abogados.add(numAbogados, nou);
		numAbogados++;		
				
		return true;
		
		
	}
	
}
