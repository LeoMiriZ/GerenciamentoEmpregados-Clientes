import java.util.UUID;

public abstract class Empregado extends Pessoa {
	
	protected String matricula;
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		
		super(nome, cpf);
		
		this.matricula = UUID.randomUUID().toString();
		
	}

}
