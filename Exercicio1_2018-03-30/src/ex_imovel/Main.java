package ex_imovel;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Casa> casas = new ArrayList();
		ArrayList<Sitio> sitios= new ArrayList();
		ArrayList<Terreno> terrenos = new ArrayList();

		int n = 0, c1 = 0, t1 = 0, s1= 0;
		
		UIManager.put("OptionPane.yesButtonText", "Registar");
		UIManager.put("OptionPane.noButtonText", "Procurar");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");

		
		while (n != 1){
			UIManager.put("OptionPane.yesButtonText", "Registar");
			UIManager.put("OptionPane.noButtonText", "Procurar");
			UIManager.put("OptionPane.cancelButtonText", "Cancelar");
			//Aqui ele seleciona o que ele quer fazer.
			switch(JOptionPane.showConfirmDialog(null, "O que você deseja fazer?")){
	
			//Aqui ele trabalha com registro das venda		
				case 0: 
					UIManager.put("OptionPane.yesButtonText", "Casa");
					UIManager.put("OptionPane.noButtonText", "Terreno");
					UIManager.put("OptionPane.cancelButtonText", "Sítio");
					switch(JOptionPane.showConfirmDialog(null, "O que você deseja registrar para venda?")){
	
					
					//CASA
						case 0:
							UIManager.put("OptionPane.cancelButtonText", "Cancelar");
	
							c1 += 1;
							
							int codigo = 0+c1*c1;				
							int area =  Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da área"));
							double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do imóvel:"));
							
							String r = JOptionPane.showInputDialog("Qual nome da rua?");
							String b = JOptionPane.showInputDialog("Qual nome do bairro?");
							String m = JOptionPane.showInputDialog("Qual o munícipio?");
							int num =  Integer.parseInt(JOptionPane.showInputDialog("Qual o número do imóvel?"));
	
							Localizacao local = new Localizacao(r,b,m,num);
							
							Casa casa = new Casa(codigo,local,area,preco);
							
							casas.add(casa);
							
							
							break;
					
					//Terreno
						case 1:
							UIManager.put("OptionPane.cancelButtonText", "Cancelar");
							t1 += 1;
							codigo = 0+t1*t1;				
							area =  Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da área"));
							preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do imóvel:"));
							
							r = JOptionPane.showInputDialog("Qual nome da rua?");
							b = JOptionPane.showInputDialog("Qual nome do bairro?");
							m = JOptionPane.showInputDialog("Qual o munícipio?");
							num =  Integer.parseInt(JOptionPane.showInputDialog("Qual o número do imóvel?"));
	
							local = new Localizacao(r,b,m,num);
							
							Terreno terreno = new Terreno(codigo,local,area,preco);
							
							terrenos.add(terreno);
							
							break;
							
					//SITIO
						case 2: 
							UIManager.put("OptionPane.cancelButtonText", "Cancelar");
							s1 += 1;
							codigo = 0+t1*t1;				
							area =  Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da área"));
							preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do imóvel:"));
							
							r = JOptionPane.showInputDialog("Qual nome da rua?");
							b = JOptionPane.showInputDialog("Qual nome do bairro?");
							m = JOptionPane.showInputDialog("Qual o munícipio?");
							num =  Integer.parseInt(JOptionPane.showInputDialog("Qual o número do imóvel?"));
	
							local = new Localizacao(r,b,m,num);
							
							Sitio sitio = new Sitio(codigo,local,area,preco);
							
							sitios.add(sitio);
							
							break;
					}
					
				break;
				
				//Aqui fazer onde ele confere
				case 1:
					UIManager.put("OptionPane.yesButtonText", "Casa");
					UIManager.put("OptionPane.noButtonText", "Terreno");
					UIManager.put("OptionPane.cancelButtonText", "Sítio");
					
					switch(JOptionPane.showConfirmDialog(null, "O que você deseja consultar que está para venda?")){
						case 0:	
							for(int j = 0; j < c1; j++){
								JOptionPane.showMessageDialog(null, ""+casas.get(j));
							}
							break;
							
						case 1:
							for(int j = 0; j < t1; j++){
								JOptionPane.showMessageDialog(null, ""+terrenos.get(j));
							}
							break;
						
						case 2: 						
							for(int j = 0; j < s1; j++){
								JOptionPane.showMessageDialog(null, ""+sitios.get(j));
							}
							break;
						}			
				break;
				
				//Aqui só fecha o programa.
				case 2:
					JOptionPane.showMessageDialog(null, "Obrigado! Tchau tchau");
					n = 1;
				break;
			
			}
		}

	}
}