package ticTacToe;

public class ListaOrtogonal {
	Nodo   head, p, q, r, w;
	private int renglones, columnas;
	int win;

	
	public ListaOrtogonal(int renglones, int columnas)
	{
		this.renglones=renglones;
		this.columnas=columnas;
		head = null;
	}
	
	public void CrearLista(){	
		for (int x = 1; x <= renglones; x++){
			for (int y = 1; y <= columnas; y++){
				p = new Nodo();
				
				if (y == 1){
					if (head == null){
						head = p;
					}
					q = p;
				}else{
					p.setIzquierda(q);
					q.setDerecha(p);
					q = p;
				}
				
				if (x == 1){
					q = p;
				}else{
					p.setArriba(r);
					r.setAbajo(p);
					r = r.getDerecha();
				}
			}// for columnas
			r = head;
			while (r.getAbajo() != null){
				r = r.getAbajo();
			}
		}// for renglones
	}
			
	public void desplegarLista(){
		if (head != null){
			q = head;
			while( q != null)//renglon
			{
				p = q;
				while(p != null)//columna
				{
					System.out.print(p.getDato());
					p = p.getDerecha();
				}
				q = q.getAbajo();
				System.out.println("");
			}
			System.out.println("");
		}
	}
	
	public boolean jugar(int dato, int fila, int columna) {
        p = head;
        
        //Bajar a la fila
        int contFila = 1;
        while(contFila < fila && p != null) {
            p = p.getAbajo();
            contFila++;
        }

        //Continuar a la columna
        int contCol = 1;
        while(contCol < columna && p != null) {
            p = p.getDerecha();
            contCol++;
        }

        //Verificar si el nodo existe y si esta vacío
        if (p != null && p.getDato() == 0) {
            p.setDato(dato);
            return true;
        }

        return false;
    }
		
	public boolean jugadaHorizontal(int turno) {
		w = head;
	    boolean win = false;
        int fichasContinuas = 0;

	    while (w != null && !win) {
	    	fichasContinuas = 0;
	        Nodo p = w;
	        while (p != null && !win) {

	            if (p.getDato() == turno) {
	            	fichasContinuas++;
	                if (fichasContinuas == 3) {
	                    win = true;
	                }
	            } else {
	            	fichasContinuas = 0;
	            }
	            
	            p = p.getDerecha();
	            
	        }
	        
	        w = w.getAbajo();
	        
	    }
		
		return win;
		}
	
	public boolean jugadaVertical(int turno) {
	    w = head;
	    boolean win = false;
        int fichasContinuas = 0;

	    while (w != null && !win) {
	    	fichasContinuas = 0;
	        Nodo p = w;
	        while (p != null && !win) {

	            if (p.getDato() == turno) {
	            	fichasContinuas++;
	                if (fichasContinuas == 3) {
	                    win = true;
	                }
	            } else {
	            	fichasContinuas = 0;
	            }
	            
	            p = p.getAbajo();
	            
	        }
	        
	        w = w.getDerecha();
	        
	    }
		
		return win;
		}


	public boolean jugadaDiagonal() {
	    Nodo fila = head;

	    while (fila != null) {
	        Nodo p = fila;

	        while (p != null) {
	            int dato = p.getDato();
	            if (dato != 0) {
 
	                if (VerificarDial(p, 1, 1, dato))
	                	return true;

	                if (VerificarDial(p, -1, 1, dato))
	                	return true;
	            }

	            p = p.getDerecha();
	        }

	        fila = fila.getAbajo();
	    }

	    return false;
	}

	private boolean VerificarDial(Nodo p, int dx, int dy, int dato) {
	    Nodo actual = p;

	    for (int i = 0; i < 3; i++) {
	        if (actual == null || actual.getDato() != dato)
	            return false;

	        if (dx == 1) 
	        	actual = actual.getDerecha();
	        if (dx == -1) 
	        	actual = actual.getIzquierda();
	        if (dy == 1 && actual != null) 
	        	actual = actual.getAbajo();
	    }

	    return true;
	}

	

}
