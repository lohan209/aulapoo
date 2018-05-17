
public class Teclado {
	 String[] teclado = new String[57];
	
	public Teclado(String[] t1){
		this.teclado = t1;
	}
	
	public Teclado(){
		this.teclado[0] = "~";
		this.teclado[1] = "1";
		this.teclado[2] = "2";
		this.teclado[3] = "3";
		this.teclado[4] = "4";
		this.teclado[5] = "5";
		this.teclado[6] = "6";
		this.teclado[7] = "7";
		this.teclado[8] = "8";
		this.teclado[9] = "9";
		this.teclado[10] = "0";
		this.teclado[11] = "-";
		this.teclado[12] = "+";
		this.teclado[13] = "Backspace";
		this.teclado[14] = "Tab";
		this.teclado[15] = "Q";
		this.teclado[16] = "W";
		this.teclado[17] = "E";
		this.teclado[18] = "R";
		this.teclado[19] = "T";
		this.teclado[20] = "Y";
		this.teclado[21] = "U";
		this.teclado[22] = "I";
		this.teclado[23] = "O";
		this.teclado[24] = "P";
		this.teclado[25] = "[";
		this.teclado[26] = "]";
		this.teclado[27] = "\\";
		this.teclado[28] = "Caps Lock";
		this.teclado[29] = "A";
		this.teclado[30] = "S";
		this.teclado[31] = "D";
		this.teclado[32] = "F";
		this.teclado[33] = "G";
		this.teclado[34] = "H";
		this.teclado[35] = "J";
		this.teclado[36] = "K";
		this.teclado[37] = "L";
		this.teclado[38] = ":";
		this.teclado[39] = "                            ";
		this.teclado[40] = "Shift";
		this.teclado[41] = "Z";
		this.teclado[42] = "X";
		this.teclado[43] = "C";
		this.teclado[44] = "V";
		this.teclado[45] = "B";
		this.teclado[46] = "N";
		this.teclado[47] = "M";
		this.teclado[48] = ",";
		this.teclado[49] = ".";
		this.teclado[50] = "?";
		this.teclado[51] = "                            ";
		this.teclado[52] = "Space";
		this.teclado[53] = "Up";
		this.teclado[54] = "Left";
		this.teclado[55] = "Down";
		this.teclado[56] = "Right";


	}

	public String[] getTeclado() {
		return teclado;
	}

	public void setTeclado(String[] teclado) {
		this.teclado = teclado;
	}
	
	
}
