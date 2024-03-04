class Problem {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        Arrays.sort(tokens);

        int left = 0;
        int right = n-1;
        int score = 0;
        int maxScore = 0;

        while(left <= right){
            if(score >= 1 && power < tokens[left]){
                power += tokens[right];
                score--;
                right--;
            }
            else if(power >= tokens[left]){
                power -= tokens[left];
                left++;
                score++;
                maxScore = Math.max(maxScore,score);
            }else{
                break;
            }
        }
        return maxScore;
    }
}