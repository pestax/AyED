package ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int cant =0;
		// Siempre pregunto si es vacio.
		//Pero si consultamos si es hoja, no entra al if
		// porque no tiene hijos
		if (this.esHoja())
			return 1;
		// si no tiene hijos, es una hoja
		//devuelve uno
		else {
			//recursivamente reocrro ambos hijos
			if (this.tieneHijoIzquierdo())
				cant+= this.getHijoIzquierdo().contarHojas();
			if (this.tieneHijoDerecho())
				cant+= this.getHijoDerecho().contarHojas();
		}
		return cant;
	}
	

    public ArbolBinario<T> espejo() {
    	ArbolBinario<T>raiz= new ArbolBinario <>(this.getDato());
    	if (this.tieneHijoIzquierdo())
    		raiz.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
    	
    	if (this.tieneHijoDerecho())
    		raiz.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
		
		return raiz;
	}

 
    

	public void entreNiveles(int n, int m){
		int nivel = 0;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<>();
		cola.encolar(this);
		cola.encolar(null);
		
		while (nivel <= m && !cola.EsVacia()) {
			ArbolBinario<T> arbol = cola.desencolar();
			
			if (arbol != null) {
				if (nivel >= n)
					System.out.println(arbol.getDato() + " ");
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			}else if(!cola.EsVacia()) {
				cola.encolar(null);
				if (nivel ++ >= n)
					System.out.println();
			}
			
			
			
		}
		
	}

	

}
