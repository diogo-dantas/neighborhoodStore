package br.com.neighborhoodStore.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.neighborhoodStore.model.Compra;

public class TesteCompras {

	public static void main(String[] args) {

		Compra c1 = new Compra("Alface", 3.0);
		Compra c2 = new Compra("Biscoito", 3.5);
		Compra c3 = new Compra("Leite em pó", 14.0);

		ArrayList<Compra> registro = new ArrayList<Compra>();

		registro.add(c2);
		registro.add(c1);
		registro.add(c3);

		System.out.println(registro);

		Collections.sort(registro);

		System.out.println(registro);

		Compra c4 = new Compra("Bala Juquinha", 0.15);

		registro.add(c4);

		registro.sort(Comparator.comparing(Compra::getValor));

		System.out.println(registro);

	}

}
