package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

		public RemoteWebDriver driver;
		
		public static Properties prop;
		
	public void loadObjects() {
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/Object.properties"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	
	public void unloadObject() {
		prop=null;
	}
	
	public String replaceXpath(String xpath, String value){
		String newXpath = null;
		try {
			if (xpath.contains("option")) {
				 newXpath = xpath.replace("option", value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newXpath;
		}
		
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
			try {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				}else if (browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver();	
				}else if (browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				//System.out.println("The browser "+browser+" is launched with the given url"+ url+"successfully");
				reportStep("The browser "+browser+" is launched with the given url"+ url+"successfully", "pass");
			}  catch (SessionNotCreatedException e) {
				// TODO Auto-generated catch block
				// System.err.println("The browser "+browser+" is not launched due to Session not created error");
				reportStep("The browser "+browser+" is not launched due to Session not created error", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				// System.err.println("The browser "+ browser+" is not launched due to unknown error");
				reportStep("The browser "+ browser+" is not launched due to unknown error","fail");
			}catch (Throwable e) {
				// TODO: handle exception
				// System.err.println("The browser "+ browser+" is not launched due to unknown error");
				reportStep("The browser "+ browser+" is not launched due to unknown error", "fail");
			}
	}

	
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			// System.out.println("The element with id "+idValue+" is entered with the data "+data);
			reportStep("The element with id "+idValue+" is entered with the data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The data "+data+" cannot be entered in the element with id "+idValue+" due to an unexpected alert in the application");
			reportStep("The data "+data+" cannot be entered in the element with id "+idValue+" due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		}
	}

	
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			// System.out.println("The element with name "+nameValue+" is entered with the data "+data);
			reportStep("The element with name "+nameValue+" is entered with the data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with name "+nameValue+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with name "+nameValue+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "fail");
		}
		
	}	

	
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			// System.out.println("The element with xpath "+xpathValue+" is entered with the data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with the data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with xpath "+ xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+ xpathValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The data "+data+" cannot be entered in the element with xpath "+xpathValue+" due to an unexpected alert in the application");
			reportStep("The data "+data+" cannot be entered in the element with xpath "+xpathValue+" due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with the data "+data+" due to unknown error", "fail");
		}

	}

	
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String actualTitle =  driver.getTitle();
			
			if (actualTitle.equals(title)) {
				// System.out.println("The title of the page "+actualTitle+" is matched with the excepted title "+title);
				reportStep("The title of the page "+actualTitle+" is matched with the excepted title "+title, "pass");
			} else {
				// System.err.println("The title of the page "+actualTitle+" is not matched with the excepted title "+title);
				reportStep("The title of the page "+actualTitle+" is not matched with the excepted title "+title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			// System.err.println("The given title of the page cannot be verified due to unknown error");
			reportStep("The given title of the page cannot be verified due to unknown error", "fail");
		}
	}

	
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		 
		try {
			String actualText = driver.findElementById(id).getText();
			if (actualText.equals(text)) {
				// System.out.println("The element with id "+id+" is holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is matched with expected text "+text, "pass");
			} else {
				// System.err.println("The element with id "+id+" is holding the text "+actualText+" is not matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is not matched with expected text "+text, "fail");
			}
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with id "+id+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The given text cannot be verified due to unknown error");
			reportStep("The given text cannot be verified due to unknown error", "fail");
		}
	}
	

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				// System.out.println("The element with id "+xpath+" is holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with id "+xpath+" is holding the text "+actualText+" is matched with expected text "+text, "pass");
			} else {
				// System.err.println("The element with id "+xpath+" is holding the text "+actualText+" is not matched with expected text "+text);
				reportStep("The element with id "+xpath+" is holding the text "+actualText+" is not matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The given text cannot be verified due to unknown error");
			reportStep("The given text cannot be verified due to unknown error", "fail");
		}
	}

	
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				// System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is partially matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is partially matched with expected text "+text, "pass");
			}else {
				// System.err.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not partially matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is not partially matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with xpath "+ xpath+" is not found in the DOM");
			reportStep("The element with xpath "+ xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The given text cannot be verified due to unknown error");
			reportStep("The given text cannot be verified due to unknown error", "fail");
		}
	}

	
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			// System.out.println("The element with id "+id+" is successfully clicked");
			reportStep("The element with id "+id+" is successfully clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" cannot be clicked due to an unexpected alert in the application");
			reportStep("The element with id "+id+" cannot be clicked due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" cannot be clicked due to unknown error");
			reportStep("The element with id "+id+" cannot be clicked due to unknown error", "fail");
		}
	}

	
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			// System.out.println("The element with the classname "+classVal+" is successfully clicked");
			reportStep("The element with the classname "+classVal+" is successfully clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with the classname "+classVal+" is not found in the DOM");
			reportStep("The element with the classname "+classVal+" is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with the classname "+classVal+" is not interactable in the application");
			reportStep("The element with the classname "+classVal+" is not interactable in the application", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the classname "+classVal+" is not visible in the application");
			reportStep("The element with the classname "+classVal+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the classname "+classVal+" is not stable in the application");
			reportStep("The element with the classname "+classVal+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with classname "+classVal+" cannot be clicked due to an unexpected alert in the application");
			reportStep("The element with classname "+classVal+" cannot be clicked due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.out.println("The element with the classname "+classVal+" cannot be clicked due to unknown error");
			reportStep("The element with the classname "+classVal+" cannot be clicked due to unknown error", "fail");
		}
	}

	
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			// System.out.println("The element with the name "+name+" is successfully clicked");
			reportStep("The element with the name "+name+" is successfully clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the name "+name+" is not found in the DOM");
			reportStep("The element with the name "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the name "+name+" is not visible in the application");
			reportStep("The element with the name "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with the name "+name+" is not interactable in the application");
			reportStep("The element with the name "+name+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the name "+name+" is not stable in the application");
			reportStep("The element with the name "+name+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with name "+name+" cannot be clicked due to an unexpected alert in the application");
			reportStep("The element with name "+name+" cannot be clicked due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with the name "+name+" is not clicked due to unknown error");
			reportStep("The element with the name "+name+" is not clicked due to unknown error", "fail");
		}
	}

	
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			// System.out.println("The element with the link name "+name+" is successfully clicked");
			reportStep("The element with the link name "+name+" is successfully clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the link name "+name+" is not found in the DOM");
			reportStep("The element with the link name "+name+" is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with the link name "+name+" is not interactable in the application");
			reportStep("The element with the link name "+name+" is not interactable in the application", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the link name "+name+" is not visible in the application");
			reportStep("The element with the link name "+name+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the link name "+name+" is not stable in the application");
			reportStep("The element with the link name "+name+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with link name "+name+" cannot be clicked due to an unexpected alert in the application");
			reportStep("The element with name "+name+" cannot be clicked due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with the link name "+name+" is not clicked due to unknown error");
			reportStep("The element with the link name "+name+" is not clicked due to unknown error", "fail");
		}
	}

	
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			// System.out.println("The element with the link name "+name+" is clicked successfully");
			reportStep("The element with the link name "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			// System.err.println("The element with the link name "+name+" is not visible in the DOM");
			reportStep("The element with the link name "+name+" is not visible in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with the link name "+name+" is not interactable in the application");
			reportStep("The element with the link name "+name+" is not interactable in the application","fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the link name "+name+" is not visible in the application");
			reportStep("The element with the link name "+name+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the link name "+name+" is not stable in the application");
			reportStep("The element with the link name "+name+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with link name "+name+" cannot be clicked due to an unexpected alert in the application");
			reportStep("The element with link name "+name+" cannot be clicked due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with the link name "+name+" is not clicked due to unknown error");
			reportStep("The element with the link name "+name+" is not clicked due to unknown error", "fail");
		}
	}

	
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			// System.out.println("The element with the xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with the xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			// System.err.println("The element with the xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not stable on the application");
			reportStep("The element with the xpath "+xpathVal+" is not stable on the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathVal+" cannot be clicked due to an unexpected alert in the application");
			reportStep("The element with xpath "+xpathVal+" cannot be clicked due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with the xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
		
	}

	
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			// System.out.println("The element with the xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with the xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with the xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not stable on the application");
			reportStep("The element with the xpath "+xpathVal+" is not stable on the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathVal+" cannot be clicked due to an unexpected alert in the application");
			reportStep("The element with xpath "+xpathVal+" cannot be clicked due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with the xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
	}

	
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = driver.findElementById(idVal).getText();
			// System.out.println("The element with id "+idVal+" is holding the text "+text+" is obtained from the application");
			reportStep("The element with id "+idVal+" is holding the text "+text+" is obtained from the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the id "+idVal+" is not found in the DOM");
			reportStep("The element with the id "+idVal+" is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+idVal+" is not interactable in the application");
			reportStep("The element with the id "+idVal+" is not interactable in the application", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+idVal+" is not visible in the application");
			reportStep("The element with the id "+idVal+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+idVal+" is not stable in the application");
			reportStep("The element with the id "+idVal+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+idVal+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with id "+idVal+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The text of the element with id "+idVal+" is not obtained from the application due to unknown error");
			reportStep("The text of the element with id "+idVal+" is not obtained from the application due to unknown error", "fail");
		}
		return text;
	}

	
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = driver.findElementByXPath(xpathVal).getText();
			// System.out.println("The element with xpath "+xpathVal+" is holding the text "+text+" is obtained from the application");
			reportStep("The element with xpath "+xpathVal+" is holding the text "+text+" is obtained from the application", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathVal+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+xpathVal+" holding the text "+text+" is not obtained from the application due to unknown error");
			reportStep("The element with id "+xpathVal+" holding the text "+text+" is not obtained from the application due to unknown error", "fail");
		}
		return text;
	}

	
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementById(id);
			Select sel = new Select(text);
			sel.selectByVisibleText(value);
			// System.out.println("The element with id"+id+"holding the dropdown visible text "+value+" is successfully selected");
			reportStep("The element with id"+id+"holding the dropdown visible text "+value+" is successfully selected", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the id "+id+" is not found in the DOM");
			reportStep("The element with the id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+id+" is not visible in the application");
			reportStep("The element with the id "+id+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+id+" is disabled in the appication");
			reportStep("The element with the id "+id+" is disabled in the appication", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+id+" is not stable in the application");
			reportStep("The element with the id "+id+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+id+" 	is not interactable in the application");
			reportStep("The element with the id "+id+" 	is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with id "+id+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with id"+id+"holding the dropdown visible text "+value+" is not selected due to an unknown error");
			reportStep("The element with id"+id+"holding the dropdown visible text "+value+" is not selected due to an unknown error", "fail");
		}
	}

	
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementById(id);
			Select sel = new Select(text);
			sel.selectByIndex(value);
			// System.out.println("The element with id"+id+"holding the dropdown index "+value+" is successfully selected");
			reportStep("The element with id"+id+"holding the dropdown index "+value+" is successfully selected", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the id "+id+" is not found in the DOM");
			reportStep("The element with the id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+id+" is not visible in the application");
			reportStep("The element with the id "+id+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+id+" is disabled in the appication");
			reportStep("The element with the id "+id+" is disabled in the appication", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+id+" is not stable in the application");
			reportStep("The element with the id "+id+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with the id "+id+" is not interactable in the application");
			reportStep("The element with the id "+id+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with id "+id+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with id "+id+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with id"+id+"holding the dropdown index "+value+" is not selected due to unknown error");
			reportStep("The element with id"+id+"holding the dropdown index "+value+" is not selected due to unknown error", "fail");
		}
		
	}

	public void selectVisibleTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementByXPath(xpath);
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
			// System.out.println("The element with xpath "+xpath+" holding the dropdown visible text "+value+" is successfully selected");
			reportStep("The element with xpath "+xpath+" holding the dropdown visible text "+value+" is successfully selected", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the xpath "+xpath+" is not found in the DOM");
			reportStep("The element with the xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not visible in the application");
			reportStep("The element with the xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is disabled in the appication");
			reportStep("The element with the xpath "+xpath+" is disabled in the appication", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not stable in the application");
			reportStep("The element with the xpath "+xpath+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not interactable in the application");
			reportStep("The element with the xpath "+xpath+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" holding the dropdown visible text "+value+" is not selected due to unknown error");
			reportStep("The element with xpath "+xpath+" holding the dropdown visible text "+value+" is not selected due to unknown error", "fail");
		}
	
	}


	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementByXPath(xpath);
			Select sel = new Select(element);
			sel.selectByIndex(value);
			// System.out.println("The element with xpath "+xpath+" holding the index "+value+" is successfully selected");
			reportStep("The element with xpath "+xpath+" holding the index "+value+" is successfully selected", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the xpath "+xpath+" is not found in the DOM");
			reportStep("The element with the xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not visible in the application");
			reportStep("The element with the xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is disabled in the appication");
			reportStep("The element with the xpath "+xpath+" is disabled in the appication", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not stable in the application");
			reportStep("The element with the xpath "+xpath+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not interactable in the application");
			reportStep("The element with the xpath "+xpath+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" holding the index "+value+" is not selected due to unknown error");
			reportStep("The element with xpath "+xpath+" holding the index "+value+" is not selected due to unknown error", "fail");
		}
		
	}
	
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String>allWinId = driver.getWindowHandles();
	
			for(String eachId:allWinId) {
				driver.switchTo().window(eachId);
				break;
			}
			// System.out.println("Successfully switched to parent window");
			reportStep("Successfully switched to parent window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The parent window is not available to switch");
			reportStep("The parent window is not available to switch", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("Cannot switch to the parent window due to unknown error");
			reportStep("Cannot switch to the parent window due to unknown error", "fail");
		}
	}

	
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String>allWinId = driver.getWindowHandles();
			
			for(String eachId:allWinId) {
				driver.switchTo().window(eachId);
			}
			// System.out.println("The control is moved to the last window successfully");
			reportStep("The control is moved to the last window successfully", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			// System.err.println("The last window is not available to switch");
			reportStep("The last window is not available to switch", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("Cannot switch to the last window due to unknown error");
			reportStep("Cannot switch to the last window due to unknown error", "fail");
		}
	}

	
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			// System.out.println("The opened alert is accepted successfully");
			reportStep("The opened alert is accepted successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("Alert is not avaialble to accept");
			reportStep("Alert is not avaialble to accept", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The open alert is not accepted due to unknown error");
			reportStep("The open alert is not accepted due to unknown error", "fail");
		}
	}

	
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			// System.out.println("The opened alert is dismissed successfully");
			reportStep("The opened alert is dismissed successfully", "pass");
		}catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("Alert is not avaialble to dismiss");
			reportStep("Alert is not avaialble to dismiss", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The opened alert is not dismissed due to unknown error");
			reportStep("The opened alert is not dismissed due to unknown error", "fail"); 
		}
	}

	
	public String getAlertText() {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
			// System.out.println("The text of the alert "+text+" is successfully returned");
			reportStep("The text of the alert "+text+" is successfully returned", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("Alert is not avaialble to return the text");
			reportStep("Alert is not avaialble to return the text", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The text of the alert is not returned");
			reportStep("The text of the alert is not returned", "fail");
		}return text;
	}

	
	public long takeSnap() {
		// TODO Auto-generated method stub
		long snapNumber = 0 ;
		try {
			snapNumber = (long) (Math.floor(Math.random()*100000000)+100000);
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+snapNumber+".png");
			FileUtils.copyFile(temp,dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			reportStep("Cannot take the screenshot", "fail", false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			reportStep("The snapshot of the browser cannot be taken due to failed or interrupted I/O operations.", "fail", false);
		}
		
		return snapNumber;
	}

	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			// System.out.println("The active browser is closed successfully");
			reportStep("The active browser is closed successfully", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The active browser is not closed due to unknown error");
			reportStep("The active browser is not closed due to unknown error", "fail", false);
		}
	}

	
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			// System.out.println("All the browers are closed successfully");
			reportStep("All the browers are closed successfully", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("All the browsers are not closed due to unknown error");
			reportStep("All the browsers are not closed due to unknown error", "fail", false);
		}
	}


	public void waitTime(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void pageDownXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).sendKeys(Keys.PAGE_DOWN);
			// System.out.println("The element with the xpath "+xpathVal+" has performed the page down operation successfully");
			reportStep("The element with the xpath "+xpathVal+" has performed the page down operation successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with the xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with the xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with the xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with the xpath "+xpathVal+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpathVal+" not performed the page down operation due to unknown error");
			reportStep("The element with the xpath "+xpathVal+" not performed the page down operation due to unknown error", "fail");
		}
	}


	public void mouseHoverByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			
			WebElement element = driver.findElementByXPath(xpath);
			
			builder.moveToElement(element).perform();
			
			// System.out.println("The element with xpath "+xpath+" is mousehovered successfully");
			reportStep("The element with xpath "+xpath+" is mousehovered successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// System.err.println("The element with the xpath "+xpath+" is not found in the DOM");
			reportStep("The element with the xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not visible in the application");
			reportStep("The element with the xpath "+xpath+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not stable in the application");
			reportStep("The element with the xpath "+xpath+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with the xpath "+xpath+" is not interactable in the application");
			reportStep("The element with the xpath "+xpath+" is not interactable in the application", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application");
			reportStep("The element with xpath "+xpath+" is not interactable due to an unexpected alert in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath+" cannot be mousehovered due to unknown error");
			reportStep("The element with xpath "+xpath+" cannot be mousehovered due to unknown error", "fail");
		}
				
	}
	
	public void tab(String xpath) {
		try {
			driver.findElementByXPath(xpath).sendKeys(Keys.TAB);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
