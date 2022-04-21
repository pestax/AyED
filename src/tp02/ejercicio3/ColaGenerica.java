package tp02.ejercicio3;


import tp02.ejercicio2.ListaGenerica;

public class ColaGenerica<T> {
      private ListaGenerica<T> datos;
      
      public ColaGenerica(ListaGenerica<T> lista) {
    	  this.datos = lista;
      }
      
      public void encolar(T elem){
    	  this.datos.agregarFinal(elem);
      }
      public T tope(){
    	  T elem = datos.elemento(1);
    	  return elem;
      }
      public T desencolar(){
    	  T elem = datos.elemento(1);
    	  datos.eliminarEn(1);
    	  return elem;
      }
      public boolean EsVacia(){
    	  return this.datos.esVacia();
      }
}

