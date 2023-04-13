import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Pessoa {
	
	protected String nome;
	protected String cpf;
	
	private List<Pessoa> pessoas = new ArrayList<>();

	
	public Pessoa(String nome, String cpf) {
		// TODO Auto-generated constructor stub
		
		this.nome = nome;
		this.cpf = cpf;
		
	}

	public Pessoa(){

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
	 
		public List<Pessoa> getPessoa() {
	        return Collections.unmodifiableList(pessoas);
	    }

	    public void addPessoas(Pessoa pessoa) {
	        this.pessoas.add(pessoa);
	    }
	    
	}