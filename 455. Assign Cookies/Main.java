import java.util.Arrays;

public class Main {

    public int findContentChildren(int[] g, int[] s) {
        // Sort the arrays in ascending order
        Arrays.sort(g);
        Arrays.sort(s);

        int m = g.length; // Number of children
        int n = s.length; // Number of available content
        int i = 0; // Index for children array
        int j = 0; // Index for content array

        // Iterate through both arrays
        while (i < m && j < n) {
            // If the current content size is greater than or equal to the current child's greed factor
            if (s[j] >= g[i]) {
                // Move to the next child
                i++;
            }
            // Move to the next content size, regardless of whether the current child's greed is satisfied or not
            j++;
        }

        // The value of 'i' represents the maximum number of content children that can be satisfied
        return i;
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] childrenGreed = {1, 2, 3};
        int[] contentSizes = {1, 1, 2};

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Call the findContentChildren method
        int satisfiedChildren = solution.findContentChildren(childrenGreed, contentSizes);

        // Print the result
        System.out.println("Maximum number of content children that can be satisfied: " + satisfiedChildren);
    }
}
