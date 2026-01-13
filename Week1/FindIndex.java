package Week1;

public class FindIndex {
    public static int strStr(String haystack, String needle) {
        int hIdx = 0, nIdx = 0;
        while (hIdx < haystack.length()) {

            if (haystack.charAt(hIdx) == needle.charAt(nIdx)) {
                nIdx++;
            } else {
                hIdx = hIdx - nIdx;
                nIdx = 0;
            }

            if (nIdx == needle.length()) {
                return hIdx - nIdx + 1;
            }

            hIdx++;
        }
        return -1;

    }

    public static void main(String args[]) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
