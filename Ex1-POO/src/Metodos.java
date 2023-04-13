import java.util.UUID;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.lang.Double;
import java.util.ArrayList;

public class Metodos {
	private ArrayList<Pessoa> listaPessoa = new ArrayList<>();

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

				pesquisar(listaPessoa);

			} else if (aux == 4) {

				listarEmpregados(listaPessoa);

			} else if (aux == 5) {

				listarClientes(listaPessoa);

			} else if (aux == 6) {

				remover(listaPessoa);

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

				listaPessoa.add(vendedor);
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
				listaPessoa.add(gerente);

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
		valorDaDivida = Double.parseDouble(showInputDialog(null, "Insira seu Valor de dívida"));

		c.setNome(nome);
		c.setCpf(cpf);
		c.setValorDaDivida(valorDaDivida);

		showMessageDialog(null, c);

		listaPessoa.add(c);

	}

	public void pesquisar(ArrayList<Pessoa> pessoas) {

		String pesq = "";
		pesq = showInputDialog(null, "Digite o CPF a ser pesquisado:");
		for (Pessoa pessoa : pessoas) {
			if (pessoa.equals(new Pessoa("", pesq))) {
				showMessageDialog(null, pessoa);

				return;
			}
		}
		showMessageDialog(null, "O CPF digitado não foi encontrado.");

	}

	public void listarEmpregados(ArrayList<Pessoa> pessoas) {

		int size = pessoas.size();

		for (int i = 0; i < size; i++) {
			if (pessoas.get(i) instanceof Empregado) {
				Empregado emp = (Empregado) pessoas.get(i);

				showMessageDialog(null, emp);
			}
		}
		return;

	}

	public void listarClientes(ArrayList<Pessoa> pessoas) {

		int size = pessoas.size();

		for (int i = 0; i < size; i++)
			if (pessoas.get(i) instanceof Cliente) {
				Cliente cli = (Cliente) pessoas.get(i);

				showMessageDialog(null, cli);
			}
		return;

	}

	public void remover(ArrayList<Pessoa> pessoas) {

		String pesq = "";
		pesq = showInputDialog(null, "Digite o CPF a ser deletado:");
		for (Pessoa pessoa : pessoas) {
			if (pessoa.equals(new Pessoa("", pesq))) {

				Pessoa vasco = null;
				vasco = new Pessoa("", pesq);
				pessoas.remove(vasco);

				return;

			}

		}

		showMessageDialog(null, "CPF não encontrado");

	}

}
