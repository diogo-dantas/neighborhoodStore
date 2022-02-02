package br.com.neighborhoodStore.test;

import java.util.HashMap;
import java.util.Map;

import br.com.neighborhoodStore.model.Compra;

public class TesteMapCompras {

	public static void main(String[] args) {

		Map<Integer, String> cliente = new HashMap<>();
		Map<Integer, Compra> produto = new HashMap<>();

		cliente.put(1, "Sérgio Inácio");
		cliente.put(2, "Otávio Mesquita");
		cliente.put(3, "Alcides Penha");

		Compra biscoito = new Compra("Biscoito", 3.5);
		Compra leite = new Compra("Leite", 3.7);
		Compra pao = new Compra("Pão", 5);
		Compra cafe = new Compra("Café", 10);

		produto.put(1, biscoito);
		produto.put(2, leite);
		produto.put(3, pao);
		produto.put(4, cafe);

		cliente.keySet().forEach(nome -> {
			System.out.println(cliente.get(nome));
		});

		produto.keySet().forEach(compra -> {
			System.out.println(produto.get(compra));
		});

	}

}
