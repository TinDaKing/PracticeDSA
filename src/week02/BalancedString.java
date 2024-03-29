package week02;

import java.util.HashSet;
import java.util.Set;

public class BalancedString {
    public int solution(String S) {
        int shortestFragmentLength = -1;
        for (int i = 2; i <= S.length(); i++) {
            for (int j = 0; j <= S.length()-i; j++) {
                String substring = S.substring(j, j+i);
                if (isBalanced(substring)) {
                    System.out.println("Sub string: "+substring);
                    return substring.length();
                }
            }
        }
        return shortestFragmentLength;
    }

    private boolean isBalanced(String S) {
        Set<Character> uppercaseLetters = new HashSet<>();
        Set<Character> lowercaseLetters = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseLetters.add(c);
            } else {
                lowercaseLetters.add(c);
            }
        }
        for (char uppercaseLetter : uppercaseLetters) {
            if (!lowercaseLetters.contains(Character.toLowerCase(uppercaseLetter))) {
                return false;
            }
        }
        for (char lowercaseLetter : lowercaseLetters) {
            if (!uppercaseLetters.contains(Character.toUpperCase(lowercaseLetter))) {
                return false;
            }
        }
        return true;
    }


}
