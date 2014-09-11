package StringFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {
 public String replaceBlank(Object obj){
	 String value = "";
		Pattern p = Pattern.compile("\'|\\s*|\t|\r|\n");
		if(obj != null ) {
			value = obj.toString();
			Matcher m = p.matcher(value);
			value = m.replaceAll("");
		}
		return value;
 }
}
