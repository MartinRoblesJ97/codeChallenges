package codeChallenges;

public class Persona {
	
	//ATRIBUTOS.
	private String nombre;
	private String apellido;
	private int edad;
	private String localidad;
	private boolean programador;
	
	
	//CONSTRUCTOR.
	public Persona(String nombre, String apellido, int edad, String localidad, boolean programador) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.localidad = localidad;
		this.programador = programador;
	}

	
	//GETTERS Y SETTERS
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public boolean isProgramador() {
		return programador;
	}

	public void setProgramador(boolean programador) {
		this.programador = programador;
	}

	
}//CLASS PERSONA
