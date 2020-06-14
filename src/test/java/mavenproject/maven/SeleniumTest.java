package mavenproject.maven;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void Webtest() {
		System.out.println("web test");
	}
	@Test
	public void application() {
		System.out.println("Application test");
		System.out.println("Successfully tested Apllication");
	}
	
	@Test
	public void Login() {
		System.out.println("Enter username and password ");
		System.out.println("Validate Login Page");
	}
	

}
