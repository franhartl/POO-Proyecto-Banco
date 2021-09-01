package entidades;

public class CuentaCorriente extends Cuenta {
	
	private String nom = "Cuenta Corriente";
	
	 public CuentaCorriente(double saldo, int nro) {
		super(saldo, nro);
		// TODO Auto-generated constructor stub
	}
    @Override
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	 
	
	 

}
