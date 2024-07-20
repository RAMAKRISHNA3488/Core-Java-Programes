package LeetCode;

public class FirstOccurrenceString {
    public static void main(String[] args) {
        
        String s = "leetcode";
        char c = 'e';
        System.out.println(firstUniqChar(s,c));
    }
    // public static int firstUniqChar(String s) {
    //     int[] count = new int[26];
    //     for (int i = 0; i < s.length(); i++) {
    //         count[s.charAt(i) - 'a']++;
    //     }
    //     for (int i = 0; i < s.length(); i++) {
            
    //         if (count[s.charAt(i) - 'a'] == 1) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int firstUniqChar(String s, char c) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }   

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == c) {
                if (count[c - 'a'] == 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
