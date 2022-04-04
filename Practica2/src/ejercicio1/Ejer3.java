package ejercicio1;

import java.util.Scanner;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class Ejer3 {
	
	public static ListaDeEnterosEnlazada calcularSucesion(ListaDeEnterosEnlazada a,int n) {
	
		if (n != 1) {
			if (n % 2 == 0) {
				n=  (n/2);
			}else {
				n= (3*n+1);
			}
			a.agregarFinal(n);
			calcularSucesion(a,n);
		}
		return a;		
	}

	
	
	public static void main (String[] args) {
		ListaDeEnterosEnlazada a = new ListaDeEnterosEnlazada();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int n = scanner.nextInt();
		a.comenzar();
		
		a= calcularSucesion(a,n);
		a.imprimir(0);
	}
}
