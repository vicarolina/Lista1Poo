package Exe2;

public class Lampada {
	
	int cliques;
	boolean estado;

	void interruptor() {
		
	if(this.cliques<10) {
	this.cliques++;
	mudarEstado();
	}

	else {
	this.estado=false;
	}
	}

	void mudarEstado()
	{
	if(this.estado == true)
	{
	this.estado=false;
	}

	else {
	this.estado=true ;
	}
	}

	boolean getEstado()
	{
	return this.estado;
	}
}
