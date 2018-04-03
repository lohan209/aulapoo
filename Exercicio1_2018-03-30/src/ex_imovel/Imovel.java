package ex_imovel;

public class Imovel {
	
	private int codigo;
	private Localizacao local;
	private int area;
	private double preco;
	
	public Imovel(int cod, Localizacao loc, int are, double prec){
		this.codigo = cod;
		this.local = loc;
		this.area = are;
		this.preco = prec;
	}
	
	public Imovel(){
		this.codigo = 0;
		this.area = 0;
		this.preco = 0;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Localizacao getLocal() {
		return local;
	}
	public void setLocal(Localizacao local) {
		this.local = local;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString(){
		return "\nCodigo= " + codigo + ", Localizaçao:"+ local + ", Área:" + area + ", Preço: " + preco;
 	}
	
}
