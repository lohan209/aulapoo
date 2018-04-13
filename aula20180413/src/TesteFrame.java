import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class TesteFrame extends JFrame {

	private JLabel label1;
	private JTextField t1, t2, t3;
	private JButton b1;
	private OuvidorTexto handler = new OuvidorTexto();
	private Ouvidor2 handler2 = new Ouvidor2();
	private OuvidorCheck handler3 = new OuvidorCheck();
	private OuvidorRadio handler4 = new OuvidorRadio();
	private JCheckBox bold, italic;
	private JRadioButton boldR, italicR, normalR;
	
	public TesteFrame(){
		super("Meu frame");
		
		
		setLayout(new FlowLayout());
		label1 = new JLabel("Escreva seu nome");
		label1.setToolTipText("Primeiro nome");
		add(label1);
		

		t1 = new JTextField(15);
		add(t1);
		t1.addActionListener(handler2);
		


		
		b1 = new JButton("Clique aqui");
		add(b1);		
		b1.addActionListener(handler);
		
//EXERCÍCIO DE CHECKBOX
		t2 = new JTextField("LOHAN", 20);
		t2.setFont(new Font("Arial", Font.PLAIN, 11));
		t2.setEditable(false);
		add(t2);
		
		//CHECK BOX E LISTENER
		bold= new JCheckBox("Negrito");
		italic = new JCheckBox("Itálico");
		add(bold);
		add(italic);
		bold.addItemListener(handler3);
		italic.addItemListener(handler3);
		
//EXERCÍCIO DE RADIO BUTTON
		
		t3 = new JTextField("Rodrigues", 20);
		t3.setFont(new Font("Arial", Font.PLAIN, 11));
		add(t3);
		
		boldR = new JRadioButton("Negrito");
		italicR = new JRadioButton("Itálico");
		normalR = new JRadioButton("Normal");
		
		add(boldR);
		add(italicR);
		add(normalR);
		
		boldR.addItemListener(handler4);
		italicR.addItemListener(handler4);
		normalR.addItemListener(handler4);
		
		//Quando um botão liga, desliga os outros.
		ButtonGroup grupoRadio = new ButtonGroup();
		grupoRadio.add(boldR);
		grupoRadio.add(italicR);
		grupoRadio.add(normalR);
		
	}
	
	
	
	//MEXENDO COM A AÇÃO A PARTIR DO CLIEQUE DO BOTAO;
	private class OuvidorTexto implements ActionListener{
		public void actionPerformed(ActionEvent e) {			
			JOptionPane.showMessageDialog(TesteFrame.this, String.format("Seu nome é: %s", t1.getText()));
				
		}
	}

	//MEXENDO COM A AÇÃO A PARTIR DO ENTER
	private class Ouvidor2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub	
			String s = "";
			s = String.format("Seu nome é:"+t1.getText(), e.getActionCommand());			
			JOptionPane.showMessageDialog(null, s);
		
		}	
	}

	
//MEXENDO COM O CHECKBOX
	private class OuvidorCheck implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			Font font = null;
			
			if(bold.isSelected() && italic.isSelected()){
				font = new Font("Arial", font.BOLD + font.ITALIC, 14);
			}else if(bold.isSelected()){
				font = new Font("Serif", font.BOLD, 13);
			}else if(italic.isSelected()){
				font = new Font("Courier new", font.ITALIC, 13);
			}else{
				font = new Font("Arial", font.PLAIN, 12);
				
			}
		t2.setFont(font);
			
		}
		
	}
	
	
//MEXENDO COM RADIO BUTTON
	private class OuvidorRadio implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			Font font2 = null;
			
			t3.setText("Silva");
			if(boldR.isSelected()){
				font2 = new Font("Times", Font.BOLD, 15);
			}else if(italicR.isSelected()){
				font2 = new Font("Times", Font.ITALIC, 15);
			}else if(normalR.isSelected()){
				font2 = new Font("Times", Font.PLAIN, 15);
			}
			
			t3.setFont(font2);
		}
		

	}


	
}
