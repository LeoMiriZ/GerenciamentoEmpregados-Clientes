
public class Gerente extends Empregado implements Bonus{
	
	private double salario;
	private double bonus;
	
	public gerente(string nome, string cpf, double salario, double bonus) {
		
		super(nome, cpf);
		
		this.salario = salario;
		this.bonus = bonus;
		
	    }
	@Override
    public double calcularBonus() {
        return this.salario * this.bonus;    
	}
	
	
}
