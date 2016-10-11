
public class ReverseString {
	public String reverseString(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < Math.floor((s.length() - 2) / 2); i++) {
			char tmp = arr[s.length() -2 -i];
			arr[s.length() - 2 - i] = arr[i];
			arr[i] = tmp;
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		ReverseString a = new ReverseString();
		System.out.println(a.reverseString("abcd "));
		System.out.println(a.reverseString("abc "));
		System.out.println(a.reverseString(""));
	}
}
