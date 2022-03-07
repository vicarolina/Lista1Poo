package Exe4;

public class Teste {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();

		t1.calcularArea();
		t1.calcularperimetro();

		System.out.println("O resultado do cálculo da área é: " + t1.getArea());
		System.out.println("O resultado do cálculo do perímetro é: " + t1.getPerimetro());

	}

}
