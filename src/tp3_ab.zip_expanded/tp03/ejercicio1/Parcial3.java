package tp03.ejercicio1;

public class Parcial3 {

	
	public Integer sumaImparesPosOrderMayorA(ArbolBinario<Integer> ab, int limite) {
		Integer cant = 0;
		
		
		return cant;
	}
	
	private Integer resolver(ArbolBinario<Integer> ab, int limite) {
		Integer suma = 0;
		if (!ab.esVacio()) {
			if (ab.tieneHijoIzquierdo()) {
				suma += resolver(ab.getHijoIzquierdo(),limite);
			}
			if (ab.tieneHijoDerecho()) {
				suma += resolver(ab.getHijoDerecho(),limite);
			}
			if (ab.getDato() % 2 == 1 && (ab.getDato() > limite)){
				suma += ab.getDato();
				System.out.println(ab.getDato());
			}
			return suma;
		}
		return -1;
	}
	
	private Integer resolver2(ArbolBinario<Integer> ab, int limite) {
		if (ab.esVacio()) {
			return 0;
		}else {
			Integer cant = 0;
			cant += resolver2(ab.getHijoIzquierdo(),limite) + resolver2(ab.getHijoDerecho(),limite);
			if (ab.getDato() % 2 == 1 && (ab.getDato() > limite)){
				cant += ab.getDato();
			}
			return cant;
		}
	}
}
