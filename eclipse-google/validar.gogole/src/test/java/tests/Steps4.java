package tests;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps4 {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
	    metodos.abrirNavegador(site);
	}

	@When("eu busco {string}")
	public void eu_busco(String texto) throws IOException {
	    metodos.escrever(texto, el.getPesquisar());
	    metodos.submit(el.getPesquisar());
	}

	@Then("valiso o {string}")
	public void valiso_o(String te) throws IOException {
		metodos.validarTexto(te, el.getE2etreinamentos());
		metodos.validarTexto(te, el.getInovacao());
		metodos.validarTexto(te, el.getInformacao());
	    metodos.screnShot(te);
	    metodos.fecharNavegador();
	}
	
}
