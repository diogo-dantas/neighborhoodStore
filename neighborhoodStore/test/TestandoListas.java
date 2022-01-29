package br.com.neighborhoodStore.test;

import java.util.ArrayList;

public class TestandoListas {
	public static void main(String[] args) {

		ArrayList<String> produtosDeLimpeza = new ArrayList<>();

		String produto1 = ("Sabão em pó");
		String produto2 = ("Amaciante");
		String produto3 = ("Detergente");
		String produto4 = ("Escova de Dentes");

		produtosDeLimpeza.add(produto1);
		produtosDeLimpeza.add(produto2);
		produtosDeLimpeza.add(produto3);
		produtosDeLimpeza.add(produto4);
		
		ArrayList<String> vestiario = new ArrayList<>();
		
		String produto5 = ("Camisa");
		String produto6 = ("Bermuda");
		String produto7 = ("Saia");
		String produto8 = ("Cropped");
		String produto9 = ("Meia");
		String produto10 = ("Roupa íntima Masculina");
		String produto11 = ("Roupa íntima Ferminina");
		

		System.out.println(produtosDeLimpeza.size());
		
		ArrayList<String> utilidades = new ArrayList<>();
		
		
		utilidades.addAll(produtosDeLimpeza);
		utilidades.addAll(vestiario);
		

	}

}
