/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktpm;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.testng.reporters.jq.Main;
/**
 *
 * @author ADMIN
 */
public class DangNhapAD {
     public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "http://localhost:81/web2dt/web2dt/admindt/login.php";
      driver.get(url);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //getting color attribute with getCssValue()
      //Xpath=//tagname[@attribute='value'] định dạng Xpath
      System.out.println("Tieu de trang " + driver.getTitle()); 
      String colrcontainer = driver.findElement(By.className("container-login100")).getCssValue("color");
      String bckgclrcontainer = driver.findElement(By.className("container-login100")).getCssValue("background-color");
      System.out.println("Màu chữ container "+ colrcontainer);
      System.out.println("Màu nền container " + bckgclrcontainer);
      String hexcolorcontainer = Color.fromString(bckgclrcontainer).asHex(); //converted Into HexFormat
      System.out.println(hexcolorcontainer);
      WebElement containerlogin100 = driver.findElement(By.className("container-login100"));
      System.out.println("Độ rộng container-login100 "+ containerlogin100.getSize().width);
      System.out.println("Độ cao container-login100 "+ containerlogin100.getSize().height);
      
      String colrwrap = driver.findElement(By.className("wrap-login100")).getCssValue("color");
      String bckgclrwrap = driver.findElement(By.className("wrap-login100")).getCssValue("background-color");
      System.out.println("Màu chữ wrap " + colrwrap);
      System.out.println("Màu nền wrap " + bckgclrwrap);
      String hexcolorwrap = Color.fromString(bckgclrwrap).asHex(); //converted Into HexFormat
      System.out.println(hexcolorwrap);
      WebElement wraplogin100 = driver.findElement(By.className("container-login100"));
      System.out.println("Độ rộng wrap-login100 "+ wraplogin100.getSize().width);
      System.out.println("Độ cao wrap-login100 "+ wraplogin100.getSize().height);
      
      String colrlogin100formtitle = driver.findElement(By.className("login100-form-title")).getCssValue("color");
      System.out.println("Màu chữ login100formtitle " + colrlogin100formtitle);
      WebElement login100formtitle = driver.findElement(By.className("login100-form-title"));
      System.out.println("Độ rộng login100-form-title "+ login100formtitle.getSize().width);
      System.out.println("Độ cao login100-form-title "+ login100formtitle.getSize().height);
      
//      String colrlogin100picjstilt = driver.findElement(By.className("login100-pic.js-tilt")).getCssValue("color");
//      System.out.println("Màu chữ login100-pic js-tilt " + colrlogin100formtitle);
//      WebElement login100picjstilt = driver.findElement(By.className("login100-pic.js-tilt"));
//      System.out.println("Độ rộng login100-pic js-tilt  "+ login100picjstilt.getSize().width);
//      System.out.println("Độ cao login100-pic js-tilt  "+ login100picjstilt.getSize().height);

      String colrinput100 = driver.findElement(By.className("input100")).getCssValue("color");
      String bckgclrinput100 = driver.findElement(By.className("input100")).getCssValue("background-color");
      System.out.println("Màu chữ input100 " + colrinput100);
      System.out.println("Màu nền input100 " + bckgclrinput100);
      String hexcolorinput100 = Color.fromString(bckgclrinput100).asHex(); //converted Into HexFormat
      System.out.println(hexcolorinput100);
      WebElement input100 = driver.findElement(By.className("input100"));
      System.out.println("Độ rộng input100 "+ input100.getSize().width);
      System.out.println("Độ cao intput100 "+ input100.getSize().height);
      
      String colrlogin100formbtn = driver.findElement(By.className("login100-form-btn")).getCssValue("color");
      String bckgclrlogin100formbtn = driver.findElement(By.className("login100-form-btn")).getCssValue("background-color");
      System.out.println("Màu chữ login100formbtn " + colrlogin100formbtn);
      System.out.println("Màu nền login100formbtn " + bckgclrlogin100formbtn);
      String hexcolorlogin100formbtn = Color.fromString(bckgclrlogin100formbtn).asHex(); //converted Into HexFormat
      System.out.println(hexcolorlogin100formbtn);
      WebElement login100formbtn = driver.findElement(By.className("login100-form-btn"));
      System.out.println("Độ rộng login100-form-btn " + login100formbtn.getSize().width);
      System.out.println("Độ cao login100-form-btn " + login100formbtn.getSize().height);
      driver.close();
     }
     
    
}
