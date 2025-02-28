class problem {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];

        for(int index1 = 1; index1 <= m; index1++){
            for(int index2 = 1; index2 <= n; index2++){
                if(str1.charAt(index1 - 1) == str2.charAt(index2 - 1)){
                    dp[index1][index2] = 1 + dp[index1 - 1][index2 - 1];
                }else{
                    dp[index1][index2] = Math.max(dp[index1 - 1][index2], dp[index1][index2 - 1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        int index1 = m;
        int index2 = n;

        while(index1 > 0 && index2 > 0){
            if(str1.charAt(index1 - 1) == str2.charAt(index2 - 1)){
                char ch = str1.charAt(index1 - 1);
                sb.append(ch);
                index1--;
                index2--;
            }
            else if(dp[index1 - 1][index2] > dp[index1][index2 - 1]){
                char ch = str1.charAt(index1 - 1);
                sb.append(ch);
                index1--;
            }else{
                char ch = str2.charAt(index2 - 1);
                sb.append(ch);
                index2--;
            }
        }

        while(index1 > 0){
            char ch = str1.charAt(index1 - 1);
            sb.append(ch);
            index1--;
        }

        while(index2 > 0){
            char ch = str2.charAt(index2 - 1);
            sb.append(ch);
            index2--;
        }

        return sb.reverse().toString();
    }
}