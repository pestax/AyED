package tp02.ejercicio3;

import tp02.ejercicio2.ListaGenerica;

public class  ColaGenerica extends ListaGenerica{

	public ColaGenerica() {
		
	}
	public void encolar() {
		
	}
	
	public <T> void tope() {
		proximo();
		return ;
	}
	
	@Override
	public void comenzar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object proximo() {
		
		return null;
	}

	@Override
	public boolean fin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object elemento(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarEn(Object elem, int pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarInicio(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarFinal(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarEn(int pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean incluye(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esVacia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int tamanio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean reemplazarEn(Object elem, int pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListaGenerica clonar() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
