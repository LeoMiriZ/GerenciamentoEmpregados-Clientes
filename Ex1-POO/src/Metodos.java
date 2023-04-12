import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Metodos {

	public void menu() {

		int aux = 0;

		while (true) {

			aux = Integer.parseInt(showInputDialog(
					"Escolha uma operação: \n1. Cadastrar Empregado \n2. Cadastrar Cliente \n3. Pesquisar \n4. Listar Empregados \n 5. Listar Clientes \n6. Remover \n7. Finalizar"));

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
				
				showMessageDialog(null, "Operação finalizada com sucesso!");
				break;
				
			} else {
				
				showMessageDialog(null, "Insira uma operação válida");
				return;
				
			}

		}

	}
	
	

}
