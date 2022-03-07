package Exe1;

public class Teste {

	public static void main(String[] args) {
		Pessoa x = new Pessoa("Amanda", Sexo.Feminino, 10, false);
		Pessoa y = new Pessoa("Alex", Sexo.Masculino, 25, true);
		Pessoa z = new Pessoa("Vitória", Sexo.Feminino, 23, false);
		
		Churrasco Feriado = new Churrasco();
		
		Feriado.verificarConsumo(x);
		System.out.println("Amanda, de 10 anos, come " +Feriado.getQtdCarne() + "kg de carne.");
		Feriado.verificarConsumo(y);
		System.out.println("Alex, de 25 anos come " + Feriado.getQtdCarne() + "kg de carne.");
		Feriado.verificarConsumo(z);
		System.out.println("Vitória, de 23 anos come " + Feriado.getQtdCarne() + "kg de carne.");
		
		
	}

}
