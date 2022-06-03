package Parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class DevolverCaminoHojaMasLejana {

	public ListaGenerica<Integer> devuelvoCamino( ArbolGeneral<Integer> arbol){
		ListaGenerica<Integer> aux = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<Integer> MasLargo = new ListaEnlazadaGenerica<Integer>();
		if (!arbol.esVacio())
			caminoAHojaMasLejano(arbol,aux,MasLargo);
		return MasLargo;		
	}
	
	
	private static void caminoAHojaMasLejano(ArbolGeneral<Integer> a, ListaGenerica<Integer> aux, ListaGenerica<Integer> masLargo ) {
		aux.agregarFinal(a.getDato());
		
		if (a.esHoja()) {
			if (aux.tamanio()> masLargo.tamanio()){
				//Vaciamos el camino mas largo que teniamos hallado
				masLargo.comenzar();
				while (!masLargo.fin())
						masLargo.eliminar(masLargo.proximo());
				//Guardar el camino actual en el camino mas largo
				aux.comenzar();
				while (!aux.fin())
					masLargo.agregarFinal(aux.proximo());
			}
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				caminoAHojaMasLejano(hijos.proximo(),aux,masLargo);
				aux.eliminarEn(aux.tamanio());
			}
		}
	}
}
