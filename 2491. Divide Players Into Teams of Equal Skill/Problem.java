class Problem {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);
        int target = skill[0] + skill[n - 1];

        int i = 0;
        int j = n - 1;
        long res = 0;

        while(i <= j){
            int cal = skill[i] + skill[j];

            if(cal != target){
                return -1;
            }else{
                res += skill[i] * skill[j];
            }
            i++;
            j--;
        }

        return res;
    }
}