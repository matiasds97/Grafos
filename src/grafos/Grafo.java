package grafos;

public class Grafo {
	private int nodos;
	private MatrizSimetrica matriz;
	
	/**
	 * Constructor para un grafo sin aristas con n nodos.
	 * @param nodos Cantidad de nodos que tendrá el grafo.
	 */
	public Grafo(int nodos) { 
		this.nodos = nodos;
		this.matriz = new MatrizSimetrica(nodos);
	}
	
	/**
	 * Constructor para un grafo basado en una matriz de adyacencia.
	 * @param matriz Matriz de adyacencia.
	 */
	public Grafo(MatrizSimetrica matriz) {
		this.matriz = matriz;
		this.nodos = matriz.getCantidadNodos();
	}
	
	public void cambiarArista(int nodo1, int nodo2) {
		if((nodo1 == nodo2) | nodo1 > this.nodos | nodo2 > this.nodos)
			return;
		this.matriz.setFilaColumna(nodo1, nodo2, !this.matriz.getFilaColumna(nodo1, nodo2));
	}
	
	public void mostrarMatrizGrafo() {
		this.matriz.mostrarMatrizAdyacencia();
	}
}
