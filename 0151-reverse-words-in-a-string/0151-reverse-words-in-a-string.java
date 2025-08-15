class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+"); // Remove extra spaces and split into words
        String ans = "";
        
        // Append words in reverse order
        for (int i = a.length - 1; i > 0; i--) {
            ans += a[i] + " ";
        }
        
        return ans + a[0]; // Add the first word without trailing space
    }
}