public class Gerente extends Empregado implements Bonus{
	
	    private double salario;
	    private double bonus;

	    public Gerente(String nome, String cpf, double salario, double bonus) {
	        super(nome, cpf);

	        this.salario = salario;
	        this.bonus = bonus;
	    }

	    @Override
	    public double calcularBonus() {
	        return this.salario * this.bonus;
	    }

	}
