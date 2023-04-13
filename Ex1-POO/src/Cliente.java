
public class Cliente extends Pessoa {

	private double valorDaDivida;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, double valorDaDivida) {

		super(nome, cpf);

		this.valorDaDivida = valorDaDivida;
	}

	public double getValorDaDivida() {

		return valorDaDivida;
	}

	public void setValorDaDivida(double valorDaDivida) {

		this.valorDaDivida = valorDaDivida;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Pessoa) obj).cpf.equals(this.cpf);
	}

	@Override
	public String toString() {
		return "\nCliente \nNome: " + nome + "\nCPF: " + cpf + "\nValorDaDívida: " + valorDaDivida + "\n";
	}
}
