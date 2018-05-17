import java.io.Serializable;


public class GuardaTexto implements Serializable{
	String frase_areatexto;
	
	public GuardaTexto(){
		this.frase_areatexto = "";
	}
	
	public GuardaTexto(String f_at){
		setFrase_areatexto(f_at);
	}

	public String getFrase_areatexto() {
		return frase_areatexto;
	}

	public void setFrase_areatexto(String frase_areatexto) {
		this.frase_areatexto = frase_areatexto;
	}
	
	
}
