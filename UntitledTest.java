// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void untitled() {
    driver.get("https://particuliers.engie.fr/");
    driver.manage().window().setSize(new Dimension(1296, 696));
    driver.findElement(By.cssSelector(".c-siteHeader2__loginText")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("thibault.dubois@external.gdfsuez.com");
    driver.findElement(By.id("motdepasse")).sendKeys("TDgdf92!");
    driver.findElement(By.cssSelector("#login-btn > .c-baseBtn__content")).click();
    driver.findElement(By.cssSelector(".c-headerCelPlaces2__iconArrow")).click();
    driver.findElement(By.cssSelector(".c-headerCelPlaces2Item__content")).click();
    driver.findElement(By.id("libelle-contrat-container")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".c-tile:nth-child(2)"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".c-tile:nth-child(2)"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".c-tile:nth-child(2)"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".c-tile:nth-child(2)")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.id("bloc-derniere-facture-telecharger-facture")).click();
    vars.put("win6814", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win6814").toString());
    driver.close();
    driver.switchTo().window(vars.get("root").toString());
    driver.findElement(By.linkText("Mes factures")).click();
    driver.findElement(By.linkText("Ma conso")).click();
    driver.switchTo().frame(7);
    driver.findElement(By.id("close")).click();
    driver.switchTo().defaultContent();
    driver.findElement(By.linkText("Mes services")).click();
    driver.findElement(By.id("panelLink_plus_de_services")).click();
    {
      WebElement element = driver.findElement(By.id("panelLink_plus_de_services"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Action builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("espace_client_offres_et_services_pushlight_acceder")).click();
    driver.findElement(By.linkText("Mon déménagement")).click();
    driver.findElement(By.linkText("Parrainage")).click();
    driver.findElement(By.cssSelector(".c-headerCelUser__name")).click();
    driver.findElement(By.cssSelector("#header-deconnexion > .c-baseBtn__content")).click();
    driver.close();
  }
}
