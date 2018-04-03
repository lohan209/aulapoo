package ex_alunos;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<CursosCurtos> curtos = new ArrayList<CursosCurtos>();
		ArrayList<CursosLongos> longos = new ArrayList<CursosLongos>();
		ArrayList<CursosSemestrais> semestrais = new ArrayList<CursosSemestrais>();
		ArrayList<CursosAnuais> anuais = new ArrayList<CursosAnuais>();
		int matricula = 0, ano = 0, mes= 0, i = 0;
		double nota1, nota2, nota3, nota4;
		String nome;
		
		
		while(i == 0){
		//Cadastrar ou visualizar
		UIManager.put("OptionPane.yesButtonText", "Registrar");
		UIManager.put("OptionPane.noButtonText", "Procurar");
		UIManager.put("OptionPane.cancelButtonText", "Cancelar");
		switch(JOptionPane.showConfirmDialog(null, "O que você deseja fazer?")){
		case 0:		
			
		//Selecionar tipo de aluno para Cadastrar
			UIManager.put("OptionPane.yesButtonText", "Curtos/Longos");
			UIManager.put("OptionPane.noButtonText", "Semestrais/Anuais");
			UIManager.put("OptionPane.cancelButtonText", "Cancelar");
			switch(JOptionPane.showConfirmDialog(null, "Qual grupo de cursos deseja cadastrar?")){
				case 0:
					
					UIManager.put("OptionPane.yesButtonText", "Curtos");
					UIManager.put("OptionPane.noButtonText", "Longos");
					UIManager.put("OptionPane.cancelButtonText", "Cancelar");
			
			//=============================================================================================
				//seleção de cursos longos e curtos
					switch(JOptionPane.showConfirmDialog(null, "Curtos ou longos?")){
					
						//CURSO CURTO
						case 0:
							matricula++;
							nome = JOptionPane.showInputDialog("Qual o nome completo do aluno?");
							ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de entrada?"));
							mes = Integer.parseInt(JOptionPane.showInputDialog("Qual o mês de entrada? Apenas número"));
							nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a primeira nota?"));
							nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a segunda nota?"));
							
							CursosCurtos cc = new CursosCurtos(mes, nota1, nota2, matricula, ano, nome);
							
							cc.calcMedia();
							
							curtos.add(cc);
							
							break;
							
						//CURSO LONGO
						case 1:
							matricula++;
							nome = JOptionPane.showInputDialog("Qual o nome completo do aluno?");
							ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de entrada?"));
							nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a primeira nota?"));
							nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a segunda nota?"));
							nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a terceira nota?"));
								
							CursosLongos cl = new CursosLongos(nota1, nota2, nota3, matricula, ano, nome);
							cl.calcMedia();
							
							longos.add(cl);
							
							break;
							
						case 2:
							i=0;
							break;
						
					}
					
					break;
		//===================================================================================================

				
			//****************************************************************************************************
				//Seleção de cursos semestrais e anuais
				case 1: 
					UIManager.put("OptionPane.yesButtonText", "Semestrais");
					UIManager.put("OptionPane.noButtonText", "Anuais");
					UIManager.put("OptionPane.cancelButtonText", "Cancelar");
					
					switch(JOptionPane.showConfirmDialog(null, "Semestrais ou anuais?")){
						
					//CURSOS SEMESTRAIS
						case 0:
							matricula++;
							nome = JOptionPane.showInputDialog("Qual o nome completo do aluno?");
							ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de entrada?"));
							int semestre = Integer.parseInt(JOptionPane.showInputDialog("Qual semestre de entrada? 1 ou 2")); 
							nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a primeira nota?"));
							nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a segunda nota?"));
							nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a terceira nota?"));
								
							CursosSemestrais cs = new CursosSemestrais(nota1, nota2, nota3, semestre, matricula, ano, nome);
							cs.calcMedia();
							
							semestrais.add(cs);
							
							break;
					
					//CURSOS ANUAIS
						case 1:
							matricula++;
							nome = JOptionPane.showInputDialog("Qual o nome completo do aluno?");
							ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de entrada?"));
							nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a primeira nota?"));
							nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a segunda nota?"));
							nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a terceira nota?"));
							nota4 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a quarta nota?"));
	
							
							CursosAnuais ca = new CursosAnuais(nota1, nota2, nota3, nota4, matricula, ano, nome);
							ca.calcMedia();
							
							anuais.add(ca);
							break;
							
						case 2:
							i = 0;
							break;
					}
			//****************************************************************************************************
					break;
					
				//SAIR DO CADASTRO DE USUARIO
				case 2:
					i=0;
				break;
			}
			
			break;
		
		//CONFERIR QUAIS ALUNOS FORAM CADASTRADOS
		case 1:
			UIManager.put("OptionPane.yesButtonText", "Curtos");
			UIManager.put("OptionPane.noButtonText", "Longos");
			UIManager.put("OptionPane.cancelButtonText", "Outros");
			switch(JOptionPane.showConfirmDialog(null, "Qual curso você deseja consultar as médias??")){
			case 0:	
				for(int j = 0; j < curtos.size(); j++){
					JOptionPane.showMessageDialog(null, ""+curtos.get(j));
					System.out.println(curtos.get(j));				}
				break;
				
			case 1:
				for(int j = 0; j < longos.size(); j++){
					JOptionPane.showMessageDialog(null, ""+longos.get(j));
					System.out.println(longos.get(j));
				}
				break;
			
			case 2: 						
				
				UIManager.put("OptionPane.yesButtonText", "Anuais");
				UIManager.put("OptionPane.noButtonText", "Semestrais");
				UIManager.put("OptionPane.cancelButtonText", "Cancelar");
				
				switch(JOptionPane.showConfirmDialog(null, "Qual curso você deseja consultar as médias??")){
				case 0:	
					for(int j = 0; j < anuais.size(); j++){
						JOptionPane.showMessageDialog(null, ""+anuais.get(j));
						System.out.println(anuais.get(j));
					}
					break;
					
				case 1:
					for(int j = 0; j < semestrais.size(); j++){
						JOptionPane.showMessageDialog(null, ""+semestrais.get(j));
						System.out.println(semestrais.get(j));
					}
					break;
				
				case 2: 						
					
					break;
				}			
				
				
				break;
			}			
			
			break;
			
		//SAIR DA APLICAÇÃO
		case 2:
			i = 1;
			JOptionPane.showMessageDialog(null, "Obrigado por testar nosso sistema!");
			break;
		}
	}
}
}
