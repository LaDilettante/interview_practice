public class Anagram {
	public boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		int[] letterMap1 = new int[256];
		int[] letterMap2 = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			letterMap1[s1.charAt(i)]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			letterMap2[s2.charAt(i)]++;
		}
		
		for (int j = 0; j < 256; j++) {
			if (letterMap1[j] != letterMap2[j]) return false;
		}

		return true;
	}
	
	public static void main(String[] args) {
		Anagram tmp = new Anagram();
		System.out.println(tmp.checkAnagram("lump", "plum"));
		System.out.println(tmp.checkAnagram("abc", "abcd"));
		System.out.println(tmp.checkAnagram("abcd", "abbd"));
		System.out.println(tmp.checkAnagram("", ""));
		System.out.println(tmp.checkAnagram(" ", "  "));
		
	}
}
