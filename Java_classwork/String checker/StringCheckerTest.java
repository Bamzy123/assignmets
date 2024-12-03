import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class StringCheckerTest {
	@Test
	public void CheckForStringTest () {
	
	//Given
	StringChecker stringChecker = new StringChecker();

	//Action
	String text = "The quick brown fox jumps over the lazy dog";
	Boolean expected = true;
	Boolean actual = stringChecker.isString(text);
	//Check
	assertEquals(actual, expected);
	}
}