import java.util.HashSet;
import java.util.Arrays;

public class LeetCode {

    // https://leetcode.com/problems/groups-of-special-equivalent-strings/description/
    public static int numSpecialEquivGroups(String[] A) {
        HashSet hs = new HashSet();

        for(String S: A) {
            int[] charCount = new int[52];
            for(int i = 0; i < S.length(); i++) {
                charCount[S.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            hs.add(Arrays.toString(charCount));
        }

        return hs.size();
    }

    public static void main(String[] args) {
        System.out.println("893. Groups of Special-Equivalent Strings: " + numSpecialEquivGroups(new String[] {"aa", "ab", "ba", "bb"}));
    }
}
