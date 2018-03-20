
public class ProdutoG<T> {

	private Codigo codigo;
	private String descricao;
	private ValorM preco;
	private T peso;
	
	public ProdutoG(Codigo cod, String descr, ValorM pr, T p){
		codigo = cod;
		descricao = descr;
		preco = pr;
		peso = p;
	}
	
	public Codigo getCodigo() {return codigo; }
	public String getDescricao(){return descricao; }
	public ValorM getPreco(){ return preco; }
	
	//USA TOSTRING PARA PRINTAR NO SYSTEM OUT PRINT SO USANDO O NOME DA VARIAL PRODUTOG
	public String toString(){
		return "ProdutoG{" + "codigo= " + codigo + ", descrição="+ descricao + ", preço=" + preco + ", peso " + peso + "}";
 	}
	
}
