package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsSample3 {
	@Test
	public void e() {
		System.out.println("@Test e");
	}
	@Test
	public void b() {
		System.out.println("@Test b");
	}
	@Test
	public void k() {
		System.out.println("@Test k");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

}
