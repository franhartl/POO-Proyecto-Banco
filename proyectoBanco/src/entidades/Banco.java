package entidades;

public class Banco {

	private Cliente listaClientes[]=new Cliente[1000];
	private int indiceListaCliente = 0;
	
	public void agregarCliente(Cliente cliente) {
		
		listaClientes[indiceListaCliente] = cliente;
		indiceListaCliente++;
		
		
	}
	
	public void quitarUltimoCliente() {
		
		listaClientes[indiceListaCliente--] =null;
		
		
	}
	
}
