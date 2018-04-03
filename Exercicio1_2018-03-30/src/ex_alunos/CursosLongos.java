package ex_alunos;

public class CursosLongos extends Aluno implements Notas {

	double nota, nota2, nota3;
	boolean aprovacao;
	String conceito;
	
	public CursosLongos(double n, double n2, double n3, int ma, int ano2, String nm2){
		super(ma, ano2, nm2);
		this.nota = n;
		this.nota2 = n2;
		this.nota3 = n3;
	}
	
	public void calcMedia() {
		double nf;
		
		nf = (this.nota + this.nota2 + this.nota3)/3;

		if(nf > 9){
			this.aprovacao = true;
			this.conceito = "A";
		}else if(nf > 7){
			this.aprovacao = true;
			this.conceito = "B";
			
		}else if(nf >= 5){
			this.aprovacao = false;
			this.conceito = "C";
		}else{
			this.conceito = "D";
			this.aprovacao = false;
		}
	}

	public String toString(){
		return "Matrícula: " + matricula + ", Nome: " + nome + ", Conceito: " + conceito + ", Aprovação: " + aprovacao;
 	}
}
