package tool;

/*
 * This class is for compressing the given string
 * by expressing with characters and the number of appearance of sequential characters
 */
public class StringCompressor {
	
//	public static void main(String args[]) {
//		StringCompressor sc = new StringCompressor();
//		System.out.println(sc.stringConpress("abcdef"));
//	}
	
	/*
	 * compress the given string by replacing sequential characters with a number
	 * if the length of the compressed string is greater than the length of the given string, then return the given one
	 * @param String str
	 * @return String sb.toString()
	 */
	public String stringConpress(String str) {

		StringBuffer sb = new StringBuffer();
		char[] char_arr = str.toCharArray();
		
		// initialize
		char target = char_arr[0];
		int count = 1;
		
		// compress
		for (int i=1; i<str.length(); i++) {
			
			// case that current index is at the end of the given string 
			if (i == str.length()-1) {
				sb.append(String.valueOf(target) + count);
				count = 1;
				if (target != char_arr[i]) {
					sb.append(String.valueOf(char_arr[i]) + count);				
				}
			}
			
			// case that current index is NOT at the end of given string
			else {
				if (target == char_arr[i]) {
					count++;
				} else {
					sb.append(String.valueOf(target) + count);
					target = char_arr[i];
					count = 1;				
				}
			}
		}
		
		// if the length of compressed string is greater than given one, return given one
		if ((sb.toString()).length() > str.length()) {
			return str;
		} else {
			return sb.toString();
		}
		
	}
}
