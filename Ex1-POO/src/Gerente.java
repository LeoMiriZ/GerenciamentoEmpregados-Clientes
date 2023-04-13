public class Gerente extends Empregado implements Bonus {

	private double salario;
	private double bonus;

	public Gerente() {

	}

	public Gerente(String nome, String cpf, double salario, double bonus) {
		super(nome, cpf);

		this.salario = salario;
		this.bonus = bonus;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public double calcularBonus() {
		return this.salario * this.bonus;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((Pessoa) obj).cpf.equals(this.cpf);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nEmpregado(Gerente) \nNome: " + nome + "\nCPF: " + cpf + "\nSalario: " + salario + "\nBonus: " + bonus + "\nMatricula: " + matricula + "\n";
	}
}
