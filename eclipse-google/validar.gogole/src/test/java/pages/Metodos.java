
package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.Screenshot;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}

	public void escrever(String texto, By elemento, String passo) throws IOException {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {

			System.out.println("Error ao executar o passo " + passo + " " + LocalDateTime.now());
			screnShot("Error/" + passo);
		}
	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();
	}

	public void validarTexto(String textoEsperado, By elemento) {

		String textoElement = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoElement);
	}

	public void screnShot(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public void fecharNavegador() {

		driver.quit();
	}
}
