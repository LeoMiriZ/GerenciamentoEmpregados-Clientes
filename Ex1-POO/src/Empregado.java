import java.util.UUID;

public abstract class Empregado extends Pessoa {

	protected String matricula;

	public Empregado() {

	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public Empregado(String nome, String cpf) {
		// TODO Auto-generated constructor stub

		super(nome, cpf);

		this.matricula = UUID.randomUUID().toString();

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((Pessoa) obj).cpf.equals(this.cpf);
	}

}
