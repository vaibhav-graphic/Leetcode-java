import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Approch_2 {
    public static  List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> hashset=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int sum=nums[i]+nums[j];
                    sum+=nums[k];
                    long fourth=target-sum;

                    if(hashset.contains(fourth)){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        temp.sort(Integer::compareTo);
                        st.add(temp);
                    }
                    hashset.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> res=new ArrayList<>(st);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = fourSum(nums, target);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
