package juzgado;

import java.util.ArrayList;

public class Juzgado
{
	/* Atributos */
	
	private String nombre;
	private ArrayList<Sala> salas;
	private ArrayList<Juez> jueces;
	private ArrayList<Caso> casos;
	private int numSalas;
	private int numJueces;
	private int numCasos;
	
	/* Getters And Setters */
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public ArrayList<Sala> getSalas()
	{
		return salas;
	}
	
	public void setSalas(ArrayList<Sala> salas)
	{
		this.salas = salas;
	}
	
	public ArrayList<Juez> getJueces()
	{
		return jueces;
	}
	
	public void setJueces(ArrayList<Juez> jueces)
	{
		this.jueces = jueces;
	}
	
	public ArrayList<Caso> getCasos()
	{
		return casos;
	}
	
	public void setCasos(ArrayList<Caso> casos)
	{
		this.casos = casos;
	}
	
	/* Constructor 'nombre, numCasos, numJueces, numSalas'*/
	
	public Juzgado(String nombre)
	{
		super();
		this.nombre = nombre;
		this.numCasos = 0;
		this.numJueces = 0;
		this.numSalas = 0;
	}
	
	/* Constructor 'ArrayLists'*/
	
	public Juzgado()
	{
		super();
		salas = new ArrayList();
		jueces = new ArrayList();
		casos = new ArrayList();
	}
	
	/* To String */
	
	@Override
	public String toString()
	{
		return "Juzgado [nombre=" + nombre + ", salas=" + salas + ", jueces="
				+ jueces + ", casos=" + casos + "]";
	}
	
	/* Método afegirJuez */
	
	public boolean afegirJuez(int numJueces, Juez nuevo)
	{
		jueces.add(numJueces, nuevo);
		numJueces++;
		return true;
	}
	
	/* Método eliminarJuez */
	
	public boolean eliminarJuez(int numJueces, Juez juez)
	{
		for(int index = 0; index < numJueces; index++)
		{
			if(jueces.equals(juez))
			{
				//for(int index2 = index; index2 < numJueces; index2++)
					//jueces.set((index2 + 1), juez);
				/////
				numJueces--;
				jueces.remove(numJueces);
				
				return true;
			}
		}
		return false;
	}
	
	/* Método afegirCaso */
	public boolean afegirCaso(int numCasos, Caso nuevo)
	{
		casos.add(numCasos, nuevo);
		numCasos++;
		return true;
	}
	
	/* Método eliminarCaso */
	
	
	
	/* Método afegirSala */
	
	public boolean afegirSala(int numSalas, Sala nuevo)
	{
		salas.add(numSalas, nuevo);
		numSalas++;
		return true;
	}
	
}