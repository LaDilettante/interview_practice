
public class ReplaceSpace {
	public static String replaceSpace(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				sb.append(s.charAt(i));
			} else {
				sb.append("\\%20");
			}
		}
		return sb.toString();
	}
	
	public static void replaceSpace2(char[] s, int length) {
		int spaceCount = 0;
		for (int i = 0; i < length; i++) {
			if (s[i] == ' ') spaceCount++;
		}
		int newLength = length + spaceCount * 2;
		for (int j = length - 1; j >= 0; j--) {
			if (s[j] == ' ') {
				s[newLength - 1] = '0';
				s[newLength - 2] = '2';
				s[newLength - 3] = '%';
				newLength -= 3;
			} else {
				s[newLength - 1] = s[j];
				newLength -= 1;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(replaceSpace("abc def "));;
		char[] sTest = new char[]{'a', 'b', ' ', 'c', '*', '*'};
		replaceSpace2(sTest, 4);
		System.out.println(sTest);
	}
}
