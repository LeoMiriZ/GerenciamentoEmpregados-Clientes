
public class Vendedor extends Empregado implements Salario {

	private double totalDasVendas;
	private double comissao;
	
	public Vendedor(String nome, String cpf, double totalDasVendas, double comissao) {
        super(nome, cpf);
        
        this.totalDasVendas = totalDasVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return this.totalDasVendas * this.comissao;
    }

	
}
