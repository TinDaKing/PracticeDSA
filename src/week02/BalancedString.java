package week02;

import java.util.HashSet;
import java.util.Set;

public class BalancedString {
    public int solution(String S) {
        int shortestFragmentLength = -1;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String substring = S.substring(i, j);
                if (isBalanced(substring)) {
                    if (shortestFragmentLength == -1) {
                        shortestFragmentLength = j - i;
                    }
                    shortestFragmentLength = Math.min(shortestFragmentLength, j - i);
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
