
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;

public class StringCalculator {
	
	
	public  final String delimiter=",|\n";
	public   int add(String input) throws Exception {
		if(input.isEmpty())
			return 0;
		else {
			String numbers[]=input.split(delimiter);
			if(usesCustomDelimiterSyntax(input)) {
				String myVal[]=getSumUsingCustomDelimiter(input);
				return mySum(myVal);
			}
			else
			return mySum(numbers);
		}
	}
    public  int mySum(String numbers[]) throws Exception{
		int sum=0;
		checkNegativeThreatNumbers(numbers);
		for(String current:numbers) {
			if(Integer.parseInt(current)>1000)
				continue;
			sum+=Integer.parseInt(current);
		}
		return sum;
	}
    public  void checkNegativeThreatNumbers(String numbers[]) throws Exception {
		for(String current:numbers) {
			if(Integer.parseInt(current)<0)
				throw new Exception("Negatives Not Allowed");
		}
	}
	public  boolean usesCustomDelimiterSyntax(String str) {
		return str.startsWith("//");
	}
    public String[] getSumUsingCustomDelimiter(String s) {
		Matcher m=Pattern.compile("//(.)\n(.*)").matcher(s);
		m.matches();
		String cstmdelim=m.group(1);
		String num=m.group(2);
		return num.split(Pattern.quote(cstmdelim));
	}


}
