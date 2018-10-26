import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

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

    // https://leetcode.com/problems/intersection-of-two-arrays/description/
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet hs = new HashSet();
        ArrayList<Integer> result = new ArrayList();

        for(int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(hs.contains(nums2[i])) {
                result.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }

        int[] intResult = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            intResult[i] = result.get(i);
        }

        return intResult;
    }

    public static void main(String[] args) {

        System.out.println("893. Groups of Special-Equivalent Strings: " + numSpecialEquivGroups(new String[] {"aa", "ab", "ba", "bb"}));

        System.out.print("349. Intersection of Two Arrays: ");
        int[] result = intersection(new int[] {1, 2, 3}, new int[] {2, 3, 4});
        for(int x: result) {
            System.out.print(x + " ");
        }
        System.out.println();


    }
}
