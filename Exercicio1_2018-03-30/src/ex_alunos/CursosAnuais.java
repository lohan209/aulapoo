package ex_alunos;

public class CursosAnuais extends Aluno implements Notas {

	double nota, nota2, nota3, nota4;
	boolean aprovacao;
	
	public CursosAnuais(double n, double n2, double n3, double n4, int ma, int ano2, String nm2){
		super(ma, ano2, nm2);
		this.nota = n;
		this.nota2 = n2;
		this.nota3 = n3;
		this.nota4 = n4;
	}
	
	public void calcMedia() {
		double nf;
		
		nf = ((this.nota2 + this.nota4)*0.8 + (this.nota+this.nota3)*0.2)/2;
		
		if(nf >= 7){
			this.aprovacao = true;
		}else{
			this.aprovacao = false;
		}
	}

	
	public String toString(){
		return "Matrícula: " + matricula + ", Nome: " + nome + ", Aprovação: " + aprovacao;
 	}
}
