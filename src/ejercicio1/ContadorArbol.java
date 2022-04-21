package ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ContadorArbol {
	private ArbolBinario<Integer> dato = new ArbolBinario<Integer>();
	
	
	public void setDato(ArbolBinario<Integer> arbol) {
		this.dato = arbol;
	}
	
	
	public void recorridoParesinOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
		if (arbol.tieneHijoIzquierdo()) {
			this.recorridoParesinOrden(lista, arbol.getHijoIzquierdo());
		}
		if (arbol.getDato() % 2 == 0) {
			lista.agregarFinal(arbol.getDato());
		}
		if (arbol.tieneHijoDerecho()) {
			this.recorridoParesinOrden(lista, arbol.getHijoDerecho());
		}
	}
	
	public ListaEnlazadaGenerica<Integer> numerosPares(){
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		recorridoParesinOrden(lista,dato);
		return lista;
	}
	
	public void recorridoParesPostOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
		if (arbol.tieneHijoIzquierdo()) {
			this.recorridoParesPostOrden(lista, arbol.getHijoIzquierdo());	
		}
		if (arbol.tieneHijoDerecho()) {
			this.recorridoParesPostOrden(lista, arbol.getHijoDerecho());
		}
		if (arbol.getDato() % 2 ==0) {
			lista.agregarFinal(arbol.getDato());
		}
	}
}

