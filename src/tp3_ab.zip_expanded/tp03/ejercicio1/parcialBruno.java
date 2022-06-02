package tp03.ejercicio1;


public class parcialBruno {
	
	
	
	
	
	public Integer resolver(ArbolBinario<Integer> a) {
		
			Integer resultado = resuelvo(a);
		
		return resultado;
		
	}

	
	
	private Integer resuelvo ( ArbolBinario<Integer> a) {
			if (a.esHoja()) {
				if (a.getDato() % 2 != 0) {
					return a.getDato()* (-1);
				}else {
					return 0;
				}
			}else {
				Integer cant = 0;
				if (a.tieneHijoIzquierdo()) {
					cant += resuelvo(a.getHijoIzquierdo());
				}	
				if (a.tieneHijoDerecho()) {
					cant += resuelvo(a.getHijoDerecho());
				}
				if (a.getDato() % 2 == 0) {
					cant += a.getDato();
				}
				return cant;
			}
	}









}

