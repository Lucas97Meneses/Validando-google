package percorrer.string;

public class PercorrerString {

	public static void main(String[] args) {

		String menssagem = "Eu amo qualidade de software";
		char letra = 'a';
		int contador = 0;

		for (int i = 0; i < menssagem.length(); i++) {
			if (menssagem.charAt(i) == letra) {
				contador++;
			}
		}

		System.out.println("A letra " + letra + " aparece " + contador + " vezes");

	}

}
