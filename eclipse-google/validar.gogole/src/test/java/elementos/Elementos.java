package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By pesquisar = By.name("q");         
	private By e2etreinamentos = By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]/span");
	private By inovacao = By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]/span");
	private By felicidade = By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]/span");
	private By informacao = By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]/span");
	private By itau = By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]/span");
	private By bradesco = By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]/span");
	private By original = By.xpath("//h2[@class=\"qrShPb kno-ecr-pt PZPZlf mfMhoc\"]/span");
	
	public By getPesquisar() {
		return pesquisar;
	}
	public By getE2etreinamentos() {
		return e2etreinamentos;
	}
	public By getInovacao() {
		return inovacao;
	}
	public By getFelicidade() {
		return felicidade;
	}
	public By getInformacao() {
		return informacao;
	}
	public By getItau() {
		return itau;
	}
	public By getBradesco() {
		return bradesco;
	}
	public By getOriginal() {
		return original;
	}
}
