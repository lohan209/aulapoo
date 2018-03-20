
public class Codigo<T> {
	private T codigo;

	public Codigo(T cod){
		codigo = cod;
	}
	
	public T getCodigo() {
		return codigo;
	}

	public void setCodigo(T codigo) {
		this.codigo = codigo;
	}

	//TRANSFORMAR O CODIGO EM STRING PARA JUNTAR NO TOSTRING DE PRODUTOG
	public String toString(){
		return ""+codigo;
		
		
	}

	
}
