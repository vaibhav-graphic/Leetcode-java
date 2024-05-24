class Problem {
    private int maxScore;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        maxScore = Integer.MIN_VALUE;

        int[] freq = new int[26];

        for (char ch : letters) {
            freq[ch - 'a']++;
        }

        solve(0, words, score, freq, 0);
        return maxScore;
    }

    private void solve(int index, String[] words, int[] score, int[] freq, int currScore) {
        maxScore = Math.max(maxScore, currScore);

        if (index >= words.length) {
            return;
        }

        int j = 0;
        int[] tempFreq =  Arrays.copyOf(freq, freq.length);
        int tempScore = 0;
        String str = words[index];

        while (j < str.length()) {
            char ch = str.charAt(j);

            tempFreq[ch - 'a']--;
            tempScore += score[ch - 'a'];

            if (tempFreq[ch - 'a'] < 0) {
                break;
            }
            j++;
        }

        if (j == str.length()) {
            solve(index + 1, words, score, tempFreq,currScore + tempScore);
        }

        solve(index + 1, words, score, freq, currScore);
    }
}