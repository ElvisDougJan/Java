package exercicioAula04;

import javax.swing.JOptionPane;

public class CadastroCliente {

	public static void main(String[] args) {
		
		String menu = "01 - Cadastro\n" + "02 - Imprimir" + "\n03 - Sair do sistema";
		boolean sair = false;
		
		Cliente c;
		PersistenciaCliente pc = new PersistenciaCliente();
		
		while (sair == false) {
			
			int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (op) {
			case 1:
				c = new Cliente();
				c.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um código")));
				c.setNome(JOptionPane.showInputDialog("Insira o nome"));
				pc.insereCliente(c);
				break;

			case 2:
				JOptionPane.showMessageDialog(null, pc.listar());
				break;
			
			case 3:
				JOptionPane.showMessageDialog(null, "Saindo do sistema");
				sair = true;
				break;
			}
		}
				
	}

}