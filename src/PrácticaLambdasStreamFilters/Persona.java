package PrácticaLambdasStreamFilters;

public class Persona {

	public Persona() {
		
	}
	
	public Persona(Integer id,String nombre,String segnombre, String apellido, String segapellido, String genero, Integer dpi, Integer edad, String ciudad ) {
	this.id = id;
	this.nombre = nombre;
	this.segnombre = segnombre;
	this.apellido = apellido;
	this.segapellido = segapellido;
	this.genero = genero;
	this.dpi = dpi;
	this.edad = edad;
	this.ciudad = ciudad;
	}
	
	
	Integer id;
	String nombre;
	String segnombre;
	String apellido;
    String segapellido;
	String genero;
	Integer dpi;
	Integer edad;
	String ciudad;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSegnombre() {
		return segnombre;
	}

	public void setSegnombre(String segnombre) {
		this.segnombre = segnombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSegapellido() {
		return segapellido;
	}

	public void setSegapellido(String segapellido) {
		this.segapellido = segapellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getDpi() {
		return dpi;
	}

	public void setDpi(Integer dpi) {
		this.dpi = dpi;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
}


