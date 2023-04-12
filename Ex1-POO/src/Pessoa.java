
public class Pessoa {
	
	protected String nome;
	protected String cpf;
	
	
	public Pessoa(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		
		this.nome = nome;
		this.cpf = cpf;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "Nome: " + getNome() + "\n" + "CPF: " + getCpf();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((Pessoa) obj).cpf.equals(this.cpf);
	}

}
