package Exe2;

public class Teste {

	public static void main(String[] args) {
		Lampada lamp= new Lampada();


		for(int x=0; x<25; x++)
		{
		lamp.interruptor();
		System.out.println(lamp.getEstado());
		}

	}

}
