package aula1603;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

	public static void main(String[] args) {		
		int n = 1;
		ArrayList<String> listaForma = new ArrayList<String>(); 
		ArrayList<Double> listaArea = new ArrayList<Double>(); 
		ArrayList<Double> listaPer = new ArrayList<Double>(); 
		ArrayList<Double> listaLado = new ArrayList<Double>(); 
		UIManager.put("OptionPane.yesButtonText", "Quadrado");
		UIManager.put("OptionPane.noButtonText", "Retângulo");
		UIManager.put("OptionPane.cancelButtonText", "Círculo");

		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Olá, quantas formas geométrica você deseja criar?"));

		
		
	//AQUI EU INSIRO OS ELEMENTOS QUE SERÃO AVALIADOS
		for(int i = 0; i < quantidade; i++){
			switch(JOptionPane.showConfirmDialog(null, "Qual forma você deseja criar agora?")){
					
					//AQUI É ONDE EU COLETO OS DADOS DO QUADRADO
				case 0 : 
						Quadrado a = new Quadrado();
						double lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor dos lados:"));
						
						a.calcArea(lado);
						a.calcPerimetro(lado);
						a.getArea();
						a.getPerimetro();
						
						listaForma.add(i,"Quadrado");
						listaArea.add(i, a.getArea());
						listaPer.add(i, a.getPerimetro()*2);
						listaLado.add(i, lado);					
				break;
					
					//AQUI É ONDE EU COLETO OS DADOS DO RETANGULO				
				case 1 :
						Retangulo b = new Retangulo();
					
						double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura:"));
						double base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base:"));
						double perRetangulo = base+altura;
						
						b.calcArea(base, altura);
						b.calcPerimetro(perRetangulo);
						b.getArea();
						b.getPerimetro();
						
						listaForma.add(i, "Retângulo");
						listaArea.add(i, b.getArea());
						listaPer.add(i, b.getPerimetro());
						listaLado.add(i, base);						
						
				break;
					//AQUI É ONDE EU COLETO OS DADOS DO CÍRCULOS	
				case 2 : 
						
						Circulo c = new Circulo();
						double raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio:"));
						
						c.calcArea(raio);
						c.calcPerimetro(raio);
	
						
						listaForma.add(i, "Círculo");
						listaArea.add(i, c.getArea());
						listaPer.add(i, c.getPerimetro());
						listaLado.add(i, raio);
						
				break;
	
			}	
		}
		
	
		//AQUI É O SELETOR DO QUE VOCÊ QUER VER
		
		UIManager.put("OptionPane.yesButtonText", "Formas");
		UIManager.put("OptionPane.noButtonText", "Medidas");
		UIManager.put("OptionPane.cancelButtonText", "Sair");
		
		while(n!=0){
			switch(JOptionPane.showConfirmDialog(null, "O que você deseja conferir sobre as formas escolhidas?")){
				case 0:
					JOptionPane.showMessageDialog(null, "As formas geométrica são:" + listaForma);
					
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "As áreas são:" + listaArea);
					JOptionPane.showMessageDialog(null, "Os perímetros são:" + listaPer);
				
					break;
				case 2:
					n=0;
					break;
				}				
		}		
		
	}
}
