package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ejer3 {
	
		private ArbolBinario<Integer> dato;


		public ejer3 (ArbolBinario<Integer> dato) {
			this.dato = dato;
		}
	
	public ListaGenerica<Integer> Contadorpares(ArbolBinario<Integer> arbol){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		InOrden(lista,arbol);
		PostOrden(lista,arbol);
		return lista;
	}
	
	
	private int InOrden (ListaGenerica<Integer> lista,ArbolBinario<Integer> a){
		int cant = 0;
		if (a.tieneHijoIzquierdo()) {
			InOrden(lista,a.getHijoIzquierdo());
		}
		if (a.getDato() % 2 == 0) {
			lista.agregarFinal(a.getDato());
		}
		if (a.tieneHijoDerecho()) {
			InOrden(lista,a.getHijoDerecho());
		}
		return cant;
	}
	
	private int PostOrden (ListaGenerica<Integer> lista,ArbolBinario<Integer> a){
		int cant = 0;
		
		if (a.tieneHijoIzquierdo()) {
			PostOrden(lista,a.getHijoIzquierdo());
		}
		if (a.tieneHijoDerecho()) {
			PostOrden(lista,a.getHijoDerecho());
		}
		if (a.getDato() % 2 == 0) {
			lista.agregarFinal(a.getDato());
		}
		return cant;
	
	
	}
}
	
	
	