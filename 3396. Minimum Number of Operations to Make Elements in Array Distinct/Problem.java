class Problem {
    public int minimumOperations(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        int operations = 0;

        while (!isDistinct(numList)) {
            int removeCount = Math.min(3, numList.size());
            for (int i = 0; i < removeCount; i++) {
                numList.remove(0);
            }
            operations++;
        }

        return operations;
    }
    
    private boolean isDistinct(List<Integer> nums) {
        Set<Integer> uniqueSet = new HashSet<>(nums);
        return uniqueSet.size() == nums.size();
    }
}