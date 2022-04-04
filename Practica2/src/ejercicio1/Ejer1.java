package ejercicio1;

import java.util.Iterator;

import java.util.Scanner;

import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class Ejer1 {

	public static void main(String[] args) {
		ListaDeEnterosConArreglos m = new ListaDeEnterosConArreglos();
		m.comenzar();
		for(int i = 0; i<3; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Ingrese un numero: ");
			int n = scanner.nextInt();
			m.agregarFinal(n);				
		}
		int tamanio = m.tamanio();
		int cont = 0;
		m.imprimir(cont);
		
			
		}
	}


