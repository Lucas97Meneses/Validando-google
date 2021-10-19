package primeiro.progeto;

public class MetodoAtributo {
	
	String nome;
	int idade;
	
	public String digiteUmNome (String nome) {
		
	System.out.println("O nome digitado é " + nome);
		
		return nome;
		
	}
	
	public void didgiteSuaIdade (int idade) {
		
		System.out.println("O nome digitado é " + idade);
		
	}
	
	public void informeDados(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		System.out.println("O nome cadastrado é " + nome + " e a idade é " + idade + " anos.");
		
	}

	public void consultarDados () {
		
		System.out.println("O nome cadastrado é " + this.nome + " e a idade é " + this.idade + " anos.");
	}
}
