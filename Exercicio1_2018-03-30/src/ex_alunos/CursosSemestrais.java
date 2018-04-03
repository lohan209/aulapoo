package ex_alunos;

public class CursosSemestrais extends Aluno implements Notas {

	int semestre;
	double nota, nota2, nota3;
	boolean aprovacao;

	public CursosSemestrais(double n, double n2, double n3, int sem, int ma, int ano2, String nm2){
		super(ma, ano2, nm2);
		this.semestre = sem;
		this.nota = n;
		this.nota2 = n2;
		this.nota3 = n3;
	}

	public void calcMedia() {
		double nf;
		
		nf = (this.nota3*0.6)+(this.nota2*0.2)+(this.nota*0.2);

		if(nf >= 6){
			this.aprovacao = true;
		}else{
			this.aprovacao = false;
		}
	}

	
	public String toString(){
		return "Matrícula: " + matricula + ", Nome: " + nome + ", Aprovação: " + aprovacao;
 	}
}
