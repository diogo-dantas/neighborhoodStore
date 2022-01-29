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

		vestiario.add(produto5);
		vestiario.add(produto6);
		vestiario.add(produto7);
		vestiario.add(produto8);
		vestiario.add(produto9);
		vestiario.add(produto10);
		vestiario.add(produto11);

		System.out.println(produtosDeLimpeza.size());

		ArrayList<String> utilidades = new ArrayList<>();

		utilidades.addAll(produtosDeLimpeza);
		utilidades.addAll(vestiario);

		System.out.println(utilidades.contains("Sabão em pó"));
		System.out.println(utilidades.contains("Pneu de carro"));

		System.out.println(utilidades.size());

		for (String produto : utilidades) {

			System.out.println(produto);
		}

		System.out.println(vestiario.get(2));

		System.out.println(vestiario.remove(produto9));

		System.out.println("------------------------------------");

		for (String roupa : vestiario) {
			System.out.println(roupa);

		}

		System.out.println("------------------------------------");

		utilidades.sort(null); // má prática, não usei o comparator apenas para testar o método

		for (String produto : utilidades) {

			System.out.println(produto);
		}

		System.out.println(utilidades.subList(0, 3) + "\n");

		System.out.println(utilidades.lastIndexOf(produto9));

		System.out.println(utilidades.retainAll(produtosDeLimpeza));

		System.out.println(utilidades.isEmpty());

		ArrayList<String> copia = (ArrayList<String>) utilidades.clone();

		System.out.println("------------------------------------");

		for (String elemento : copia) {
			System.out.println(elemento);
		}

		copia.clear();

		System.out.println(copia.isEmpty());

	}

}
