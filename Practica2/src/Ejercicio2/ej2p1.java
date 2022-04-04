package Ejercicio2;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ej2p1 {
		
	
	public static void TestListaEnlazadaGenerica() {
		Estudiante n = new Estudiante("Felipe", "Parrillo", "comision1", null, "Villa elisa");
		Estudiante n2 = new Estudiante("bRUNO", "Pestana", "comision1", null, "Villa elisa");
		Estudiante n3 = new Estudiante("Fasdade", "asdasdo", "comision1", null, "Villa elisa");
		Estudiante n4 = new Estudiante("Alejo", "Passaro", "comision1", null, "Villa elisa");
		ListaEnlazadaGenerica<Estudiante> a = new ListaEnlazadaGenerica<Estudiante>();
		a.agregarFinal(n);
		a.agregarFinal(n2);
		a.agregarFinal(n3);
		a.agregarFinal(n4);
		String aux = a.toString();
		System.out.println(aux);
		
	}
	
	
	public static void  main (String[] args) {
		TestListaEnlazadaGenerica();
		
	}

}

