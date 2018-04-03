package ex_alunos;

public class Aluno {
	
	protected int matricula, anoEntrada;
	protected String nome;
	
	public Aluno(int ma, int ano, String nm){

		this.matricula = ma;
		this.anoEntrada = ano;
		this.nome = nm;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getAnoEntrada() {
		return anoEntrada;
	}
	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
