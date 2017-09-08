import javax.swing.JOptionPane;

public class ExercicioCadastro {

	public static void main(String[] args) {

		// Variável apenas para auxílio na hora do cadastro, onde mostra qual cadastro
		// está sendo feito no momento
		int numCadastro = 0;

		// Variavel para controle de opcoes
		int opcao = 0;

		// Variável utilizada para determinar o tamanho do array, inicializando em 0
		// pois o usuário que irá determinar a quantidade
		// além de ser necessário o recebimento de algum valor para iniciar o array de
		// forma externa
		int qtd = 0;

		// Criação do array
		String[] nomes = new String[qtd];

		// Criando laço de repetição para que o programa execute enquando "opcao" for
		// zero (avaliado pelo while no fim do código)
		// fazendo com que o usuário escolha quando sair
		do {

			// Exibindo "menu" de opções para usuário e já recebendo a opção escolhida
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção" + "\n1 - Cadastrar"
					+ "\n2 - Cadastrar e exibir nomes" + "\n3 - Exibir nomes" + "\n4 - Sair do programa"));
			
			
			
			// Inicializando o código principal

			// Condição para a primeira opção selecionada (apenas gravar os nomes no array)
			if (opcao == 1) {

				// Variável para definir o tamanho do array definido pelo usuário
				qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?"));

				// Recriando o array para não receber o valor 0 determinado externamente no início do código
				// se mantendo intacto com as posições definidas dentro deste if
				nomes = new String[qtd];

				// Condição para caso entre com valor 0
				while (qtd == 0) {

					// Exibindo mensagem de erro
					JOptionPane.showMessageDialog(null, "Digite uma quantidade maior que 0");
					// Inserindo novamente o valor na variável qtd, onde só seguirá na execução
					// quando for falso na condição while (ou seja, maior que 0)
					qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?"));
				}

				// Reiniciando variável para evitar continuidade na contagem caso o usuário
				// decida refazer o cadastro sem sair do programa
				numCadastro = 0;

				// Iniciando laço de repetição para percorrer o array
				for (int i = 0; i < nomes.length; i++) {

					// Incrementando a variável numCadastro para mostrar o estado atual do cadastro
					numCadastro++;

					// Recebendo o nome digitado pelo usuário e armazenando direto no index do array
					nomes[i] = JOptionPane.showInputDialog("Digite um nome para o " + numCadastro + "° cadastro");

				}
				
				// Repassando valor 0 para se manter dentro da condição while determinada no fim do código
				// para que só saia quando "opcao" for igual a 4
				opcao = 0;
			}

			// Condição para a segunda opção (gravar os nomes imprimindo em seguida)
			if (opcao == 2) {

				// Variável para definir o tamanho do array definido pelo usuário
				qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?"));

				// Recriando o array para não receber o valor 0 determinado externamente no início do código
				// se mantendo intacto com as posições definidas dentro deste if
				nomes = new String[qtd];

				// Condição para caso entre com valor 0
				while (qtd == 0) {

					// Exibindo mensagem de erro
					JOptionPane.showMessageDialog(null, "Digite uma quantidade maior que 0");
					// Inserindo novamente o valor na variável qtd, onde só seguirá na execução
					// quando for falso na condição while (ou seja, maior que 0)
					qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?"));
				}
				
				// Variável auxiliar para ajudar na exbição correta dos nomes, evitando subistituição de valores
				String aux = "";
				
				// Reiniciando a variável para 1 para não dar continuidade na exibição
				numCadastro = 0;
				
				// Percorrendo o array
				for (int i = 0; i < nomes.length; i++) {

					// Incrementando a variável numCadastro para mostrar o estado atual do cadastro
					numCadastro++;

					// Recebendo o nome e armazenando no índice do array
					nomes[i] = JOptionPane.showInputDialog("Digite um nome para o " + numCadastro + "° cadastro");
					
					// Passando os valores de cada índice do array para a variável aux 
					// assim evitando substituição de valores na hora da impressão
					aux = aux + nomes[i] + "\n";

					// Imprimindo antes de sair do laço
					System.out.println(nomes[i]);
				}
				JOptionPane.showMessageDialog(null, "Os nomes são \n" + aux);

			}

