package primeiro.progeto;

public class ExecutarMetodo {

	public static void main(String[] args) {

		MetodoVazio metodo = new MetodoVazio();
		MetodoRetorno retorno = new MetodoRetorno();
		MetodoAtributo atributo = new MetodoAtributo(); 
		

		metodo.mensagem();
		retorno.nome();
		atributo.digiteUmNome("Lucas");
		atributo.didgiteSuaIdade(24);
		atributo.informeDados("Lucas", 24);
		atributo.consultarDados();

	}

}
