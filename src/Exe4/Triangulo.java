package Exe4;

public class Triangulo {
	double lado1;
	double lado2;
	double lado3;
	double area;
	double perimetro;

	public Triangulo() {
	lado1=7;
	lado2=7;
	lado3=7;
	}


	void calcularArea() {
	this.area=lado1*(Math.sqrt(3)/2);

	}

	void calcularperimetro() {

	this.perimetro=lado1*3;
	}

	double getPerimetro() {
	return this.perimetro;
	}

	double getArea() {
	return this.area;
	}
}
