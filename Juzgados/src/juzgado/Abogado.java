package juzgado;

import java.util.ArrayList;

public class Abogado {

	private String nombre;
	private ArrayList<Caso> casos;
	private int numeroColegiat;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroColegiat() {
		return numeroColegiat;
	}

	public void setNumeroColegiat(int numeroColegiat) {
		this.numeroColegiat = numeroColegiat;
	}

	@Override
	public String toString() {
		return "Abogado [nombre=" + nombre + ", casos=" + casos
				+ ", numeroColegiat=" + numeroColegiat + "]";
	}

	public Abogado(String nombre, int numeroColegiat) {
		super();
		this.nombre = nombre;
		this.numeroColegiat = numeroColegiat;
	}

	public boolean asignarCaso(Caso caso) {
		boolean resultat = false;
		if (!casos.contains(caso)) {
			casos.add(caso);
			resultat = true;
		}
		return resultat;
	}

	public boolean eliminarCaso(Caso caso) {
		boolean resultat = false;
		if (casos.contains(caso)) {
			casos.remove(caso);
			resultat = true;
		}
		return resultat;

	}

}
