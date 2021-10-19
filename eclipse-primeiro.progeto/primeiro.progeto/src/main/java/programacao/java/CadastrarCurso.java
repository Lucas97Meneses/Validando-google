package programacao.java;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarCurso {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> cursos = new ArrayList<String>();
		cursos.add("Teste de UI");
		cursos.add("Test de API");
		cursos.add("Tetes de Unidades");

		String opcao;
		System.out.println("Digite 1 para cadastrar um curso ou qualquer tecla para exibir a lista");
		opcao = scanner.nextLine();

		while (opcao.equals("1")) {
			System.out.println("Digite o curso desejado");
			String curso = scanner.nextLine();
			cursos.add(curso);
			System.out.println("Digite 1 para cadastrar um curso ou qualquer tecla para exibir a lista");
			opcao = scanner.nextLine();

		}
		
		System.out.println("Curso Cadastrados: \n" + cursos);

	}

}
