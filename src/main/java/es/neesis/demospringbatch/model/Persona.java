package es.neesis.demospringbatch.model;

public class Persona {

	Integer idPersona;
	String nombre;
	String apellido;
	String dni;

	public Persona() {
	}

	public Persona(Integer idPersona, String nombre, String apellido, String dni) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	private void test(){
		Persona persona1 = new Persona();
		persona1.setIdPersona(1);
		persona1.setNombre("Nombre1");
		persona1.setDni("11111111");

		Persona persona2 = new Persona(2, "Nombre2", "Apellido2", "2222222");
	}
}
