package ex_imovel;

public class Localizacao {
	private String rua;
	private String bairro; 
	private String municipio;
	private int numero;
	
	public Localizacao(String r, String b, String m, int n){
		this.rua = r;
		this.bairro = b;
		this.municipio = m;
		this.numero = n;
		
	}
	
	public Localizacao(){
		this.rua = "Insira uma rua";
		this.bairro = "Insira um bairro";
		this.municipio = "Insiria um municipio";
		this.numero = 0;
		}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString(){
		return "\nRua:" + rua + ", Bairro:" + bairro +", Munícipio:" + municipio + "Número:" + numero;
 	}
	
}
