package Drugi.Zadania.MaturaIT;

public class Palindrom {
    static boolean isPalindrome(String s) {

	for (int i = 0; i < s.length() / 2; i++) {
	    if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
		return false;
	    }
	}
	return true;
    }

    public static void main(String[] args) {
	System.out.println(isPalindrome("kajak"));
    }
}
