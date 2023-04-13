import java.util.UUID;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.lang.Double;
import java.util.ArrayList;

public class Metodos {

	private ArrayList<Empregado> empregado = new ArrayList<>();
	private ArrayList<Cliente> cliente = new ArrayList<>();

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

				listarEmpregados(empregado);

			} else if (aux == 5) {

				listarClientes(cliente);

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
		String nome = "", cpf = "", matricula = "";

		while (aux != 1 && aux != 2) {
			aux = Integer.parseInt(showInputDialog("Digite 1 para Vendedor ou 2 para Gerente."));

			if (aux == 1) {

				double totalDasVendas = 0, comissao = 0;

				Vendedor vendedor = new Vendedor();

				nome = showInputDialog("Insira seu nome");
				cpf = showInputDialog("Insira seu CPF");
				totalDasVendas = Double.parseDouble(showInputDialog(null, "Insira seu total de vendas"));
				comissao = Double.parseDouble(showInputDialog(null, "Insira sua comissão"));
				matricula = UUID.randomUUID().toString();

				vendedor.setNome(nome);
				vendedor.setCpf(cpf);
				vendedor.setTotalDasVendas(totalDasVendas);
				vendedor.setComissao(comissao);
				vendedor.setMatricula(matricula);
				showMessageDialog(null, vendedor);

				empregado.add(vendedor);
			} else if (aux == 2) {

				double salario = 0, bonus = 0;

				Gerente gerente = new Gerente();

				nome = showInputDialog("Insira seu nome");
				cpf = showInputDialog("Insira seu CPF");
				salario = Double.parseDouble(showInputDialog(null, "Insira seu salário"));
				bonus = Double.parseDouble(showInputDialog(null, "Insira sua bônus"));
				matricula = UUID.randomUUID().toString();

				gerente.setNome(nome);
				gerente.setCpf(cpf);
				gerente.setSalario(salario);
				gerente.setBonus(bonus);
				gerente.setMatricula(matricula);
				showMessageDialog(null, gerente);
				empregado.add(gerente);

			} else {
				showMessageDialog(null, "Digite um valor válido.");
			}
		}
	}

	public void cadastrarCliente() {
		String nome = "", cpf = "";
		double valorDaDivida = 0;
		
		Cliente c = new Cliente();

				nome = showInputDialog("Insira seu nome");
				cpf = showInputDialog("Insira seu CPF");
				valorDaDivida = Double.parseDouble(showInputDialog(null, "Insira seu total de vendas"));
				
				c.setNome(nome);
				c.setCpf(cpf);
				c.setValorDaDivida(valorDaDivida);

				showMessageDialog(null, c);

				cliente.add(c);

	}

	public void pesquisar() {

	}

	public void listarEmpregados(ArrayList<Empregado> empregado) {

		showMessageDialog(null, empregado);

	}

	public void listarClientes(ArrayList<Cliente> cliente) {

		showMessageDialog(null, cliente);

	}

	public void remover() {

	}

}
