package exercicioAula04;

public class PersistenciaCliente extends Persistencia {
	int prox = 0;
	Cliente[] clientes = new Cliente[10];
		
	@Override
	void insereCliente(Cliente c) {
		clientes[prox] = c;
		prox++;
	}
	
	@Override
	String listar() {
		String textoFormatado = "";
		
		for (int i = 0; i < prox; i++) {
			textoFormatado = textoFormatado + "Código: " + clientes[i].getCodigo() + " Nome" + clientes[i].getNome() + "\n";
		}
		return textoFormatado;
	}
}