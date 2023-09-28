import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && map.containsKey(0)) {
                res[0] = i;
                res[1] = map.get(0);
                return res;
            }

            else if (map.containsKey(target - nums[i])) {
                if (map.get(target - nums[i]) > i) {
                    res[0] = i;
                    res[1] = map.get(target - nums[i]);
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String [] args){
        int[] arr={2,7,11,15};
        int target=9;

     System.out.print(Arrays.toString(twoSum(arr,target)));
    }
}