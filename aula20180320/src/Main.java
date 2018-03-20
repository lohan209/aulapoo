import java.util.Random;

import javax.swing.JOptionPane;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letrasCod, letrasCod2, letrasCod3;
		int b;
		String juntaLetras;
		char[] letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		StringBuilder sb = new StringBuilder();
		
		Random random = new Random();
		
	// JUNTAR CARACTERES PARA FORMAR STRINGS	
		b = random.nextInt(letras.length);
		letrasCod = (letras [b]);
		sb.append(letrasCod);
		
		b = random.nextInt(letras.length);
		letrasCod2 = (letras [b]);
		sb.append(letrasCod2);
		
		b = random.nextInt(letras.length);
		letrasCod3 = (letras [b]);
		sb.append(letrasCod3);

		juntaLetras = sb.toString();		
		
	// FAZER CÓDIGO ALEATÓRIO PARA PRODUTO
		Codigo<Integer> p1 = new Codigo<Integer>(random.nextInt(999));
		Codigo<String> p2 = new Codigo<String>(juntaLetras+p1);
	
	//VALOR DO PRODUTO
		ValorM preco = new ValorM(25.0);
		
	//CRIAR O PRODUTO G COM CÓDIGO ALEATÓRIO
		ProdutoG<String> produto = new ProdutoG(p2, "Bola de futevôlei", preco, "200g");
		ProdutoG<String> produto2 = new ProdutoG(p2, "Bola de futevôlei", preco, 200+"g");

		System.out.println(produto);		
		
		System.out.println(produto2);		
	
	 
		
	}

}
