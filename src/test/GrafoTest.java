package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import grafos.*;

class GrafoTest {

	@Test
	void test() {
		MatrizSimetrica m = new MatrizSimetrica(5);
		m.generarMatrizAleatoria();
		m.mostrarMatrizAdyacencia();
		Grafo g = new Grafo(m);
		g.cambiarArista(2, 3);
		System.out.println("\n\n");
		g.mostrarMatrizGrafo();
	}

}
