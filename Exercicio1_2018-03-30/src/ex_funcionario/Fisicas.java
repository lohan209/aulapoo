package ex_funcionario;

public class Fisicas extends Pessoas{
	String cPF;
	int horas;
	int valorHora;
	double totalVend;
	double comissao;
	boolean comissionado;
	double salario;
	
	public Fisicas(int cod, String name,String cpf, int h, double tv, boolean c2, int vh){
		super(cod, name);
		this.cPF = cpf;
		this.horas = h;
		this.valorHora = vh;
		this.totalVend = tv;
		this.comissao = 0.05;
		this.comissionado = c2;
		this.salario = 1000;
		
	}
	
	public void calcSalario(){
		if(this.totalVend > 0){
			this.salario += this.totalVend*this.comissao;
		}else{
			this.salario = (this.horas * this.valorHora) + this.salario;
		}
	}
	
	public String toString(){
		return "Código: " + codigo + ", Nome: " + nome + ", CPF: " + cPF + ", Salario:" + salario;
 	}
	
}
