package entidades;

public class Cliente {
    private int indiceCuenta= 0;
	private String nombre;
	private int edad;
	private Cuenta listaCuentas[]=new Cuenta[10];
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Cliente(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		listaCuentas[indiceCuenta]=cuenta;
		indiceCuenta++;
		
	}
	
	public Cuenta getCuenta(int indice) {
		
		if(listaCuentas.length < indice ) return null;
		else return listaCuentas[indice];
		
		
		
	}
}
