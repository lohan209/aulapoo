package aula1603;

public abstract class Quadrilateros implements Formasgeometricas {
	double perimetro;
	double area;
	
	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void calcPerimetro(double lado) {
		//OLHAR PERIMETRO DO RETANGULO
		this.perimetro = (lado*2);
	}

	public void calcArea(double area) {
		 this.area = 0;
		
	}
	
}
