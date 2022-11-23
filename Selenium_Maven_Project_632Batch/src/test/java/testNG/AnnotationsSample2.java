package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsSample2 {
	@AfterClass // Post-condition
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@BeforeClass // Pre-condition
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@Test // Actual Functional steps
	public void p() {
		System.out.println("@Test p");
	}

	@Test // Actual Functional steps
	public void k() {
		System.out.println("@Test k");
	}

	@Test // Actual Functional steps
	public void b() {
		System.out.println("@Test b");
	}

}
