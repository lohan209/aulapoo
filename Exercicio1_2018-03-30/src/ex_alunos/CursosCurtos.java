package ex_alunos;

public class CursosCurtos extends Aluno implements Notas {

	int mes;
	double nota, nota2;
	boolean aprovacao;
	
	public CursosCurtos(int m, double n, double n2, int ma, int ano2, String nm2){
		super(ma, ano2, nm2);
		this.mes = m;
		this.nota = n;
		this.nota2 = n2;
	}
	
	public void calcMedia() {
		double nf; 
		
		nf = (this.nota+this.nota2)/2;		
		if(5 <= nf){
			this.aprovacao = true;
		}else{
			this.aprovacao = false;
		}
	}

	public String toString(){
		return "Matrícula: " + matricula + ", Nome: " + nome + ", Aprovação: " + aprovacao;
 	}
	
}
