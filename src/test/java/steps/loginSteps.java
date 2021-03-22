package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class loginSteps {
	
	private WebDriver driver;
	
	@Dado("^que acesso o site$")
	public void queAcessoOSite() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/chromedriver");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.saucedemo.com"); 
	}

	@Quando("^informo o usuario \"([^\"]*)\"$")
	public void informoOUsuario(String arg1) throws Throwable {
	    driver.findElement(By.id("user-name")).sendKeys(arg1);
	}

	@Quando("^informo a senha \"([^\"]*)\"$")
	public void informoASenha(String arg1) throws Throwable {
	   
	}

	@Quando("^clico no botão login$")
	public void clicoNoBotãoLogin() throws Throwable {
	    
	}

	@Então("^valido se o login foi realizado com sucesso$")
	public void validoSeOLoginFoiRealizadoComSucesso() throws Throwable {
	    
	}


}
