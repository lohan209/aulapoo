import java.awt.Component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout.Constraints;

public class Frame extends JFrame implements KeyListener {

	private ArrayList<JLabel> frasesDigitar = new ArrayList<JLabel>();
	private JLabel explicando, frases, espaço, resultado;
	private ArrayList<JButton> tecla = new ArrayList<>();
	private JTextArea areaDigit;
	private FlowLayout tela;
	private Teclado valorTeclado = new Teclado();
	private Color cordoBotão;
	private JButton tentarNov, shiftPress;
	String teclaApertada, teclaSolta;
	int contadorOK=valorTeclado.getTeclado().length;
	int contadorBackspace=0;
	int contadorNOK=0;
	boolean salvaArquivo, teclaInvalida;
	ObjectOutputStream output;
	FileOutputStream arquivoLocal;
	GuardaTexto guardar;
	Random rand = new Random();		
	
	public Frame(){
		super("Curso de digitação");

		//Inicialização do layout
		tela = new FlowLayout();
		setLayout(tela);
		
		//Criando elementos no GUI
		explicando = new JLabel("Escreva as frases abaixo para testar o que você está digitando.");
		
		frasesDigitar.add(new JLabel("Grave e cabisbaixo, o filho justo zelava pela querida mãe doente"));
		frasesDigitar.add(new JLabel("Marta foi à cozinha pois queria ver belo jogo de xícaras"));
		frasesDigitar.add(new JLabel("Gazeta publica hoje breve anúncio de faxina na quermesse"));
		frases = frasesDigitar.get(rand.nextInt(3));
		
		espaço = new JLabel("\n                                         " +
				"");
		
		resultado = new JLabel("");
		
		areaDigit = new JTextArea(8, 65);
		
		tentarNov = new JButton("Tente novamente");
		
		shiftPress = new JButton("Tira Shift");
		//Montando o Layout
		
		add(explicando); //Frase introdutória
		add(espaço); 
		add(frases); //Frase a ser digitada
		add(espaço);
		add(areaDigit);	//Área de digitação
		add(shiftPress);
		
		//Adicionando os botões
		for(int i = 0; i < valorTeclado.getTeclado().length; i++){		
			tecla.add(new JButton(valorTeclado.getTeclado()[i]));
			add(tecla.get(i));
		}
		
		add(resultado); //ADICIONANDO LABEL QUE SERÁ MOSTRADO RESULTADO

		add(tentarNov); // add botando para iniciar novmaente o teste
		add(shiftPress);
		
		//ADICIONANDO POSSIBILIDADE DE EVENTO COM CLICK DO BOTAO
		ButtonHandler handler = new ButtonHandler();
		
		//Ação no botao
		tentarNov.addActionListener(handler);
		tentarNov.setVisible(false);
		
		shiftPress.addActionListener(handler);
		shiftPress.setVisible(false);
		
		//mudando cor do botão para ajeitar meu teclado
		tecla.get(39).setEnabled(false);
		tecla.get(51).setEnabled(false);
		
		//Pegando a cor padrão do botão
		cordoBotão = tecla.get(0).getBackground();
		
		//permite que seja processado eventos do teclado
		areaDigit.addKeyListener(this);

		
		
	}
		
	@Override // trata pressionamento de qualquer tecla
	public void keyPressed(KeyEvent event) {

		//Achando a tecla pressionada		
		teclaApertada = KeyEvent.getKeyText(event.getKeyCode());
		contadorOK = valorTeclado.getTeclado().length;
		
		//Modificando a cor da teclapressionada			
			for(int i = 0; i < valorTeclado.getTeclado().length; i++){
				//contando o backspace
				if(tecla.get(i).getText().equals("Backspace")){
					contadorBackspace++;
				}
				
				if(teclaApertada.equals(tecla.get(i).getText())){
					tecla.get(i).setBackground(Color.GREEN);
					
				}else if(teclaApertada.equals("Period")){
					tecla.get(49).setBackground(Color.GREEN);

				}else if(teclaApertada.equals("Semicolon")){
					tecla.get(38).setBackground(Color.GREEN);

				}else if(teclaApertada.equals("Comma")){
					tecla.get(48).setBackground(Color.GREEN);

				}else if(teclaApertada.equals("Open Bracket")){
					tecla.get(25).setBackground(Color.GREEN);

				}else if(teclaApertada.equals("Close Bracket")){
					tecla.get(26).setBackground(Color.GREEN);

				}else if(teclaApertada.equals("Back Slash")){
					tecla.get(27).setBackground(Color.GREEN);

				}else if(teclaApertada.equals("Minus")){
					tecla.get(11).setBackground(Color.GREEN);

				}
				else if(teclaApertada.equals("Enter")){
					contadorOK = valorTeclado.getTeclado().length;
				}
				else{
					contadorOK--;
				}
				
				//AVISANDO QUE A TECLA DIGITADA É INVÁLIDA
				if(contadorOK == 0){
					areaDigit.setText("Tecla digitada inválida! Clique no botão Tentar novamente para iniciar novamente.");
					areaDigit.setEnabled(false);	
					tentarNov.setVisible(true);
					tentarNov.setBackground(Color.PINK);
				}
			}	
	
		
		//AÇÃO DO BOTÃO ENTER
		String enter = KeyEvent.getKeyText(event.getKeyCode());
		if(enter.equals("Enter")){
			if(areaDigit.getText().equals(frases.getText())){
				resultado.setText("Parabéns, a frase está correta! \n Você apertou "+contadorBackspace+ " vezes o botão para apagar! " +
						"Tente ser mais preciso.");				
			}
			else{
				resultado.setText("A frase está incorreta! Tente novamente.");
				areaDigit.setText("");
			}
						
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
		//fazendo uma string da tecla pressionada
		teclaSolta = KeyEvent.getKeyText(event.getKeyCode());
		
			for(int i = 0; i < valorTeclado.getTeclado().length; i++){		
				if(teclaSolta.equals(tecla.get(i).getText())){
					tecla.get(i).setBackground(cordoBotão);
				}else if(teclaApertada.equals("Period")){
					tecla.get(49).setBackground(cordoBotão);

				}else if(teclaApertada.equals("Semicolon")){
					tecla.get(38).setBackground(cordoBotão);

				}else if(teclaApertada.equals("Comma")){
					tecla.get(48).setBackground(cordoBotão);

				}else if(teclaApertada.equals("Open Bracket")){
					tecla.get(25).setBackground(cordoBotão);

				}else if(teclaApertada.equals("Close Bracket")){
					tecla.get(26).setBackground(cordoBotão);

				}else if(teclaApertada.equals("Back Slash")){
					tecla.get(27).setBackground(cordoBotão);

				}else if(teclaApertada.equals("Minus")){
					tecla.get(11).setBackground(cordoBotão);

				}
			}				
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		
	}
	
	//CLASSE INTERNA PARA TRATAMENTO DO BOTÃO
	public class ButtonHandler implements ActionListener
		{
			//TRATA EVENTO DO BOTÃO
			public void actionPerformed(ActionEvent event)
			{	
					
					areaDigit.setEnabled(true);
					areaDigit.setText("");
					tentarNov.setVisible(false);
					resultado.setText("");
									
			}
		}
	

}
	
	

	