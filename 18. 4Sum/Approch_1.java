import java.util.*;

public class Approch_1 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum=(long)nums[i]+nums[j];
                        sum+=nums[k];
                        sum+=nums[l];

                        if(sum==target){
                            List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
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