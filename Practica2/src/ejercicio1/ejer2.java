package ejercicio1;

import java.util.Scanner;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class ejer2 {

	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada m = new ListaDeEnterosEnlazada();
		m.comenzar();
		for(int i = 0; i<3; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Ingrese un numero: ");
			int n = scanner.nextInt();
			m.agregarFinal(n);
		}
		m.imprimir(0);
		int pos = m.tamanio();
		m.imprimoInv(pos);
		
		
	}
}
