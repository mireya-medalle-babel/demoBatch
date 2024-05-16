package es.neesis.demospringbatch.model;

public class PersonaBuilder {
	private Integer idPersona;
	private String nombre;
	private String apellido;
	private String dni;

	public PersonaBuilder setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
		return this;
	}

	public PersonaBuilder setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public PersonaBuilder setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	public PersonaBuilder setDni(String dni) {
		this.dni = dni;
		return this;
	}

	public Persona build() {
		return new Persona(idPersona, nombre, apellido, dni);
	}

	private void test(){
		Persona persona1 = new PersonaBuilder()
				.setIdPersona(1)
				.setNombre("Nombre")
				.setDni("DNI")
				.build();

	}
}