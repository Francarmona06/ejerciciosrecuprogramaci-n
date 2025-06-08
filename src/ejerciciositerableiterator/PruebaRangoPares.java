package ejerciciositerableiterator;

public class PruebaRangoPares {

	public static void main(String[] args) {
		RangoPares rango = new RangoPares(10,80);
		for (int numero : rango) {
			System.out.println(numero);
		}

	}

}
