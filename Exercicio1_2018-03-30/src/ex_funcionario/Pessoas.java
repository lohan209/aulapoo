package ex_funcionario;

public class Pessoas {

	protected int codigo;
	protected String nome;
	
	public Pessoas(int c, String n){
		this.codigo = c;
		this.nome = n;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
