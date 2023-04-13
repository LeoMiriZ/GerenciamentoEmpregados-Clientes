
public class Vendedor extends Empregado implements Salario {

	private double totalDasVendas;
	private double comissao;

	public Vendedor() {

	}

	public Vendedor(String nome, String cpf, double totalDasVendas, double comissao) {
		super(nome, cpf);

		this.totalDasVendas = totalDasVendas;
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return this.totalDasVendas * this.comissao;
	}

	public double getTotalDasVendas() {
		return totalDasVendas;
	}

	public void setTotalDasVendas(double totalDasVendas) {
		this.totalDasVendas = totalDasVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Pessoa) obj).cpf.equals(this.cpf);
	}

	@Override
	public String toString() {
		return "\nEmpregado(Vendedor) \nNome: " + nome + "\nCPF: " + cpf + "\nTotal de Vendas: " + totalDasVendas
				+ "\nComissão: " + comissao + "\n Matricula: " + matricula + "\n";
	}
}
