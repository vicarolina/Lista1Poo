package Exe4;

public class Teste {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();

		t1.calcularArea();
		t1.calcularperimetro();

		System.out.println("O resultado do c�lculo da �rea �: " + t1.getArea());
		System.out.println("O resultado do c�lculo do per�metro �: " + t1.getPerimetro());

	}

}
