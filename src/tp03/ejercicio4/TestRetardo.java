package tp03.ejercicio4;

import ejercicio1.ArbolBinario;

public class TestRetardo {

	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(0);
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(0);
		ArbolBinario<Integer> f = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> g = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> h = new ArbolBinario<Integer>(0);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		a.agregarHijoIzquierdo(d);
		a.agregarHijoDerecho(e);
		a.agregarHijoDerecho(h);
		a.agregarHijoDerecho(g);
		a.agregarHijoDerecho(f);
		
		RedBinariaLlena red = new RedBinariaLlena(a);
		
		System.out.println(red.retardoReenvio() + "Segundos");
	}

}
