import javax.swing.JOptionPane;

public class ExercicioCadastro {

	public static void main(String[] args) {

		// Vari�vel apenas para aux�lio na hora do cadastro, onde mostra qual cadastro
		// est� sendo feito no momento
		int numCadastro = 0;

		// Variavel para controle de opcoes
		int opcao = 0;

		// Vari�vel utilizada para determinar o tamanho do array, inicializando em 0
		// pois o usu�rio que ir� determinar a quantidade
		// al�m de ser necess�rio o recebimento de algum valor para iniciar o array de
		// forma externa
		int qtd = 0;

		// Cria��o do array
		String[] nomes = new String[qtd];

		// Criando la�o de repeti��o para que o programa execute enquando "opcao" for
		// zero (avaliado pelo while no fim do c�digo)
		// fazendo com que o usu�rio escolha quando sair
		do {

			// Exibindo "menu" de op��es para usu�rio e j� recebendo a op��o escolhida
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o" + "\n1 - Cadastrar"
					+ "\n2 - Cadastrar e exibir nomes" + "\n3 - Exibir nomes" + "\n4 - Sair do programa"));
			
			
			
			// Inicializando o c�digo principal

			// Condi��o para a primeira op��o selecionada (apenas gravar os nomes no array)
			if (opcao == 1) {

				// Vari�vel para definir o tamanho do array definido pelo usu�rio
				qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?"));

				// Recriando o array para n�o receber o valor 0 determinado externamente no in�cio do c�digo
				// se mantendo intacto com as posi��es definidas dentro deste if
				nomes = new String[qtd];

				// Condi��o para caso entre com valor 0
				while (qtd == 0) {

					// Exibindo mensagem de erro
					JOptionPane.showMessageDialog(null, "Digite uma quantidade maior que 0");
					// Inserindo novamente o valor na vari�vel qtd, onde s� seguir� na execu��o
					// quando for falso na condi��o while (ou seja, maior que 0)
					qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?"));
				}

				// Reiniciando vari�vel para evitar continuidade na contagem caso o usu�rio
				// decida refazer o cadastro sem sair do programa
				numCadastro = 0;

				// Iniciando la�o de repeti��o para percorrer o array
				for (int i = 0; i < nomes.length; i++) {

					// Incrementando a vari�vel numCadastro para mostrar o estado atual do cadastro
					numCadastro++;

					// Recebendo o nome digitado pelo usu�rio e armazenando direto no index do array
					nomes[i] = JOptionPane.showInputDialog("Digite um nome para o " + numCadastro + "� cadastro");

				}
				
				// Repassando valor 0 para se manter dentro da condi��o while determinada no fim do c�digo
				// para que s� saia quando "opcao" for igual a 4
				opcao = 0;
			}

			// Condi��o para a segunda op��o (gravar os nomes imprimindo em seguida)
			if (opcao == 2) {

				// Vari�vel para definir o tamanho do array definido pelo usu�rio
				qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?"));

				// Recriando o array para n�o receber o valor 0 determinado externamente no in�cio do c�digo
				// se mantendo intacto com as posi��es definidas dentro deste if
				nomes = new String[qtd];

				// Condi��o para caso entre com valor 0
				while (qtd == 0) {

					// Exibindo mensagem de erro
					JOptionPane.showMessageDialog(null, "Digite uma quantidade maior que 0");
					// Inserindo novamente o valor na vari�vel qtd, onde s� seguir� na execu��o
					// quando for falso na condi��o while (ou seja, maior que 0)
					qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?"));
				}
				
				// Vari�vel auxiliar para ajudar na exbi��o correta dos nomes, evitando subistitui��o de valores
				String aux = "";
				
				// Reiniciando a vari�vel para 1 para n�o dar continuidade na exibi��o
				numCadastro = 0;
				
				// Percorrendo o array
				for (int i = 0; i < nomes.length; i++) {

					// Incrementando a vari�vel numCadastro para mostrar o estado atual do cadastro
					numCadastro++;

					// Recebendo o nome e armazenando no �ndice do array
					nomes[i] = JOptionPane.showInputDialog("Digite um nome para o " + numCadastro + "� cadastro");
					
					// Passando os valores de cada �ndice do array para a vari�vel aux 
					// assim evitando substitui��o de valores na hora da impress�o
					aux = aux + nomes[i] + "\n";

					// Imprimindo antes de sair do la�o
					System.out.println(nomes[i]);
				}
				JOptionPane.showMessageDialog(null, "Os nomes s�o \n" + aux);

			}

