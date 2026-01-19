package Week1.Challenge;

import java.util.*;

public class RemoveTheSubstring {
    public static boolean isSub(String t, String str) {
        int tIdx = 0;
        int strIdx = 0;
        while (strIdx < str.length()) {
            if (str.charAt(strIdx) == t.charAt(tIdx)) {
                tIdx++;
            }
            if (tIdx == t.length())
                return true;
            strIdx++;
        }
        return false;
    }

    public static int find(String s, String t) {
        if (s.length() == t.length())
            return 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(0, i) + s.substring(j);

                if (isSub(t, str)) {
                    max = Math.max(j - i, max);
                }

            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(find(s, t));
    }
}
