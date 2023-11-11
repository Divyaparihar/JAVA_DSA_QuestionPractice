package Strings;

import java.util.Scanner;

public class String_SubstringGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	
    	String input = sc.next();

        generateSubstrings(input);
    }

    public static void generateSubstrings(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = str.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}

