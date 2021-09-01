package entidades;

public class Prog extends Banco{

	
	public static void main(String[] args) {
		var banco= new Banco();
		Cliente c= new Cliente("Juan", 30);
		CajaDeAhorros ca = new CajaDeAhorros(200, 21512,01);
		c.agregarCuenta(ca);
		
		Cuenta aux = null;
		for (int i =0; i < 10; i++) {
			aux= c.getCuenta(i);
			  if(aux.getNom().equals("Caja de Ahorro")) break;
			if(aux==null) break;
		}
      System.out.println("El cliente " + c.getNombre()+ "tiene una caja de Ahorro nro " + aux.nro);
	}
}
