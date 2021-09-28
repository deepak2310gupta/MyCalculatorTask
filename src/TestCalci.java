import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalci {

	public  void emptyStringReturnsZeroSum() throws Exception {
		StringCalculator obj=new StringCalculator();
		assertEquals(obj.add(""),0);
	}
	
	public void twoNumbersCommaDelimitedSum() throws Exception {
		StringCalculator obj=new StringCalculator();
		assertEquals(obj.add("3,6"),9);
	}
	
	public void twoNumbersNewLineDelimitedSum() throws Exception {
		StringCalculator obj=new StringCalculator();
		assertEquals(obj.add("2\n5"),7);
	}
	
	public void twoNumbersBothWaysSum() throws Exception {
		StringCalculator obj=new StringCalculator();
		assertEquals(obj.add("1\n2,3"),6);
	}
	
	
	public void ignoreNumbersGreaterthan1000Sum() throws Exception {
		StringCalculator obj=new StringCalculator();
		assertEquals(obj.add("23\n11,1003,34"),68);
	}
	
	public void supportDifferentDelimiterSum() throws Exception{
		StringCalculator obj=new StringCalculator();
		assertEquals(obj.add("//;\n1;2"),3);
	}
	
	public void threeNumbersDelimiterSum() throws Exception{
		StringCalculator obj=new StringCalculator();
		assertEquals(obj.add("4,6\n5"),15);
	}

}
