package aula1603;

public class Circulo implements Formasgeometricas{	
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
		this.perimetro = 2*lado*Math.PI;
	}

	public void calcArea(double lado) {
		this.area = Math.PI*lado*lado;
	}
		
}
