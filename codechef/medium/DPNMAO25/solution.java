import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a') countA++;
            else if (c == 'e') countE++;
            else if (c == 'i') countI++;
            else if (c == 'o') countO++;
            else if (c == 'u') countU++;
        }

        int maxCount = countA;
        char maxVowel = 'a';

        if (countE > maxCount) { maxCount = countE; maxVowel = 'e'; }
        if (countI > maxCount) { maxCount = countI; maxVowel = 'i'; }
        if (countO > maxCount) { maxCount = countO; maxVowel = 'o'; }
        if (countU > maxCount) { maxVowel = 'u'; }

        System.out.println(maxVowel);
    }
}