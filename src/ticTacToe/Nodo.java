package ticTacToe;

public class Nodo {
	int dato;
	Nodo Arriba, Abajo, Derecha, Izquierda;
	
	public Nodo()
	{
		 	dato=0;
		 	Izquierda= null;
			Derecha= null;
			Arriba= null;
			Abajo= null;
	}
	

	/*get y set*/
	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getArriba() {
		return Arriba;
	}

	public void setArriba(Nodo arriba) {
		Arriba = arriba;
	}

	public Nodo getAbajo() {
		return Abajo;
	}

	public void setAbajo(Nodo abajo) {
		Abajo = abajo;
	}

	public Nodo getDerecha() {
		return Derecha;
	}

	public void setDerecha(Nodo derecha) {
		Derecha = derecha;
	}

	public Nodo getIzquierda() {
		return Izquierda;
	}

	public void setIzquierda(Nodo izquierda) {
		Izquierda = izquierda;
	}

}
