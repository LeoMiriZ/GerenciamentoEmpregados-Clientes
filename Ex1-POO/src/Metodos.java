
	import static javax.swing.JOptionPane.showInputDialog;
	import static javax.swing.JOptionPane.showMessageDialog;

import java.util.ArrayList;

	public class Metodos {

		private ArrayList<Pessoa> pessoa = new ArrayList<>();  
		
		public void menu() {

			int aux = 0;

			while (true) {

				aux = Integer.parseInt(showInputDialog(
						"Escolha uma opera��o: \n1. Cadastrar Empregado \n2. Cadastrar Cliente \n3. Pesquisar \n4. Listar Empregados \n 5. Listar Clientes \n6. Remover \n7. Finalizar"));

				if (aux == 1) {

					cadastrarEmpregado();

				} else if (aux == 2) {

					cadastrarCliente();

				} else if (aux == 3) {

					pesquisar();

				} else if (aux == 4) {

					listarEmpregados();

				} else if(aux == 5) {
					
					listarClientes();
					
				} else if (aux == 6) {
					
					remover();
					
				} else if (aux == 7) {
					
					showMessageDialog(null, "Opera��o finalizada com sucesso!");
					break;
					
				} else {
					
					showMessageDialog(null, "Insira uma opera��o v�lida");
					return;
					
				}

			}

		}
		
		public void cadastrarEmpregado() {
			int aux = 0;
			String nome = "", cpf = "", matricula;
			
			
			
			while(aux != 1 && aux != 2) {
			aux = Integer.parseInt(showInputDialog("Digite 1 para Vendedor ou 2 para Gerente."));
			
			if(aux == 1) {
				
				Pessoa vendedor = new Pessoa(nome, cpf);
				
				nome = showInputDialog("Insira seu nome");
				cpf = showInputDialog("Insira seu CPF");
				
				vendedor.setNome(nome);
				vendedor.setCpf(cpf);
				
				showMessageDialog(null, vendedor);
				
				
			}else if (aux == 2) {
				
				Empregado gerente = new Empregado();
				
				nome = showInputDialog("Insira seu nome");
				cpf = showInputDialog("Insira seu CPF");
				
				gerente.setNome(nome);
				gerente.setCpf(cpf);
				
				for (int i = 0; i < gerente.length(); i++) {
					
				}
				
			}else {
				showMessageDialog(null, "Digite um valor valido.");
			}
			}
		}
		
		public void cadastrarCliente() {
			
		}
		
		public void pesquisar() {
			
		}

		public void listarEmpregados() {
			
		}
		
		public void listarClientes() {
			
		}
		
		public void remover() {
			
		}
		
		
	}

