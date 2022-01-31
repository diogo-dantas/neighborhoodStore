package br.com.neighborhoodStore.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.neighborhoodStore.model.Cliente;
import br.com.neighborhoodStore.model.Compra;

public class TesteCompras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Compra c1 = new Compra("Alface", 3.0);
		Compra c2 = new Compra("Biscoito", 3.5);
		Compra c3 = new Compra("Leite em pó", 14.0);
		Compra c4 = new Compra("Bala Juquinha", 0.15);

		Cliente cl1 = new Cliente("Maurício Leandro Navarro", 1);

		cl1.adiciona(c1);
		cl1.adiciona(c2);
		cl1.adiciona(c3);
		cl1.adiciona(c4);

		System.out.println(cl1.getCompras());

//		O método sort abaixo citado não funciona mais devido a aplicação do recurso unmodifiableList no método getCompras
//		O  método não permite que a lista seja alterada sem ser na sua classe de origem (Cliente).
//
//		Collections.sort(cl1.getCompras());
//		cl1.getCompras().sort(Comparator.comparing(Compra::getValor));

	}

}
