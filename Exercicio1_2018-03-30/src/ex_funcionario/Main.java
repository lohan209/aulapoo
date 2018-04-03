package ex_funcionario;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import ex_alunos.CursosCurtos;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Fisicas> fisicas = new ArrayList<Fisicas>();
		ArrayList<Juridicas> juridicas = new ArrayList<Juridicas>();
		int codigo=0, horas, i=0; 
		double totalVend;
		String nome, cpf, cnpj;
		
//Cadastrar ou visualizar
		
		while(i != 1){
			UIManager.put("OptionPane.yesButtonText", "Registrar");
			UIManager.put("OptionPane.noButtonText", "Verificar");
			UIManager.put("OptionPane.cancelButtonText", "Cancelar");
			switch(JOptionPane.showConfirmDialog(null, "O que você deseja fazer?")){
			case 0:
				UIManager.put("OptionPane.yesButtonText", "Física");
				UIManager.put("OptionPane.noButtonText", "Jurídica");
				UIManager.put("OptionPane.cancelButtonText", "Cancelar");
				switch(JOptionPane.showConfirmDialog(null, "Qual tipo de pessoas você deseja registrar?")){
				
				case 0:
					codigo +=1;
					nome = JOptionPane.showInputDialog("Qual seu nome?");
					cpf = JOptionPane.showInputDialog("Qual seu CPF?");
					UIManager.put("OptionPane.yesButtonText", "Sim");
					UIManager.put("OptionPane.noButtonText", "Não");
					UIManager.put("OptionPane.cancelButtonText", "Cancelar");
					
					switch(JOptionPane.showConfirmDialog(null, "Você é comissionado?")){
					case 0:
						totalVend = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o total de vendas em reais?"));
						Fisicas f1 = new Fisicas(codigo, nome, cpf, 0, totalVend, true, 0);
						f1.calcSalario();
						fisicas.add(f1);
						break;
						
					case 1: 
						horas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas foram trabalhadas?"));
						Fisicas f2 = new Fisicas(codigo, nome, cpf, horas, 0, false, 15);
						f2.calcSalario();
						fisicas.add(f2);
						System.out.print(f2.salario);
						
						break;
					
					case 2:
						
						break;
					}
					
					
					break;
				case 1:
					codigo += 1;
					nome = JOptionPane.showInputDialog("Qual seu nome?");
					cnpj = JOptionPane.showInputDialog("Qual seu CNPJ?");
					Juridicas j = new Juridicas(codigo, nome, cnpj);
					juridicas.add(j);
					break;
					
				case 2: 
					
					break;
				}
				break;
				
			case 1:
				UIManager.put("OptionPane.yesButtonText", "Físicas");
				UIManager.put("OptionPane.noButtonText", "Juridicas");
				UIManager.put("OptionPane.cancelButtonText", "Cancelar");
				switch(JOptionPane.showConfirmDialog(null, "Qual salarios gostarias de verificar?")){
				case 0:	
					for(int j = 0; j < fisicas.size(); j++){
						JOptionPane.showMessageDialog(null, ""+fisicas.get(j));
						System.out.println(fisicas.get(j));				}
					break;
					
				case 1:
					for(int j = 0; j < juridicas.size(); j++){
						JOptionPane.showMessageDialog(null, ""+juridicas.get(j));
						System.out.println(juridicas.get(j));
					}
					break;
					
				case 2:
					
					break;
				
				}
				break;
				
				
			case 2:
				i =1;
				break;		
			}
		}
	}
}
