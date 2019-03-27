package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public int add(String text) {
			if(text == null || text.isEmpty()) {
				return 0;
			}
			
			if(text.contains(",") && !text.contains(";")) {
				String[] values = text.split(",");
				int sum = 0;
				for(String value : values) {
					sum += Integer.parseInt(value);
				}
				return sum;
			}
			
			if(text.contains(";") && !text.contains(",")){
				String[] values = text.split(";");
				int sum = 0;
				for(String value : values) {
					sum += Integer.parseInt(value);
				}
				return sum;
			}
			
			if(text.contains(";") && text.contains(",")) {
				String values[] = text.split(",||;");				//ERROR !
				int sum = 0;
				for(String value : values) {
					sum += Integer.parseInt(value);
				}
				return sum;
			}
			
			if(text.contains("//(.)\n")) {
				Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
				if(m.find()) {
					String delimiterString = m.group(1);
					String[] values = m.group(2).split(delimiterString);
					int sum = 0;
					for(String value : values) {
						sum += Integer.parseInt(value);
					}
					return sum;
				}
			}
		return Integer.parseInt(text);
		
	}

}
