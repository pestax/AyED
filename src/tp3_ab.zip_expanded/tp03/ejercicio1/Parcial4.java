package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class Parcial4 {

	private ArbolGeneral<Integer> a;
	
	
	public ListaGenerica<Integer> resolver(){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		resolver(a,lista);
		
		return lista;
	}
	
	private void resolver(ArbolGeneral<Integer> a,ListaGenerica<Integer> lista) {
		Integer cant= 0;
		Boolean ok = false;
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				ArbolGeneral<Integer> aux = hijos.proximo();
				if (hijos.tamanio()%2 == 1) {
					ok = true;
					cant += aux.getDato();
				}
				resolver(a,lista);
			}
		}
		if (!a.esHoja()) {
			if (ok) {
				lista.agregarFinal(cant);
			}
		}
		
	}
	
	
}
