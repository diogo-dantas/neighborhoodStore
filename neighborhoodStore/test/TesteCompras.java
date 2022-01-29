package br.com.neighborhoodStore.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.neighborhoodStore.model.Cliente;
import br.com.neighborhoodStore.model.Compra;

public class TesteCompras {

	public static void main(String[] args) {

		Compra c1 = new Compra("Alface", 3.0);
		Compra c2 = new Compra("Biscoito", 3.5);
		Compra c3 = new Compra("Leite em pó", 14.0);
		Compra c4 = new Compra("Bala Juquinha", 0.15);
		
		Cliente cl1 = new Cliente("Maurício Leandro Navarro",1);
		
		List <Compra> compras = cl1.getCompras();
		
		compras.add(new Compra("Palmitos e Cebolas",13.0));


		Collections.sort(compras);

		compras.add(c4);

		compras.sort(Comparator.comparing(Compra::getValor));

		System.out.println(compras);

	}

}