			// Condição para a terceira opção (imprimir os nomes armazenados anteriormente,
			// principalmente para a primeira opção), usa-se while para voltar no menu desta
			// opção até que o usuário decida sair
			while (opcao == 3) {

				// Variável auxiliar para ajudar na exbição correta dos nomes, evitando subistituição de valores
				String aux = "";

				// Variável perguntando e já recebendo um valor para craição do menu da opção 3
				int opcaoPara3 = Integer.parseInt(JOptionPane.showInputDialog(
						"Deseja exibir os nomes: \n1- No console\n2- Em modo janela\n3- Em ambos\n4- Voltar"));

				// Percorrendo o array
				if (opcaoPara3 == 1) {
					for (int i = 0; i < nomes.length; i++) {

						// Exibindo os valores contidos nos índices do array
						System.out.println(nomes[i]);
					}

					// Pulando linha para não misturar as saídas no console
					System.out.println("\n");
				}
				// Condição caso seja para exbiir em modo janela
				else if (opcaoPara3 == 2) {
					// Percorrendo o array
					for (int i = 0; i < nomes.length; i++) {

						// Variável recebendo ela mesmo e somando com o valor do índice do array, com
						// acréscimo do pulo de linha
						// Aqui a variável recebe-se a si mesmo, para evitar substituição de valores,
						// assim mantendo intacto o array
						aux = aux + nomes[i] + "\n";

					}
					// Exibindo em janela a lista de nomes com auxílio da variável "aux"
					JOptionPane.showMessageDialog(null, "Os nomes são \n" + aux);
				}
				// Condição para exibir em modo janela e console
				else if (opcaoPara3 == 3) {

					// Percorrendo o array
					for (int i = 0; i < nomes.length; i++) {

						// Variável recebendo ela mesmo e somando com o valor do índice do array, com
						// acréscimo do pulo de linha
						// Aqui a variável recebe-se a si mesmo, para evitar substituição de valores,
						// assim mantendo intacto o array
						aux = aux + nomes[i] + "\n";

					}

					// Exibindo no console
					System.out.println(aux);

					// Exibindo em janela
					JOptionPane.showMessageDialog(null, "Os nomes são \n" + aux);

				}

				// Condição para voltar a tela inicial
				else if (opcaoPara3 == 4) {

					// Variável "opcao" recebe valor 0 para que caia no while (no fim do código)
					// para retornar no início do programa
					opcao = 0;
				}

				// Condição com looping para caso digitar valores incorretos
				while (opcaoPara3 < 1 || opcaoPara3 > 4) {

					// Mensagem dizendo erro
					JOptionPane.showMessageDialog(null, "Insira a opção correta");

					// Pedindo para inserir a opção correta novamente, e como está em looping, só
					// sai quando cair na condição do while
					opcaoPara3 = Integer.parseInt(JOptionPane.showInputDialog(
							"Deseja exibir os nomes: \n1- No console\n2- Em modo janela\n3- Em ambos\n4- Voltar"));
				}

			}

			// Condição para a quarta opção (sair do programa)
			if (opcao == 4) {

				// Criando tela de opção para confirmar saída
				int opcaopara4 = Integer
						.parseInt(JOptionPane.showInputDialog("Deseja mesmo sair do programa?" + "\n1 - SIM\n2 - NÃO"));

				// Para caso for sair
				if (opcaopara4 == 1) {

					// Classe System seguida do método exit, ambos proprietárias do Java para forçar
					// encerramento do programa
					System.exit(0);
				}

				// Para caso não for sair
				else if (opcaopara4 == 2) {

					// Rearmazenando o valor 0 para a variável "opcao" para que retorne a tela
					// inicial
					opcao = 0;
				}

				// Criando looping para caso não inserir a opção correta, saindo do laço somente
				// quando for a opção correta (1 ou 2)
				while (opcaopara4 < 1 || opcaopara4 > 2) {
					JOptionPane.showMessageDialog(null, "Favor, insira a opção correta");

					// Reexibindo a mensagem para se manter no looping forçando a inserção da opção
					// correta
					opcaopara4 = Integer.parseInt(
							JOptionPane.showInputDialog("Deseja mesmo sair do programa?" + "\n1 - SIM\n2 - NÃO"));
				}
			}

			// condição caso o usuário não escolher as opções pré determinadas
			if (opcao > 4) {
				JOptionPane.showMessageDialog(null, "Favor, escolha uma opção válida entre 1 e 4");
			}

			// rearmazenando o valor 0 para a variável "opcao" para se permanecer no while
			opcao = 0;
		}

		// criando looping para retornar ao início (já que a "opcao" recebeu o valor 0
		// anteriormente), para que saia somente
		// enquanto o usuário quiser (digitando 4 e confirmando, pois assim o programa
		// se encerra com o System.exit)
		while (opcao == 0);

	}

}