import java.util.*;

public class Approch_1 {

    static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static String frequencySort(String s) {
        int[] arr = new int[128]; // 128 to cover the entire ASCII range

        for (char ch : s.toCharArray()) {
            arr[ch]++;
        }

        LinkedList<Pair> freq = new LinkedList<>();

        for (int i = 0; i < 128; i++) { // Iterate through the entire ASCII range
            if (arr[i] > 0) {
                freq.add(new Pair((char) i, arr[i]));
            }
        }

        Collections.sort(freq, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return b.count - a.count;
            }
        });

        StringBuilder result = new StringBuilder("");

        for (Pair p : freq) {
            int count = p.count;
            while (count-- > 0) {
                result.append(p.ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "tree";

        System.out.print(frequencySort(str));
    }
}
