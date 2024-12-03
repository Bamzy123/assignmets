import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CapitalLetterTest {

	@Test
	public void CheckForCapitalLetterTest() {
	//Given
	String input = "hello, how are you?";

	//Action
	String result = CapitalLetter.toUpperCaseString(input);
	String expected = "HELLO, HOW ARE YOU?";

	//Assert
	assertEquals(expected, result);

	}
	
	@Test
	public void CheckForEmptyStringTest() {
	//Given
	String input = "";

	//Action
	String result = CapitalLetter.toUpperCaseString(input);

	//Assert
	assertEquals("", result);
}
}