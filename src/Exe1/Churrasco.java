package Exe1;

public class Churrasco {
	public double qtdCarne;
	
		public void verificarConsumo(Pessoa p) {
			if (p.idade <= 3 || p.vegetariana == true) {
				this.qtdCarne = qtdCarne =0;
			}
			else if (p.idade >= 4 && p.idade <= 12) {
				this.qtdCarne = qtdCarne +1;
			}
			else if (p.idade > 13) {
				this.qtdCarne = qtdCarne +2;
			}
		
		}
		double getQtdCarne() {
			return this.qtdCarne;
		}
		
}


