package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

// Caminho das feature
		features = "src/test/resources/feature/",
// Caminho dos Steps de testes
		glue = "tests",
// Tag para indicar qual teste deve ser executado
		tags = "@executa and not @nExecuta",
// Pretty deixar o console igual a execução cucumber | html para gerar evidencias
		plugin = { "pretty", "html:target/report.html" },
// Não executar o teste, validar se foi incluso algum novo BDD, deixar como FALSE
		dryRun = false, monochrome = true

)

public class Executa {

}
