package grafos;
import static java.lang.Math.pow;

import java.util.Random;

public class MatrizSimetrica {
	private boolean[] vector;
	private int nodos;
	
	
	/**
	 * 
	 * @param nodos Cantidad de nodos que tiene el grafo.
	 */
	public MatrizSimetrica(int nodos) {
		this.nodos = nodos;
		int tamVec = nodos * (nodos - 1) / 2;
		this.vector = new boolean[tamVec];
	}
	
	public boolean getFilaColumna(int i, int j) {
		if(i > j) {		//Swappeo sin variable auxiliar.
			i = i + j;	//4 + 2 = 6
			j = i - j;	//6 - 2 = 4
			i = i - j;	//6 - 4 = 2
		}
		
		int indice =  i * this.nodos + j - ((int) pow(i, 2) + 3 * i + 2) / 2;
		return this.vector[indice];
	}
	
	public void setFilaColumna(int i, int j, boolean valor) {
		if(i == j)
			return;
		if(i > j) {
			i = i + j;
			j = i - j;
			i = i - j;
		}
		
		int indice =  i * this.nodos + j - ((int) pow(i, 2) + 3 * i + 2) / 2; 
		this.vector[indice] = valor;
	} 
	
	public int getCantidadNodos() {
		return this.nodos;
	}
	
	/**///////////////////////////////////////////////////////////// **/
	
	public void generarMatrizAleatoria() {
		for(int i = 0; i < this.nodos; i++) {
			for(int j = 0; j < this.nodos; j++) {
				setFilaColumna(i, j, new Random().nextBoolean());
			}
		}
	}
		
	public void mostrarMatrizAdyacencia() {
		for(int i = 0; i < this.nodos; i++) {
			for(int j = 0; j < this.nodos; j++) {
				if(i == j)
					System.out.print("-\t");
				else
					System.out.print(getFilaColumna(i, j) + "\t");
			}
			System.out.println("\n");
		}
	}
}
