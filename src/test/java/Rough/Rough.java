package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestBase.TestBase;

public class Rough extends Rough2 {
	
	public static void main(String[] args) {
       Abc();		
       
       Abcd();
       
	}
	public static void Abc() {
		
		System.out.println("Hi2");
	}
}

