package ex_funcionario;

public class Juridicas extends Pessoas{
	private String cNPJ;

	public Juridicas(int c, String n, String cnpj) {
		super(c, n);
		// TODO Auto-generated constructor stub
		this.cNPJ = cnpj;
		
	}

	
	

	public String getCNPJ() {
		return cNPJ;
	}

	public void setCNPJ(String cNPJ) {
		cNPJ = cNPJ;
	}
	
	public String toString(){
		return "Código: " + codigo + ", Nome: " + nome + ", CNPJ: " + cNPJ;
 	}
	
}
