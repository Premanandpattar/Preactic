package practic;

import java.util.Random;

import org.testng.annotations.Test;

public class FirstTest {
	@Test
	public void firstTest() {
		System.out.println("im first");
		System.out.println(System.getProperty("b"));
		System.out.println("im exxected with referance number---->>>"+new Random().nextInt(100000));
	}
	
	
}