			// Condi��o para a terceira op��o (imprimir os nomes armazenados anteriormente,
			// principalmente para a primeira op��o), usa-se while para voltar no menu desta
			// op��o at� que o usu�rio decida sair
			while (opcao == 3) {

				// Vari�vel auxiliar para ajudar na exbi��o correta dos nomes, evitando subistitui��o de valores
				String aux = "";

				// Vari�vel perguntando e j� recebendo um valor para crai��o do menu da op��o 3
				int opcaoPara3 = Integer.parseInt(JOptionPane.showInputDialog(
						"Deseja exibir os nomes: \n1- No console\n2- Em modo janela\n3- Em ambos\n4- Voltar"));

				// Percorrendo o array
				if (opcaoPara3 == 1) {
					for (int i = 0; i < nomes.length; i++) {

						// Exibindo os valores contidos nos �ndices do array
						System.out.println(nomes[i]);
					}

					// Pulando linha para n�o misturar as sa�das no console
					System.out.println("\n");
				}
				// Condi��o caso seja para exbiir em modo janela
				else if (opcaoPara3 == 2) {
					// Percorrendo o array
					for (int i = 0; i < nomes.length; i++) {

						// Vari�vel recebendo ela mesmo e somando com o valor do �ndice do array, com
						// acr�scimo do pulo de linha
						// Aqui a vari�vel recebe-se a si mesmo, para evitar substitui��o de valores,
						// assim mantendo intacto o array
						aux = aux + nomes[i] + "\n";

					}
					// Exibindo em janela a lista de nomes com aux�lio da vari�vel "aux"
					JOptionPane.showMessageDialog(null, "Os nomes s�o \n" + aux);
				}
				// Condi��o para exibir em modo janela e console
				else if (opcaoPara3 == 3) {

					// Percorrendo o array
					for (int i = 0; i < nomes.length; i++) {

						// Vari�vel recebendo ela mesmo e somando com o valor do �ndice do array, com
						// acr�scimo do pulo de linha
						// Aqui a vari�vel recebe-se a si mesmo, para evitar substitui��o de valores,
						// assim mantendo intacto o array
						aux = aux + nomes[i] + "\n";

					}

					// Exibindo no console
					System.out.println(aux);

					// Exibindo em janela
					JOptionPane.showMessageDialog(null, "Os nomes s�o \n" + aux);

				}

				// Condi��o para voltar a tela inicial
				else if (opcaoPara3 == 4) {

					// Vari�vel "opcao" recebe valor 0 para que caia no while (no fim do c�digo)
					// para retornar no in�cio do programa
					opcao = 0;
				}

				// Condi��o com looping para caso digitar valores incorretos
				while (opcaoPara3 < 1 || opcaoPara3 > 4) {

					// Mensagem dizendo erro
					JOptionPane.showMessageDialog(null, "Insira a op��o correta");

					// Pedindo para inserir a op��o correta novamente, e como est� em looping, s�
					// sai quando cair na condi��o do while
					opcaoPara3 = Integer.parseInt(JOptionPane.showInputDialog(
							"Deseja exibir os nomes: \n1- No console\n2- Em modo janela\n3- Em ambos\n4- Voltar"));
				}

			}

			// Condi��o para a quarta op��o (sair do programa)
			if (opcao == 4) {

				// Criando tela de op��o para confirmar sa�da
				int opcaopara4 = Integer
						.parseInt(JOptionPane.showInputDialog("Deseja mesmo sair do programa?" + "\n1 - SIM\n2 - N�O"));

				// Para caso for sair
				if (opcaopara4 == 1) {

					// Classe System seguida do m�todo exit, ambos propriet�rias do Java para for�ar
					// encerramento do programa
					System.exit(0);
				}

				// Para caso n�o for sair
				else if (opcaopara4 == 2) {

					// Rearmazenando o valor 0 para a vari�vel "opcao" para que retorne a tela
					// inicial
					opcao = 0;
				}

				// Criando looping para caso n�o inserir a op��o correta, saindo do la�o somente
				// quando for a op��o correta (1 ou 2)
				while (opcaopara4 < 1 || opcaopara4 > 2) {
					JOptionPane.showMessageDialog(null, "Favor, insira a op��o correta");

					// Reexibindo a mensagem para se manter no looping for�ando a inser��o da op��o
					// correta
					opcaopara4 = Integer.parseInt(
							JOptionPane.showInputDialog("Deseja mesmo sair do programa?" + "\n1 - SIM\n2 - N�O"));
				}
			}

			// condi��o caso o usu�rio n�o escolher as op��es pr� determinadas
			if (opcao > 4) {
				JOptionPane.showMessageDialog(null, "Favor, escolha uma op��o v�lida entre 1 e 4");
			}

			// rearmazenando o valor 0 para a vari�vel "opcao" para se permanecer no while
			opcao = 0;
		}

		// criando looping para retornar ao in�cio (j� que a "opcao" recebeu o valor 0
		// anteriormente), para que saia somente
		// enquanto o usu�rio quiser (digitando 4 e confirmando, pois assim o programa
		// se encerra com o System.exit)
		while (opcao == 0);

	}

}