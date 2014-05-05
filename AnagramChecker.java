package tool;

/*
 * This class is for checking whether given strings are anagrams
 */
public class AnagramChecker {
	
	private String str_x = "";
	private String str_y = "";
	
	/*
	 * Constructor
	 * @param String str_x
	 * @param String str_y
	 */
	public AnagramChecker(String str_x, String str_y) {
		this.str_x = str_x;
		this.str_y = str_y;
	}
	
	/*
	 * sort given strings as in character arrays and check whether those are the same strings
	 * @param String x
	 * @param String y
	 * @return boolean true:given strings are anagrams false:are not anagrams
	 */
	public boolean anagramChecker(String x, String y) {
		
		char[] x_arr = new char[x.length()];
		char[] y_arr = new char[y.length()];
		
		try {
			
			// get given strings into each charArrays
			x_arr = x.toCharArray();
			y_arr = y.toCharArray();
		
			// sort given strings
			java.util.Arrays.sort(x_arr);
			java.util.Arrays.sort(y_arr);
		
			// if sorted string are the same, return true, else return false
			return (new String(x_arr).equals(new String(y_arr))) ? true : false;
			
		} catch (Exception e) {
			throw e;
		}
	}
	
}
