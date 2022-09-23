package practic;

import java.util.Random;

import org.testng.annotations.Test;

public class SecondTest {

	@Test
	public void secondTest() {
		System.out.println("im second");
		System.out.println(System.getProperty("u"));
		System.out.println("im exxected with referance number---->>>"+new Random().nextInt(100000));
	}
}
