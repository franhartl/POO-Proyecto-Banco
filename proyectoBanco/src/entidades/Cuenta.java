package entidades;

public abstract class Cuenta {
	
	protected double saldo;
    protected int nro;
    
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public Cuenta(double saldo, int nro) {
		super();
		this.saldo = saldo;
		this.nro = nro;
	}
	public abstract String getNom();
	
	
	

}
