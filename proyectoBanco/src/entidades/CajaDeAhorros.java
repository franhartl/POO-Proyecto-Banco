package entidades;

public class CajaDeAhorros extends Cuenta {

	private double interes;
	private String nom= "caja de Ahorro";

	public CajaDeAhorros(double saldo, int nro, double interes) {
		super(saldo, nro);
		this.interes = interes;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
@Override
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	
}
