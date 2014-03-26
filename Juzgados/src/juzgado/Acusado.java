package juzgado;

public class Acusado
{
	private String nombre;
	private String delito;
	private Caso caso;
	private Abogado abogado;
	private String sentencia;
	private String dni;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDelito() {
		return delito;
	}
	public void setDelito(String delito) {
		this.delito = delito;
	}
	public Caso getCaso() {
		return caso;
	}
	public void setCaso(Caso caso) {
		this.caso = caso;
	}
	public Abogado getAbogado() {
		return abogado;
	}
	public void setAbogado(Abogado abogado) {
		this.abogado = abogado;
	}
	public String getSentencia() {
		return sentencia;
	}
	public void setSentencia(String sentencia) {
		sentencia = sentencia;
	}
	public Acusado(String nombre, String dni, String delito, Caso caso, Abogado abogado) {
		super();
		this.nombre = nombre;
		this.caso = caso;
		this.abogado = abogado;
		this.dni = dni;		
	}
	
	@Override
	public String toString() {
		return "Acusado [nombre=" + nombre + ", delito=" + delito + ", caso="
				+ caso + ", abogado=" + abogado + ", Sentencia=" + sentencia
				+ "]";
	}
	
	
}
