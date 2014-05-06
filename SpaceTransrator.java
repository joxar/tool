package tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * This class is for translating space into string "%20" (exclude space(s) before the end of the given statement 
 */
public class SpaceTransrator {
	private String result = "";
	
	/*
	 * @param String str
	 * @return String result
	 */
	public String spaceTransrator(String str) {
		
		String regex = " ";
		String regex2 = "(%20)+$";
		
		// translate all space in the given statement into "%20"
		Pattern ptn = Pattern.compile(regex);
		Matcher mtc = ptn.matcher(str);
		result = mtc.replaceAll("%20");
		
		// translate "%20"s which before the end of the given statement into blank	
		Pattern ptn2 = Pattern.compile(regex2);
		Matcher mtc2 = ptn2.matcher(result);
		result = mtc2.replaceFirst("");
		
		return result;
	}
	
//	public static void main(String args[]) {
//		SpaceTransrator se = new SpaceTransrator();
//		System.out.println(se.spaceTransrator("a b c                  "));
//	}
	
}
